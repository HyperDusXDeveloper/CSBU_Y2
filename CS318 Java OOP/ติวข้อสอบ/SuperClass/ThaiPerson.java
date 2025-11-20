public class ThaiPerson extends Person { 
  
  // 1. สร้าง Constructor ของ ThaiPerson
  public ThaiPerson(String identityID, String name, String surname, int age, char gender) {
    // 2. "super(...)" ต้องเป็นบรรทัดแรกสุด "ข้างใน" Constructor
    super(identityID, name, surname, age, gender);
  }
 public ThaiPerson(String identityID, int age, char gender) { 
// มันก็จะเรียก super() ของ Person ที่รับ 3 ตัวแปรเหมือนกัน
  super(identityID, age, gender); }

  // (Constructor อื่นๆ ถ้ามี เช่น)
  public ThaiPerson() {
    super(); // เรียก Constructor เปล่าๆ ของ Person
  }


  public String getCitizenID() {
    return this.identityID; // <--- ใช้ 'identityID' ของเก่า
  }

  public void setCitizenID(String citizenID) {
    this.identityID = citizenID; // <--- แก้ไข 'identityID' ของเก่า
  }
  
}