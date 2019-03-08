package ac.sonia;

public class Employee {

    private String empName;
    private String empSurname;
    private String empId;
    private double amount;


    public Employee(String empName, String empSurname, String empId, double amount ){

        this.empName = empName;
        this.empSurname = empSurname;
        this.empId = empId;
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpSurname(String empSurname) {
        this.empSurname = empSurname;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpSurname() {
        return empSurname;
    }

    public String getEmpId() {
        return empId;
    }

    public double getAmount() {
        return amount;
    }

    public void genAmount(double gen){
        System.out.println("Amount plus 12% is: R" +this.getAmount());
    }
}
