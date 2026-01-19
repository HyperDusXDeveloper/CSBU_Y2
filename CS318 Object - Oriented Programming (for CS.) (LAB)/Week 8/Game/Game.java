public class Game
{
    public static void main(String[] args) {
        Dice dice = new Dice();
        int sum = 0 ;
        
        for (int i = 0;i<10;i++){
            dice.roll();
            System.out.println("Roll : " + (i + 1) + " has > " + dice.getNumber());
            sum += dice.getNumber ();
        }
        System.out.println("Summary roll : " + sum);
    }
}
