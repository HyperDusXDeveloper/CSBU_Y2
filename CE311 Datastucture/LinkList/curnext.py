# --- ส่วนที่ 1: สร้างพิมพ์เขียวของ Node และ LinkedList (เหมือนเดิม) ---

class Node:
    """คลาสสำหรับสร้าง "ตู้รถไฟ" (Node) แต่ละตู้"""
    def __init__(self, data):
        self.dataval = data
        self.next = None

class LinkedList:
    """คลาสสำหรับจัดการ "ขบวนรถไฟ" (LinkedList) ทั้งขบวน"""
    def __init__(self):
        self.head = None

    def list_print(self):
        """ฟังก์ชันสำหรับแสดงผลข้อมูลทั้งหมดในขบวนรถไฟ"""
        printval = self.head
        while printval is not None:
            print(printval.dataval, end=" -> ")
            printval = printval.next
        print("None")


# --- ส่วนที่ 2: สร้าง Node และเชื่อมต่อเป็นขบวนที่สมบูรณ์ก่อน ---

# สร้างขบวนรถไฟเปล่าๆ
my_list = LinkedList()

# สร้าง Node ทั้งหมดที่เราต้องใช้ **รวมถึง Node 4 ด้วย**
node1 = Node(1)
node2 = Node(2)
node3 = Node(3)
node4 = Node(4) # สร้าง Node 4 ขึ้นมาแล้ว!
node5 = Node(5)

# เชื่อมต่อทุก Node เข้าด้วยกันเป็นเส้นตรงก่อน
my_list.head = node1
node1.next = node2
node2.next = node3
node3.next = node4  # <<< ตอนนี้ Node 3 ยังเชื่อมกับ Node 4 อยู่
node4.next = node5

print("--- List ก่อนทำการข้าม Node 4 ---")
my_list.list_print()


# --- ✨ ส่วนที่ 3: ปฏิบัติการข้าม Node 4 โดยใช้ Cur และ Afcur! ✨ ---

print("\n--- ✨ เริ่มปฏิบัติการข้าม Node 4! ✨ ---")

# 1. กำหนด "ตัวปัจจุบัน" (cur) ของเรา
# เราต้องการเปลี่ยนเส้นทางของ Node 3 ดังนั้น cur ต้องเป็น Node 3
cur = node3
print(f"ตัวปัจจุบัน (cur) ของเราคือ Node ที่มีข้อมูล: {cur.dataval}")

# 2. กำหนด "ตัวที่จะไปต่อ" (afcur - After Current)
# เราต้องการให้ Node 3 ข้ามไปหา Node 5 ดังนั้น afcur ต้องเป็น Node 5
# เราสามารถหา Node 5 ได้จาก `node4.next` หรือ `cur.next.next`
afcur = node4.next
print(f"เป้าหมายที่จะเชื่อมไป (afcur) คือ Node ที่มีข้อมูล: {afcur.dataval}")

# 3. คำสั่งเปลี่ยนเส้นทาง!
# "ปลดข้อต่อ" ของ cur (Node 3) ที่เคยชี้ไปที่ Node 4
# แล้ว "เอาไปเชื่อมใหม่" กับ afcur (Node 5) แทน
print("กำลังเปลี่ยนเส้นทาง: cur.next = afcur")
cur.next = afcur

# Node 4 ถูก "ลอยแพ" เรียบร้อยแล้ว!
# ถึงแม้ Node 4 จะยังอยู่ในหน่วยความจำ แต่ก็ไม่มีใครในขบวนรถไฟชี้มาหามันอีกต่อไป


# --- ส่วนที่ 4: แสดงผลลัพธ์ (Output) ---

print("\n--- List หลังจากทำการข้าม Node 4 สำเร็จ ---")
my_list.list_print()