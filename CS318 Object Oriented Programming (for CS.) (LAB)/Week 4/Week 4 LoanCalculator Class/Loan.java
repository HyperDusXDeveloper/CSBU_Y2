// 1670700044
// ณัฐชนน์ ศิรมลพิวัฒน์ 
// CS318 Section 227E
class Loan {
    public Loan() {
        }
    public static final int MONTHS_IN_YEAR = 12;
    
    private double loanAmount;
    private double monthlyInterestRate;
    private int numberOfPayments;
    public void setAmount (double amount ){
        loanAmount = amount;
    }
    public void setRate (double annualRate) {
        monthlyInterestRate = annualRate / MONTHS_IN_YEAR / 100;
    }
    public void setPeriod (int periodInYears) {
        numberOfPayments = periodInYears * MONTHS_IN_YEAR;
    }
    public double getAmount() {
        return loanAmount;
    }
    public int getPeriod() {
        return numberOfPayments / MONTHS_IN_YEAR;
    }   
    public double getRate( ) {
        return monthlyInterestRate * MONTHS_IN_YEAR;
    }
    public double getMonthlyPayment() {
        double monthlyPayment;

        monthlyPayment = (loanAmount * monthlyInterestRate)
                            /
        (1 - Math.pow(1/(1 + monthlyInterestRate),
                          numberOfPayments ) );
        return monthlyPayment;
    }
    public double getTotalPayment() {
        double totalPayment;
    
        totalPayment = getMonthlyPayment ( ) * numberOfPayments;
    
        return totalPayment;
    }
}
