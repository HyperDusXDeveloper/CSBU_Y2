public class Tax {
    // --- Data Members ---
    private double income;          // รายได้รวม
    private double expense;         // ค่าใช้จ่าย
    private double taxDeductions;   // ค่าลดหย่อน
    private double netIncome;       // เงินได้สุทธิ

    // --- Constructor ---
    public Tax() {
        this.expense = 100000;       // ค่าเริ่มต้น
        this.taxDeductions = 60000;  // ค่าเริ่มต้น
    }

    // --- Setter / Getter ---
    public void setIncome(double income) {
        this.income = income;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    public void setTaxDeductions(double taxDeductions) {
        this.taxDeductions = taxDeductions;
    }

    public double getIncome() {
        return income;
    }

    public double getExpense() {
        return expense;
    }

    public double getTaxDeductions() {
        return taxDeductions;
    }

    public double getNetIncome() {
        return netIncome;
    }

    // --- Method คำนวณเงินได้สุทธิ ---
    public double computeRevenueFinal() {
        netIncome = income - expense - taxDeductions;
        return netIncome;
    }

    // --- Method คำนวณภาษี ---
    public double computeTax() {
        double tax = 0;
        double net = netIncome;

        if (net <= 150000) {
            tax = 0;
        } else if (net <= 300000) {
            tax = (net - 150000) * 0.05;
        } else if (net <= 500000) {
            tax = ((net - 300000) * 0.10) + 7500;
        } else if (net <= 750000) {
            tax = ((net - 500000) * 0.15) + 27500;
        } else if (net <= 1000000) {
            tax = ((net - 750000) * 0.20) + 65000;
        } else if (net <= 2000000) {
            tax = ((net - 1000000) * 0.25) + 115000;
        } else if (net <= 5000000) {
            tax = ((net - 2000000) * 0.30) + 365000;
        } else {
            tax = ((net - 5000000) * 0.35) + 1265000;
        }

        return tax;
    }
}

