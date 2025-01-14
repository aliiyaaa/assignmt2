package Models;

public class Employee extends Person implements Payable{
    private String position;
    private double salary;

    public Employee() {
        setPosition("unknown");
        setSalary(0);
    }

    public Employee(String name, String surname, String position, double salary) {
        setPosition(position);
        setSalary(salary);
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public String toString() {
        String s = "Employee:" + toString();
        String s1 = s;
        return s1;
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }
}