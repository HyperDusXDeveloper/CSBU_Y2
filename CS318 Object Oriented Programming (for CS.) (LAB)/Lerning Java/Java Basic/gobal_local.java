public class gobal_local {
    public static void main(String[] args) {
        // Global Variable
        int a = 1;
        int b =2 ;
        {
            // local variable
            int c = 3 ;
            System.out.println("c Local Variable : "+ c);
            System.out.println("a+c Global in Local Variable : " + (a+c));

        }// End local variable
        System.out.println("a Global Variable : " + a);
        System.out.println("b Global Variable : " + b);
    }// End Global variable
}
