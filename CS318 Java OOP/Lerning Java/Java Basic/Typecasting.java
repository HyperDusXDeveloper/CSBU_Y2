public class Typecasting {
    public static void main(String[] args) {

        // Widening Casting # เล็ก > ใหญ่ (Java Auto)
        // byte > short > char > int > long > float > double
        System.out.println("\nWidening Casting # int to Double");
        int numint = 10 ;
        double numDouble = numint ;
        System.out.println("Int : "+numint); // int
        System.out.println("Double : "+ numDouble); // Double


        // Narrowing Casting # ใหญ่ > เล็ก (ทำเอง)
        // double > float > long > int > char > short > byte
        System.out.println("\nNarrowing Casting # Double to int");
        double numDouble2 = 10.0 ;
        int numint2 = (int)numDouble2;
        System.out.println("Int : "+numDouble2); // Double
        System.out.println("Double : "+numint2); // int
    }
}
