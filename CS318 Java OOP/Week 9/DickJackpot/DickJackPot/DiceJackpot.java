import java.util.ArrayList;
import java.util.List;
public class DiceJackpot {

    public static void main(String[] args) {
        final int NUMBER_OF_DICE = 5;
        int[] jackpotRolls = new int[6];
        List<Dice> diceList = new ArrayList<>();

        for (int i = 0; i < NUMBER_OF_DICE; i++) {
            diceList.add(new Dice());}

        int jackpotsFound = 0;
        int totalRolls = 0;

        do {
            totalRolls++;

            for (Dice currentDie : diceList) {
                currentDie.roll();
            }
            boolean isJackpot = true;
            int firstDieValue = diceList.get(0).getNumber(); 
            for (int i = 1; i < diceList.size(); i++) {
                if (diceList.get(i).getNumber() != firstDieValue) {
                    isJackpot = false;
                    break;
                }
            }
            if (isJackpot) {
                int jackpotIndex = firstDieValue - 1;
                if (jackpotRolls[jackpotIndex] == 0) {
                    jackpotRolls[jackpotIndex] = totalRolls;
                    jackpotsFound++;
                }
            }

        } while (jackpotsFound < 6); 
        for (int i = 0; i < jackpotRolls.length; i++) {
            String jackpotDisplay = "";
            for (int j = 0; j < NUMBER_OF_DICE; j++) {
                jackpotDisplay += (i + 1);
            }
            System.out.println(jackpotDisplay + " : ในรอบที่ " + jackpotRolls[i]);
        }
    }
}