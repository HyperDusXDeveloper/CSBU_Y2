import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        // 1. สร้าง Collection/List เพื่อเก็บ Instance ของประชาชน
        // เราใช้ List<Person> เพราะ Person เป็นคลาสแม่
        // ทำให้สามารถเก็บได้ทั้ง Person, ThaiPerson, และ OtherPerson
        List<Person> peopleList = new ArrayList<>();

        // 2. สร้าง Instance 5 คนตาม Output
        // (เราจำเป็นต้องมี Constructor (String, int, char) ในทุกคลาส)
        peopleList.add(new Person("1376567820111", 34, 'F'));
        peopleList.add(new Person("3456789078134", 29, 'M'));
        peopleList.add(new ThaiPerson("3456789078134", 29, 'M'));
        peopleList.add(new Person("F8W9867I", 31, 'M'));
        peopleList.add(new OtherPerson("F8W9867I", 31, 'M'));

        // 3. แสดงผลและตรวจสอบด้วย instanceof
        System.out.println("Output:");

        // วนลูปใน List ทีละคน
        for (Person p : peopleList) {
            
            // สร้างข้อความข้อมูลส่วนตัว
            // (เราเข้าถึงแอตทริบิวต์ได้โดยตรงเพราะเป็น protected)
            String personInfo = p.identityID + " [" + p.age + "] - " + p.gender;

            // ตรวจสอบประเภทด้วย instanceof
            // "สำคัญ:" ต้องตรวจสอบคลาสลูก (Subclass) ก่อนคลาสแม่ (Superclass)
            
            if (p instanceof ThaiPerson) {
                System.out.println("Object -> ThaiPerson: " + personInfo);
            } 
            else if (p instanceof OtherPerson) {
                System.out.println("Object -> OtherPerson: " + personInfo);
            } 
            else {
                // ถ้าไม่ใช่ทั้ง ThaiPerson และ OtherPerson ก็ต้องเป็น Person ธรรมดา
                System.out.println("Object -> Person: " + personInfo);
            }
        }
    }
}