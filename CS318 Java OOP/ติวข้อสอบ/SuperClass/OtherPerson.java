public class OtherPerson extends Person {
  
  // 1. Constructor แบบที่ 1 (รับค่าเต็ม)
  public OtherPerson(String identityID, String name, String surname, int age, char gender) {
    // 2. โยนค่าทั้งหมดกลับไปให้ Constructor ของ Person
    super(identityID, name, surname, age, gender);
  }
  public OtherPerson(String identityID, int age , char gender ){
  super ( identityID,age,gender );
}

  // 3. Constructor แบบที่ 2 (แบบเปล่า)
  public OtherPerson() {
    super(); // เรียก Constructor เปล่าๆ ของ Person
  }
  public String getPassportID() {
    return this.identityID; // <--- ใช้ 'identityID' ของเก่า
  }

  public void setPassportID(String passportID) {
    this.identityID = passportID; // <--- แก้ไข 'identityID' ของเก่า
  }
}