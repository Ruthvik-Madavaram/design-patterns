package builder;

public class Payslip {
    private final String employeeName;
    private final String employeeId;
    private final double basic;
    private final double hra;
    private final double da;
    private final double tax;
    private final double netSalary;

    private Payslip(PayslipBuilder builder) {
        this.employeeName = builder.employeeName;
        this.employeeId = builder.employeeId;
        this.basic = builder.basic;
        this.hra = builder.hra;
        this.da = builder.da;
        this.tax = builder.tax;
        this.netSalary = builder.netSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getBasic() {
        return basic;
    }

    public double getHra() {
        return hra;
    }

    public double getDa() {
        return da;
    }

    public double getTax() {
        return tax;
    }

    public double getNetSalary() {
        return netSalary;
    }

    @Override
    public String toString() {
        return "Employee Name: " + this.getEmployeeName() +
                "\nEmployee ID: " + this.getEmployeeId() +
                "\nBasic Salary: " + this.getBasic() +
                "\nHRA: " + this.getHra() +
                "\nDA: " + this.getDa() +
                "\nTax: " + this.getTax() +
                "\nNet Salary: " + this.getNetSalary();
    }

    public static class PayslipBuilder {
        private String employeeName;
        private String employeeId;
        private double basic;
        private double hra;
        private double da;
        private double tax;
        private double netSalary;

        public PayslipBuilder() {

        }

        public PayslipBuilder setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
            return this;
        }

        public PayslipBuilder setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public PayslipBuilder setBasic(double basic) {
            this.basic = basic;
            return this;
        }

        public PayslipBuilder setHra(double hra) {
            this.hra = hra;
            return this;
        }

        public PayslipBuilder setDa(double da) {
            this.da = da;
            return this;
        }

        public PayslipBuilder setTax(double tax) {
            this.tax = tax;
            return this;
        }

        public PayslipBuilder setNetSalary(double netSalary) {
            this.netSalary = netSalary;
            return this;
        }

        public Payslip build() {
            return new Payslip(this);
        }
    }
}
