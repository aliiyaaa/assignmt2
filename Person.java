public class Person implements Payable {
    private int id;
    private String name;
    private String surname;
    private static int idCounter = 1;

    public Person() {
        id = idCounter++;
        setName("unknown");
        setSurname("unknown");
    }

    public Person(String name, String surname) {
        id = idCounter++;
        setName(name);
        setSurname(surname);
    }


    public int getId() {
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

    public String toString() {
        return id + "." + name + " " + surname;
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }
}
