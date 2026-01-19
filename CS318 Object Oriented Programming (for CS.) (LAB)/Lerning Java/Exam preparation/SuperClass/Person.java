public class Person {
    protected String identityID;
    protected String name;
    protected String surname;
    protected int age;
    protected char gender;

    // Constructor แบบ 5 ตัวแปร (จากไดอะแกรมเดิม)
    public Person(String identityID, String name, String surname, int age, char gender) {
        this.identityID = identityID;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender; 
    }

    // "Constructor (String, int, char) ที่โจทย์ข้อ 3 ต้องการ"
    public Person(String identityID, int age, char gender) {
        // เรียก Constructor ตัวหลัก โดยใส่ค่า default ให้ชื่อ
        this(identityID, "N/A", "N/A", age, gender);
    }
    
    public Person() {
        this("N/A", 0, ' '); // เรียกตัว 3 ตัวแปร
    }

    // (เมธอด toString() ไม่ได้ถูกใช้ในโจทย์ข้อ 3 นี้)
    @Override
    public String toString() {
        return "ID: " + this.identityID + ", Name: " + this.name;
    }
}