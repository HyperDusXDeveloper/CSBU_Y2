import javax.swing.*;
import java.text.*;
import java.util.Scanner ;
public class BMICalculator{
    public static void main (String[] args ) {
        DecimalFormat df = new DecimalFormat("0.00");
        double bmi, drinkday  ;
        String bmioutput ,exert ;
        String inputStr;
        System.out.println("โปรแกรม BMI สารพัดประโยชน์ "+"\n");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ป้อนน้ำหนักของคุณ  ( กิโลกรัม )  : ");
        float weight = scanner.nextFloat();
        System.out.print("ป้อนส่วนสูงของคุณ  ( เมตร )  : ");
        float height = scanner.nextFloat();
        
        bmi = weight / (height*height);
        drinkday = weight*33;
        
        System.out.print("\n");
        System.out.println("ค่า BMI ของคุณ คือ " + df.format(bmi));
        
        if (bmi < 18.5){
            bmioutput = ("น้ำหนักของคุณ ( ต่ำกว่าเกณฑ์ )");
            exert = ("แนะนำให้ออกกำลังกายที่ช่วยสร้างกล้ามเนื้อ เช่น แนะนำให้เน้นการออกกำลังกายแบบมีแรงต้าน (Resistance Training) เช่น ยกน้ำหนัก หรือวิดพื้น เพื่อเสริมสร้างกล้ามเนื้อและเพิ่มน้ำหนัก ");
        } else if (bmi < 25) {
            bmioutput = ("น้ำหนักของคุณ ( ปกติ )");
            exert = ("เยี่ยมมาก! แนะนำให้ออกกำลังกายเพื่อรักษาสุขภาพ เช่น  รักษาสุขภาพด้วยการออกกำลังกายสม่ำเสมอ ทั้งแบบคาร์ดิโอ (Cardio) และการสร้าง กล้ามเนื้อ");
        } else if (bmi < 30) {
            bmioutput = ("น้ำหนักของคุณ ( น้ำหนักเกิน ) ");
            exert = (" แนะนำให้ออกกำลังกายที่ช่วยเผาผลาญไขมัน เช่น เพื่อลด น้ำหนัก แนะนำให้เน้นการออกกำลังกายแบบคาร์ดิโอ เช่น วิ่ง, ว่ายน้ำ หรือปั่นจักรยาน");
        } else {
            bmioutput = ("น้ำหนักของคุณ ( โรคอ้วน ) ");
            exert = (" แนะนำให้ออกกำลังกายที่ลดแรงกระแทก เช่น เพื่อสุขภาพที่ดี ควรปรึกษาผู้เชี่ยวชาญ และเริ่มต้นออกกำลังกายเบาๆ ที่ลดแรงกระแทก เช่น เดินเร็ว, โยคะ หรือปั่นจักรยาน");
        }
        
        System.out.println(bmioutput+"\n");
        System.out.println("ปริมาณน้ำที่คุณควรดื่มต่อวัน ");
        System.out.println("คุณควรดื่มน้ำวันละประมาณ "+ drinkday +" มิลลิลิตร เพื่อสุขภาพที่ดี " + "\n");
        System.out.println("แนะนำประเภทการออกกำลังกายที่เหมาะสมกับคุณ ");
        System.out.println(exert);
        scanner.close();
    
    }
}