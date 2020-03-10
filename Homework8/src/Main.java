public class Main {
    public static void main(String[] args) {
        Company A = new Company();
        Company B = new Company();

        Person A1 = new Person();
        Person A2 = new Person();
        Person A3 = new Person();
        Person B1 = new Person();
        Person B2 = new Person();
        Person B3 = new Person();

        A1.name = "Armen";
        A2.name = "Suren";
        A3.name = "Lilit";
        B1.name = "Anna";
        B2.name = "Tigran";
        B3.name = "Elen";

        A1.balance = 35.6;
        A2.balance = 45;
        A3.balance = 78;
        B1.balance = 77;
        B2.balance = 96.2;
        B3.balance = 44;

        A.nameCompany = "'Nuclear Power Plant'";
        B.nameCompany = "'Renewable Energy'";

        A1.company = A;
        A2.company = A;
        A3.company = A;
        B1.company = B;
        B2.company = B;
        B3.company = B;

        A1.sendMoney(A2, 10);
        System.out.println(A1.balance + "  " + A2.balance);
        A2.sendMoney(A3, 15);
        B1.sendMoney(B2, 5);

        Person[] persons = new Person[]{A1, A2, A3, B1, B2, B3};
        Company[] companies = new Company[]{A, B};

        double balance1 = 0;
        double balance2 = 0;
        Person personWithMaxBalance = A1;
        for (int i = 1; i < 6; i++) {
            if (persons[i].balance > personWithMaxBalance.balance) {
                personWithMaxBalance = persons[i];
            }
            if (persons[i].company == A) {
                balance1 += persons[i].balance;
            } else {
                balance2 += persons[i].balance;
            }
        }
        System.out.println("The person with most balance is:  " + personWithMaxBalance.name + "  from company " + personWithMaxBalance.company.nameCompany);
        if (balance1 > balance2) {
            System.out.println("The richest company is: " + A.nameCompany);
        } else {
            System.out.println("The richest company is: " + B.nameCompany);
        }
    }
}
