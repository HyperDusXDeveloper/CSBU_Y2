public class finalvariable {
    public static void main(String[] args) {
        final int A = 10 ; // ค่าคงที่ (พิมพ์ใหญ่)
        final int B = 20 ;
        // a = 100 เปลี่ยนค่าไม่ได้ The final local variable a cannot be assigned.
        // b = 200 เปลี่ยนค่าไม่ได้ The final local variable a cannot be assigned.
        System.out.println("Final A : " + A);
        System.out.println("Final B : " + B);
    }
    
}