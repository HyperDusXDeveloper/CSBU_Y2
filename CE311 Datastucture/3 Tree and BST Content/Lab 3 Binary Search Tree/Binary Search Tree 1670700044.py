class Node:
    def __init__(self, value):
        self.value = value  
        self.left = None 
        self.right = None  

class BinarySearchTree:
    def __init__(self):
        self.root = None 

    def add(self, value):
        if self.root is None:
            self.root = Node(value)
        else:
            self._add_recursive(self.root, value)

    def _add_recursive(self, current_node, value):
        if value < current_node.value:
            if current_node.left is None:
                current_node.left = Node(value)
            else:
                self._add_recursive(current_node.left, value)
        elif value > current_node.value:
            if current_node.right is None:
                current_node.right = Node(value)
            else:
                self._add_recursive(current_node.right, value)

    def inorder(self):
        nodes = []
        self._inorder_recursive(self.root, nodes)
        return " ".join(map(str, nodes))

    def _inorder_recursive(self, current_node, nodes):
        if current_node is not None:
            self._inorder_recursive(current_node.left, nodes)
            nodes.append(current_node.value)
            self._inorder_recursive(current_node.right, nodes)

    def delete(self, value):
        self.root = self._delete_recursive(self.root, value)

    def _delete_recursive(self, current_node, value):
        if current_node is None:
            return current_node 

        if value < current_node.value:
            current_node.left = self._delete_recursive(current_node.left, value)
        elif value > current_node.value:
            current_node.right = self._delete_recursive(current_node.right, value)
        else:
            
            if current_node.left is None:
                return current_node.right
            elif current_node.right is None:
                
                return current_node.left
            
            min_node = self._find_min(current_node.right)
            current_node.value = min_node.value
            current_node.right = self._delete_recursive(current_node.right, min_node.value)

        return current_node

    def _find_min(self, node):
        current = node
        while current.left is not None:
            current = current.left
        return current

def main():
    bst = BinarySearchTree()

    def print_status(bst):
        result = bst.inorder()
        if not result:
            print("Empty tree")
        else:
            print(f"      Inorder traversal: {result}")

    print_status(bst)

    commands = [
        "add 5",
        "add 3",
        "add 9",
        "add 12",
        "add 4",
        "add 1",
        "del 5", 
        "add 10",
        "del 9 "
    ]

    for cmd_str in commands:
        print(f"\nCommand: {cmd_str}")  
        parts = cmd_str.split()
        cmd = parts[0]
        value = int(parts[1])

        if cmd == "add":
            bst.add(value)
        elif cmd == "del":
            bst.delete(value)
        
        print_status(bst) 

    print("\nCommand:") 

if __name__ == "__main__":
    main()