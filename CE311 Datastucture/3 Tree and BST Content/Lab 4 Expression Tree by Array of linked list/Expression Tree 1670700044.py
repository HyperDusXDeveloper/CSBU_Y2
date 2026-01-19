class Node:
    def __init__(self, value, left_idx=None, right_idx=None):
        self.value = value
        self.left = left_idx 
        self.right = right_idx 

class ExpressionTree:
    def __init__(self):
        self.nodes = []
        self.root_idx = None

    def new_node(self, value, left=None, right=None):
        self.nodes.append(Node(value, left, right))
        return len(self.nodes) - 1

    def is_operator(self, char):
        return char in ['+', '-', '*', '/']

    def build_tree(self, expression):
        tokens = expression.strip().split()
        if not tokens: return

        stack = []
        if self.is_operator(tokens[0]): 
            print(f"Detected Input Type: Prefix")
            process_order = reversed(tokens)
            is_prefix = True
        else:
            print(f"Detected Input Type: Postfix")
            process_order = tokens
            is_prefix = False

        for token in process_order:
            if not self.is_operator(token):
                idx = self.new_node(token)
                stack.append(idx)
            else:
                op1_idx = stack.pop()
                op2_idx = stack.pop()
                if is_prefix:
                    idx = self.new_node(token, op1_idx, op2_idx)
                else:
                    idx = self.new_node(token, op2_idx, op1_idx)
                
                stack.append(idx)

        self.root_idx = stack[-1]
    
    def get_infix(self, idx, with_parentheses=False):
        if idx is None: return ""
        node = self.nodes[idx]
        
        left_str = self.get_infix(node.left, with_parentheses)
        right_str = self.get_infix(node.right, with_parentheses)
        
        if node.left is not None and node.right is not None:
            if with_parentheses:
                return f"({left_str}{node.value}{right_str})"
            else:
                return f"{left_str}{node.value}{right_str}"
        else: 
            return str(node.value)

    def get_prefix(self, idx):
        if idx is None: return ""
        node = self.nodes[idx]
        return f"{node.value} {self.get_prefix(node.left)} {self.get_prefix(node.right)}".strip()

    def get_postfix(self, idx):
        if idx is None: return ""
        node = self.nodes[idx]
        return f"{self.get_postfix(node.left)} {self.get_postfix(node.right)} {node.value}".strip()

    def display_results(self):
        if self.root_idx is None: return
        print("-" * 30)
        print(f"Infix (no parens): {self.get_infix(self.root_idx, False)}")
        print(f"Infix (parens):    {self.get_infix(self.root_idx, True)}")
        print(f"Prefix:            {self.get_prefix(self.root_idx)}")
        print(f"Postfix:           {self.get_postfix(self.root_idx)}")
        print("-" * 30)

if __name__ == "__main__":
    
    # Prefix
    input_str1 = "/ * 2 + 3 5 - 9 1"
    print(f"\nInput: {input_str1}")
    tree1 = ExpressionTree()
    tree1.build_tree(input_str1)
    tree1.display_results()

    # Postfix
    input_str2 = "2 3 5 + * 9 1 - /"
    print(f"\nInput: {input_str2}")
    tree2 = ExpressionTree()
    tree2.build_tree(input_str2)
    tree2.display_results()