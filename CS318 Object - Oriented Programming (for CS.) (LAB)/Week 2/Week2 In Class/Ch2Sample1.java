import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Ch2Sample1
{
    public static void main(String[] args) {
        JFrame myWindow; //null
        myWindow = new JFrame();
        myWindow.setSize(300,200);
        myWindow.setTitle("My First Java Program");
        myWindow.setVisible(true);
        JOptionPane.showMessageDialog(null,"\nI \nLove\n Java");
        JOptionPane.showMessageDialog(null,"\nI \nLove\n Java");
    }
}