class Car123{
    String color;
    String engine;

    Car123(String c, String e){
        color=c;
        engine=e;
    }
}

class BankAccount{
    int id;
    double balance;

    BankAccount(int i, double b) {
        id=i;
        balance=b;
    }
}

public class Human {
    String name;
    Car123 car123;
    BankAccount bankAccount;

    void info() {
        System.out.println("Name: " + name + ", Color: " + car123.engine  +
                ", Bank account: " + bankAccount.balance);
    }
}

class HumanTest{
    public static void main(String[] args) {
        Human human = new Human();
        human.name="David";
        human.car123 = new Car123("red", "V8");
        human.bankAccount = new BankAccount(12, 350.44);
        human.info();
    }
}
