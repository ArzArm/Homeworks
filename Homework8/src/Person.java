public class Person {
    private String name;
    private double balance;
    Company company;

    //constructor
    public Person(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void sendMoney(Person otherPerson, double amount) {
        otherPerson.balance += amount;
        this.balance -= amount;
    }
}
