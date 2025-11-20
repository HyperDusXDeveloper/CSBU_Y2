import java.lang.Math;
public class Dice {
    private int number;
    private static final int MAX_NUMBER = 6; 
    private static final int MIN_NUMBER = 1; 

    public Dice() {
        this.roll();
    }

    public void roll() {
        this.number = (int) (Math.floor(Math.random() * (MAX_NUMBER - MIN_NUMBER + 1)) + MIN_NUMBER);
    }
    
    public int getNumber() {
        return this.number;
    }
}