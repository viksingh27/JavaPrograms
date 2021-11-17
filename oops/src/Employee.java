public class Employee {

    public static void main(String[] args) {


        emp a;
        a = new Driver(10,800,101,"John", "32 street down town", 45,"Accenture", "Logistic Driver", 340000);
        double y = a.calculateSal();



        System.out.println(
                            "Employee Id : " + a.empId + "\n" +
                            "Employee Name : " + a.empName + "\n" +
                            "Address : " + a.address + "\n" +
                            "Age : " + a.age + "\n" +
                            "Company Name : " + a.companyName + "\n" +
                            "Designation : " + a.designation + "\n" +
                            "Base Salary : " + a.baseSalary + "\n" +
                            "Annual Salary : " + y + "\n" +
                            "Salary : " + a.calculateSal()
                          );
        System.out.println();
        System.out.println();
        emp b = new Engineer("Data Valuation", 245,1500,102,"Kevin", "street-25 2nd block newyork",30,"Accenture", "Data Analyst", 654444);
        double z = b.calculateSal();

        System.out.println(
                "Employee Id : " + b.empId + "\n" +
                        "Employee Name : " + b.empName + "\n" +
                        "Address : " + b.address + "\n" +
                        "Age : " + b.age + "\n" +
                        "Company Name : " + b.companyName + "\n" +
                        "Designation : " + b.designation + "\n" +
                        "Base Salary : " + b.baseSalary + "\n" +
                        "Annual Salary : " + z + "\n" +
                        "Salary : " + b.calculateSal()
        );

    }




}



