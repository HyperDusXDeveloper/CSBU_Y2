class BmiService {
    private String username;
    private double weight;
    private double height;

    public BmiService() {
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getUsername() {
        return username;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double calculateBMI() {
        return weight / (height * height);
    }

    public double calculateWaterIntake() {
        return weight * 33;
    }

    public String getBMIStatus() {
        double bmi = calculateBMI();
        if (bmi < 18.5) {
            return "น้ำหนักของคุณ ( ต่ำกว่าเกณฑ์ )";
        } else if (bmi < 24.9) {
            return "น้ำหนักของคุณ ( ปกติ )";
        } else if (bmi < 29.9) {
            return "น้ำหนักของคุณ ( น้ำหนักเกิน ) ";
        } else {
            return "น้ำหนักของคุณ ( โรคอ้วน )";
        }
    }

    public String getExerciseAdvice() {
        double bmi = calculateBMI();
        if (bmi < 18.5) {
            return "แนะนำให้ออกกำลังกายที่ช่วยสร้างกล้ามเนื้อ เช่น แนะนำให้เน้นการออกกำลังกายแบบมีแรงต้าน (Resistance Training) เช่น ยกน้ำหนัก หรือวิดพื้น เพื่อเสริมสร้างกล้ามเนื้อและเพิ่มน้ำหนัก ";
        } else if (bmi < 24.9) {
            return "เยี่ยมมาก! แนะนำให้ออกกำลังกายเพื่อรักษาสุขภาพ เช่น  รักษาสุขภาพด้วยการออกกำลังกายสม่ำเสมอ ทั้งแบบคาร์ดิโอ (Cardio) และการสร้าง กล้ามเนื้อ";
        } else if (bmi < 29.9) {
            return " แนะนำให้ออกกำลังกายที่ช่วยเผาผลาญไขมัน เช่น เพื่อลด น้ำหนัก แนะนำให้เน้นการออกกำลังกายแบบคาร์ดิโอ เช่น วิ่ง, ว่ายน้ำ หรือปั่นจักรยาน";
        } else {
            return "แนะนำให้ออกกำลังกายที่ลดแรงกระแทก เช่น เพื่อสุขภาพที่ดี ควรปรึกษาผู้เชี่ยวชาญ และเริ่มต้นออกกำลังกายเบาๆ ที่ลดแรงกระแทก เช่น เดินเร็ว, โยคะ หรือปั่นจักรยาน";
        }
    }
}
    