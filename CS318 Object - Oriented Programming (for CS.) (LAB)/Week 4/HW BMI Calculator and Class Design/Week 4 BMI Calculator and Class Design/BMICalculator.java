import javax.swing.*;
import java.text.*;

class BMICalculator {
    private BmiService bmiService;

    public static void main(String[] arg) {
        BMICalculator calculator = new BMICalculator();
        calculator.start();
    }

    public BMICalculator() {
        bmiService = new BmiService();
    }

    public void start() {
        describeProgram();
        getDatamember();
        displayOutput();
    }

    private void describeProgram() {
        System.out.println("โปรแกรม BMI สารพัดประโยชน์ " + "\n");
    }

    private void getDatamember() {
        double weight, height;
        String username, inputStr;

        inputStr = JOptionPane.showInputDialog(null,
                "Enter The Name of The Health Examiner :");
        username = inputStr;

        inputStr = JOptionPane.showInputDialog(null,
                "Enter Your Weight (kg):");
        weight = Double.parseDouble(inputStr);

        inputStr = JOptionPane.showInputDialog(null,
                "Enter Your Height (m) : ");
        height = Double.parseDouble(inputStr);

        bmiService.setUsername(username);
        bmiService.setWeight(weight);
        bmiService.setHeight(height);
    }

    private void displayOutput() {
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("ชื่อผู้เข้ารับการตรวจ : " + bmiService.getUsername()+"\n");
        
        System.out.println("ค่า BMI ของคุณคือ " + df.format(bmiService.calculateBMI()));
        System.out.println("สถานะ BMI ของคุณ : " + bmiService.getBMIStatus()+"\n");
        
        System.out.println("ปริมาณน้ำที่คุณควรดื่มต่อวัน ");
        System.out.println("คุณควรดื่มน้ำวันละประมาณ " + bmiService.calculateWaterIntake() +" มิลลิลิตร เพื่อสุขภาพที่ดี " + "\n");
        System.out.println("!!  แนะนำ !! ประเภทการออกกำลังกายที่เหมาะสมกับคุณ ");
        System.out.println(bmiService.getExerciseAdvice());
    }
}