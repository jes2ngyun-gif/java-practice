package practice.oop.encapsulation.bank;
//계좌설계도
public class BankAccount {

    private int balance;

    public BankAccount(int balance) {

        if (balance < 0) {

            this.balance = 0;


        } else {

            this.balance = balance;

        }
    }

    public void deposit(int amount) {

        if (amount <= 0) {
            System.out.println("입금 금액은 0보다 커야 합니다.");
            return;
        }

        balance = balance + amount;
        System.out.println(amount + "원이 입금되었습니다.");
    }

    public void withdraw(int amount) {

        if (amount > balance) {
            System.out.println("잔액이 부족합니다.");
            return;

        }

        balance = balance - amount;
        System.out.println(amount + "원이 출금되었습니다.");
    }

    public int getBalance() {
        return balance;
    }
}
