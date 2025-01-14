import Models.Employee;
import Models.Person;
import Models.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee first = new Employee("John", "Lennon","Singer", 27045.48);
        Employee second = new Employee("George", "Harrison","Developer", 50000);
        Student firstSt = new Student("Mary", "Smith", 3.87);
        Student secondSt = new Student("John", "Smith", 2.53);

        ArrayList<Payable> payables = new ArrayList<Payable>();
        payables.add((Payable) firstSt);
        payables.add((Payable) second);
        payables.add((Payable) first);
        payables.add((Payable) secondSt);
        printData(payables);
    }
    public static void printData(ArrayList<Payable> payables) {
        for (Payable payable : payables) {
            System.out.println(payable.toString()+" earns " + payable.getPaymentAmount());
        }
    }
}