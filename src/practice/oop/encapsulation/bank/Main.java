package practice.oop.encapsulation.bank;
//실행하는 곳
public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(10000);

        account.deposit(5000);
        account.withdraw(300);
        account.withdraw(20000);

        System.out.println("현재 잔액: " + account.getBalance() + "원");
    }
}
