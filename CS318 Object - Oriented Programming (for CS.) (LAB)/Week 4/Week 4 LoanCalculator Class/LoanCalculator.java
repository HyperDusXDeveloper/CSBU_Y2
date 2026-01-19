import javax.swing.*;
import java.text.*;

// 1670700044
// ณัฐชนน์ ศิรมลพิวัฒน์ 
// CS318 Section 227E
class LoanCalculator {
    private Loan loan ;
    public static void main(String[] arg) {
        LoanCalculator calculator = new LoanCalculator();
        calculator.start();
    }
    public LoanCalculator()
    {
        loan = new Loan();
    }
    public void start()
    {
        describeProgram();
        getInput();
        computePayment();
        displayOutput();
    }

    private void computePayment()
    {
        System.out.println("inside computePayment");

    }
    private void describeProgram()
    {
        System.out.println("This program computes the monthly and total");
        System.out.println("payments for a given loan amount, annual ");
        System.out.println("interest rate, and loan period (# of years).");
        System.out.println("\n");
    }
    private void displayOutput()
    {
        DecimalFormat df = new DecimalFormat("0.000");
    
        System.out.println("Loan Amount: $" + loan.getAmount());
        System.out.println("Annual Interest Rate:"
                        + loan.getRate() + "%");
        System.out.println("Loan Period (years): " + loan.getPeriod());
        System.out.println("Monthly payment is $ " + df.format(loan.getMonthlyPayment()));
        System.out.println("TOTAL payment is $ " + df.format(loan.getTotalPayment()));
    }
    private void getInput() {
        
        double loanAmount , annualInterestRate ;
        
        int loanPeriod ;
        
        String inputStr;
        

        inputStr = JOptionPane.showInputDialog(null,
                "Loan Amount (Dollars+Cents):");
        loanAmount = Double.parseDouble(inputStr);

        inputStr = JOptionPane.showInputDialog(null,
                "Annual Interest Rate (e.g., 9.5):");
        annualInterestRate = Double.parseDouble(inputStr);

        inputStr = JOptionPane.showInputDialog(null,
                "Loan Period - # of years:");
        loanPeriod = Integer.parseInt(inputStr);

        loan.setAmount(loanAmount);
        loan.setRate(annualInterestRate);
        loan.setPeriod(loanPeriod);

        //System.out.println("Loan Amount: $" + loan.getAmount());
        //System.out.println("Annual Interest Rate: "+ loan.getRate() + loan.getRate() + " %");
        //System.out.println("Loan Period (years):" + loan.getPeriod());

    }
}