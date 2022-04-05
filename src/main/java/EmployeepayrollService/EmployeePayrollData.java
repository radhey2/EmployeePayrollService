package EmployeepayrollService;

public class EmployeePayrollData {
    public int id;
    public String Name;
    public double Salary;

    public EmployeePayrollData(int id, String Name, double Salary){
        this.id = id;
        this.Name = Name;
        this.Salary = Salary;
    }

    public String toString(){return "id = " +id + "   Name = " +Name + "    Salary = " +Salary; }
}

