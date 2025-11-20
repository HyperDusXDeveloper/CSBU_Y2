# คลาส Node ยังคงเหมือนเดิม
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

# เพิ่มเมธอด display เข้าไปใน LinkedList
class LinkedList:
    def __init__(self):
        self.head = None

    def display(self):
        # สร้างตัวแปรมาช่วยเดินทาง เริ่มต้นที่หัวขบวน
        current = self.head
        
        # เริ่มต้น vòng lặp (loop) ตราบใดที่ตู้ปัจจุบันยังไม่ใช่ตู้ว่าง
        while current: # บรรทัดนี้เหมือนกับ 'while current is not None:'
            print(current.data, end=" -> ") # พิมพ์ข้อมูลของตู้ปัจจุบัน
            current = current.next # เดินทางไปยังตู้ถ-ัดไป
            
        print("None") # เมื่อจบ loop พิมพ์ None เพื่อบอกว่าสิ้นสุด List

# สร้าง List และ Node
my_list = LinkedList()
node1 = Node(10)
node2 = Node(25)
node3 = Node(50)

# เชื่อมต่อ
my_list.head = node1
node1.next = node2
node2.next = node3

# ลองเรียกใช้เมธอด display
my_list.display()