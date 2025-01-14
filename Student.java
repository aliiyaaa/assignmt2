package Models;

public class Student extends Person implements Payable {
    private double gpa;

    public Student(String name, String surname, double gpa) {
        setGpa(gpa);
    }
    public Student(){

        setGpa(0.0);
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public String toString(){
        String s = "Student:" + toString();
        return s;
    }

    @Override
    public double getPaymentAmount() {
        if (gpa>2.67){
            return 36660;
        }
        else{
            return 0;
        }
    }
}