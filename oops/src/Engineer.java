public class Engineer extends emp {

    String projectName;
    double da;
    double hra;


    public Engineer(String projectName,double da,double hra, int empId, String empName, String address, int age, String companyName, String designation, double baseSalary) {
        super(empId, empName, address, age, companyName, designation, baseSalary);

        this.da = da;
        this.hra = hra;
        this.projectName = projectName;
    }

    public double calculateSal()
    {
        annualSalary = (baseSalary+this.da+this.hra) - findTax();;
        return annualSalary;

    }
}
