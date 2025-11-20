import javax.swing.*;
// Natchanon Saileamonpiwat 1670700044
public class Ch6HiLo {
    // Data Member 
    private final int MAX_GUESS_ALLOWED = 6 ;
    private final int LOWER_BOUND = 1 ;
    private final int UPPER_BOUND = 100 ;
    private int secretNumber ;
    public void start(){
        int answer ;
        describeRules();
        answer = prompt ("Do you want to Play a Hi-Lo game") ;
        while (answer == JOptionPane.YES_OPTION) {
            generateSecretNumber( );
            playGame();
            answer = prompt("Do you want to play another Hi-Lo game?");
    }
}
private void describeRules( ) {
System.out.println("Inside describeRules");
}

private int generateSecretNumber( ) {
    double X = Math.random() ;

    secretNumber = (int) Math.floor( X *100) + 1;

    System.out. println ("Secret Number: "+ secretNumber) ;

    return secretNumber;
}
private void playGame( ) {
    int guessCount = 0;
    int guess;
    do {
        guess = getNextGuress();
        guessCount++;
    if (guess < secretNumber) {
    
     JOptionPane. showMessageDialog(null, "Your guess is LO");

    } else if (guess > secretNumber) {

     JOptionPane. showMessageDialog(null, "Your guess is HI");
    }
    
    } while ( guessCount < MAX_GUESS_ALLOWED &&
              guess != secretNumber );

    //output appropriate message
    if ( guess == secretNumber ) {

    JOptionPane. showMessageDialog(null, "You guessed it in "
            + guessCount + "tries.");
    } else {

    JOptionPane. showMessageDialog(null, "You lost. Secret No. was "
            + secretNumber) ;
    }
}
private int prompt(String question) {
int reply;
reply = JOptionPane.showConfirmDialog(null,
question,"Confirmmation",JOptionPane.YES_NO_OPTION);
return reply;
}
private int getNextGuress(){
    String inputStr ;
    int input ;
    while(true){
        inputStr = JOptionPane.showInputDialog(null,"Next Guess");
        input = Integer.parseInt(inputStr);
        if (LOWER_BOUND <= input && input <= UPPER_BOUND) {
            return input ;
        }
        JOptionPane.showMessageDialog(null, "Invalid Input: " +
                                        "Must be between " + LOWER_BOUND +
                                        "and " + UPPER_BOUND) ;
    }
}
}
