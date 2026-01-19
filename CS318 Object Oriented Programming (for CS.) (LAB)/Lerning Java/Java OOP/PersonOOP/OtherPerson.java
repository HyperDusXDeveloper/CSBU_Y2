public class OtherPerson extends Person {

    // --- นี่คือส่วนที่ขาดไป ---
    
    // 1. Constructor แบบที่ 1 (รับค่าเต็ม)
    public OtherPerson(String identityID, String name, String surname, int age, char gender) {
        // 2. โยนค่าทั้งหมดกลับไปให้ Constructor ของ Person
        super(identityID, name, surname, age, gender);
    }

    // 3. Constructor แบบที่ 2 (แบบเปล่า)
    public OtherPerson() {
        super(); // เรียก Constructor เปล่าๆ ของ Person
    }
    
    // --------------------------------

    // --- ส่วนนี้ของคุณถูกต้อง 100% ---
    public String getPassportID() {
        return this.identityID; // <--- ใช้ 'identityID' ของเก่า
    }

    public void setPassportID(String passportID) {
        this.identityID = passportID; // <--- แก้ไข 'identityID' ของเก่า
    }
}