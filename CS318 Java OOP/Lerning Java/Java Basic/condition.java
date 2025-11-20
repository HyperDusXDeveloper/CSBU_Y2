public class condition {
    public static void main(String[] args) {
        System.out.println("\nCondition if else ");
        double originalprice = 2000 ;
        double finalprice = originalprice ;
        
        if (originalprice >= 10000){
            finalprice = originalprice -  ( 0.15 * originalprice ) ;
        }
        else if (originalprice >= 6000){
            finalprice = originalprice - (0.1 * originalprice);
        }
        else if (originalprice >= 3000){
            finalprice = originalprice - (0.08 * originalprice);
        } else {
            finalprice = originalprice - (0.05 * originalprice);
        }
        System.out.println("Final Price : " + finalprice);
    }
}