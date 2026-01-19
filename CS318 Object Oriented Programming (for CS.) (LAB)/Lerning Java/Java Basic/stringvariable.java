public class stringvariable {
    public static void main(String[] args) {
        // ' ' เก็บได้แค่ตัวเดียว
        char a = 'H';
        System.out.println("Char a > " + a);

        // "" เก็บได้หลายตัว
        String b = "ABC" ;
        System.out.println("String b > " + b);

        // "" เก็บตัวเลขได้ แต่ตัวเลขไม่ใช่ ตัวเลข
        String c = "100" ;
        c = c + 50 ; // String + เป็นการต่อข้อวาม 
        System.out.println("String + String / 100 + 50 > " + c); // 10050

        // String > interger
        String d = "100" , e = "200" ;
        int eint = Integer.parseInt(e);
        int dint = Integer.parseInt(d);
        int sum = eint + dint ;
        System.out.println("String > interger > "+sum);

        // String > Double
        String x = "999.99";
        Double xdouble = Double.parseDouble(x) ;
        Double sumx = xdouble+0.01;
        System.out.println("String > Double > "  + sumx);

        // Interger > String 
        int num = 1000 ;
        String numstr = String.valueOf(num);
        System.out.println("Interger > String " + numstr + " Bath");

    }
}
