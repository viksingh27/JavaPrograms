public class Driver extends emp {

    int licenseId;
    double overtimeAmount;


    public Driver(int licenseId, double overtimeAmount, int empId, String empName, String address, int age, String companyName, String designation, double baseSalary) {
        super(empId, empName, address, age, companyName, designation, baseSalary);

        this.licenseId = licenseId;
        this.overtimeAmount = overtimeAmount;
    }

         public double calculateSal() {
             return annualSalary = (baseSalary + overtimeAmount) - findTax();


         }


}
