import java.util.Scanner;

public class OutputTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tax tax = new Tax();

        System.out.print("กรุณากรอกเงินได้ 12 เดือนของท่าน (บาท): ");
        double income = sc.nextDouble();
        tax.setIncome(income);

        System.out.print("กรุณากรอกค่าใช้จ่าย (หากไม่มีให้พิมพ์ 0): ");
        double expenseInput = sc.nextDouble();
        if (expenseInput > 0) tax.setExpense(expenseInput);

        System.out.print("กรุณากรอกค่าลดหย่อน (หากไม่มีให้พิมพ์ 0 ): ");
        double deductionsInput = sc.nextDouble();
        if (deductionsInput > 0) tax.setTaxDeductions(deductionsInput);

        // คำนวณเงินได้สุทธิ
        double netIncome = tax.computeRevenueFinal();
        System.out.println("เงินได้สุทธิ = " + tax.getIncome() + " - " + tax.getExpense() +
                           " - " + tax.getTaxDeductions() + " = " + netIncome + " บาท");

        // คำนวณภาษี
        double taxAmount = tax.computeTax();
        System.out.println("เมื่อคำนวณแล้ว คุณต้องเสียภาษีเป็นจำนวนเงิน " + taxAmount + " บาท");

        sc.close();
    }
}