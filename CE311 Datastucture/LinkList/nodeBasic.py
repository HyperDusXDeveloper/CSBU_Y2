# Blue Print
class Node:
    def __init__(self, data):
        self.data = data  # ตัวแปรสำหรับเก็บข้อมูล
        self.next = None  # ตัวแปรสำหรับชี้ไปที่ Node ถัดไป

# สร้าง Node
node1 = Node("DataVAl")
node2 = Node(20)
node3 = Node(30)
node4 = Node(40)
node5 = Node(50)

# เชื่อมต่อ Node
node1.next = node2
node2.next = node3
node3.next = node5

cur = node1
aftercur = node2


while cur is not None :
    print(cur.data)
    cur = cur.next

