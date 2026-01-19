data_in_array = [
    (13, "Ariya", 23),
    (23, "Boonchai", 26),
    (6, "Somsak", 99),
    (2, "Robert", 10),
    (9, "Alberto", 99),
    (13, "Ariya", 77),
    (6, "Somsak", 1),
    (74, "Benjamin", 2),
    (84, "Mark", 68),
    (74, "Benjamin", 98),
    (45, "Peter", 9) ]

class Node:
    def __init__(self, id, name, score):
        self.id = id
        self.name = name
        self.score = score
        self.next_node = None

class SLinkedList:
    def __init__(self):
        self.head_node = None 

    def insert_sorted(self, id, name, score):
        new_node = Node(id, name, score)

        if self.head_node is None or self.head_node.id > new_node.id:
            new_node.next_node = self.head_node
            self.head_node = new_node
            return

        current = self.head_node
        while current.next_node is not None and current.next_node.id <= new_node.id:
            if current.next_node.id == new_node.id:
                current.next_node.score += new_node.score
                return
            current = current.next_node
        
        if self.head_node.id == new_node.id:
            self.head_node.score += new_node.score
            return

        new_node.next_node = current.next_node
        current.next_node = new_node

    def display_list(self):
        printval = self.head_node
        while printval is not None:
            print(f"{printval.id} {printval.name} {printval.score}")
            printval = printval.next_node

my_linked_list = SLinkedList()

for record in data_in_array:
    my_linked_list.insert_sorted(record[0], record[1], record[2])

my_linked_list.display_list()