public class opeartors {
    public static void main(String[] args) {
        double num1 = 100 ;
        double num2 = 200 ;

        // Opeartors
        System.out.println("\nOpeartors ");

        System.out.println(" + count = " + ( num1 + num2)); // บวก
        System.out.println(" - count = " + (num1 - num2)); // ลบ
        System.out.println(" * count = " + (num1 * num2)); // คูณ
        System.out.println(" / count = " + (num1 / num2)); // หาร
        System.out.println(" % count = " + (num1 % num2)); // หารเอาเศษ

        // ShortCut Opeartors
        System.out.println("\nShortCut Opeartors ");

        double a = 1 ;
        a += 1 ;
        System.out.println(a);

        double b = 15 ;
        b /= 2 ;
        System.out.println(b);

        double c = 10 ;
        c -= 2 ;
        System.out.println(c);

        double d = 10 ;
        d *= 2 ;
        System.out.println(d);

        // เปรียบเทียบ 
        System.out.println("\nCompare Opeartors");
        double n1 = 15 ;
        double n2 = 17 ;
        double n3 = 13 ;
        double n4 = 15 ;

        System.out.println("15 > 17 : " + (n1 > n2));
        System.out.println("15 < 17 : " + (n1 < n2));
        System.out.println("15 == 17 : " + (n1 == n2));
        System.out.println("13 <= 15 : " + (n3 <= n4));
        System.out.println("13 >= 15 : " + (n3 >= n4));
        System.out.println("15 != 15 : " + (n1 != n4));

        // ตรรกศาสตร์ 
        System.out.println("\nLogic Opeartors ");
        boolean x = true ;
        boolean y = false ;
        boolean z = false ;
        boolean w = true ;

        System.out.println("\n&& and");
        System.out.println("true and false : "+ (x && y)); // (  && และ and )
        System.out.println("true and true : "+ (x && w)); // (  && และ and )
        System.out.println("false and false : "+ (y && z)); // (  && และ and )

        System.out.println("\n|| or");
        System.out.println("true or false : " + (x || y) ); // ( ||  หรือ or )
        System.out.println("false or false : " + (z || y) ); // ( ||  หรือ or )
        System.out.println("true or true : " + (x || w) ); // ( ||  หรือ or )

        System.out.println("\n! Not");
        System.out.println("Not true : " + (!x) ); // (! ไม่ not)
        System.out.println("Not False : " + (!y) ); // (! ไม่ not)

    }
}
