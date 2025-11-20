import java.util.Scanner;
public class University{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Student Id :");
        String StudentID = scanner.nextLine();
        scanner.close();
        
        System.out.println("Substring starting from index 1 to 2 :" + StudentID.substring(1,3));
        System.out.println("Substring starting from index 3 to 4 :" + StudentID.substring(3,5));
        System.out.println("Substring starting from index 5 :" + StudentID.substring(5,10));
        
        System.out.println("Substring starting from index 25" + StudentID.substring(1,3));
        
        String codesec ;
        codesec = new String(StudentID.substring(3,5));
        
        if (codesec.equals("01")){
            System.out.println("01 : Accounting / บัญชี  "); }
        else if (codesec.equals("02")){
            System.out.println("02 : Business Administration / บริหารธุรกิจ "); }
        else if (codesec.equals("03")){
            System.out.println("03 : Communication Arts / นิเทศศาสตร์ "); }
        else if (codesec.equals("04")){
            System.out.println("04 : Law / นิติศาสตร์ "); }
        else if (codesec.equals("05")){
            System.out.println("05 : Humanities and Tourism Management / มนุษยศาสตร์และการจัดการการท่องเที่ยว"); }
        else if (codesec.equals("06")){
            System.out.println("06 : Economics and Investment / เศรษฐศาสตร์และการลงทุน"); }
        else if (codesec.equals("07")){
            System.out.println("07 : Information Technology and Innovation / เทคโนโลยีสารสนเทศและนวัตกรรม "); }
        else if (codesec.equals("08")){
            System.out.println("08 : Fine and Applied Arts / ศิลปกรรมศาสตร์ "); }
        else if (codesec.equals("09")){
            System.out.println("09 : Engineering / วิศวกรรมศาสตร์ "); }
        else if (codesec.equals("10")){
            System.out.println("10 : BU International College / วิทยาลัยนานาชาติ "); }
        else if (codesec.equals("11")){
            System.out.println("11 : Architecture / สถาปัตยกรรมศาสตร์ "); }
        else if (codesec.equals("12")){
            System.out.println("12 : Entrepreneurship and Management / การสร้างเจ้าของธุรกิจและการบริหารกิจการ "); }    
        else if (codesec.equals("13")){
            System.out.println("13 : Digital Media and Cinematic Arts / ดิจิทัลมีเดียและศิลปภาพยนตร์ "); }
        else if (codesec.equals("14")){
            System.out.println("14 : BU Chinese International / วิทยาลัยนานาชาติจีน "); }
        else {
            System.out.println("Can't Found codesec"); }
}
}