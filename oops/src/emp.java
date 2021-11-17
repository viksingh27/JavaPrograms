abstract class emp implements EmpInterface{
    int empId;
    String empName;
    String address;
    int age;
    String companyName;
    String designation;
    double baseSalary;
    double annualSalary;
    double tax;
    double totalTax;
    double salary;
    public emp(int empId, String empName, String address, int age, String companyName, String designation,double baseSalary) {
        this.empId = empId;
        this.empName = empName;
        this.address = address;
        this.age = age;
        this.companyName = companyName;
        this.designation = designation;
        this.baseSalary =baseSalary;
    }



    @Override public double findTax(){
        if(annualSalary < 200000)
        {

            return tax = (float) (annualSalary*1);
        }
        else if(annualSalary >200000 && annualSalary < 500000)
        {
            tax = (float) (annualSalary*0.1);
            return totalTax =  tax;
        }

        else{
            tax = (float) (annualSalary*0.2);
            return  totalTax = tax;
        }
    }
    public double calculateSal(){
        return annualSalary;
    }

}
