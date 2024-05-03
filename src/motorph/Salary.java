package motorph;

import java.time.LocalDate;

public class Salary {
    private LocalDate periodStart;
    private LocalDate periodEnd;
    private double hourlyRate;
    private double monthlyRate;
    private double grossSemiMonthlyRate;
    private double netSalary;
    private Allowance allowance;
    private Taxes taxes;

    // Constructor
    public Salary(LocalDate periodStart, LocalDate periodEnd, double hourlyRate, double monthlyRate, double grossSemiMonthlyRate) {
        this.periodStart = periodStart;
        this.periodEnd = periodEnd;
        this.hourlyRate = hourlyRate;
        this.monthlyRate = monthlyRate;
        this.grossSemiMonthlyRate = grossSemiMonthlyRate;
    }

    // Setter for allowance
    public void setAllowance(Allowance allowance) {
        this.allowance = allowance;
    }

    // Setter for taxes
    public void setTaxes(Taxes taxes) {
        this.taxes = taxes;
    }

    // Method to compute gross salary
    public double computeGrossSalary() {
        // Implement logic to compute gross salary
        return grossSemiMonthlyRate * 2; // Assuming semi-monthly rate
    }

    // Method to compute net salary
    public double computeNetSalary() {
        double totalDeductions = taxes.calculateTotalDeductions(grossSemiMonthlyRate);
        return grossSemiMonthlyRate - totalDeductions;
    }
}
