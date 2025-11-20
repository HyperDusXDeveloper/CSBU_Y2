public class ThaiPerson extends Person { 
    public String getCitizenID() {
    return this.identityID; // <--- ใช้ 'identityID' ของเก่า
    }

    public void setCitizenID(String citizenID) {
    this.identityID = citizenID; // <--- แก้ไข 'identityID' ของเก่า
    }
    
}