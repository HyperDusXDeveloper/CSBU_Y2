public class instanceofVariable {
    public static void main(String[] args) {

        // ชนิดข้อมูล Data Type
        Integer a = 100 ;
        String c = "Java" ;
        
        // Check instanceof
        System.out.println("Check instanceof");
        boolean cinstanof = c instanceof String;
        System.out.println("c has String ? : " + cinstanof);

        boolean ainstanof = a instanceof Integer ;
        System.out.println("a hsa Integer ? : " + ainstanof);
    }
}
