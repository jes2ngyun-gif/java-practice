package practice.class_object.bank;

public class BankAccount {


    // 속성 : 계좌 객체가 각자 가지고 있는 데이터다.
    String owner;
    int balance;

    // 생성자 : 계좌 객체를 만들 때 예금주와 초기 잔액을 저장한다.
    BankAccount(String owner, int balance) {

        this.owner = owner;       // 우항의 owner는 Main에서 전달받은 임시 값이다.
        // 좌항의 this.owner는 실제 계좌 객체 안의 예금주 칸이다.

        this.balance = balance;    // 우항의 balance는 Main에서 전달받은 초기 잔액이다.
    }                              // 좌항의 this.balance는 실제 계좌 객체 안의 잔액 칸이다.


    // 기능 1: 현재 계좌 객체의 정보를 출력한다.
    void printInfo() {

        System.out.println("예금주: " + this.owner);
        System.out.println("잔액: " + this.balance + "원");
        System.out.println("---------------------------");
    }

    // 기능 2 : 현재 계좌 객체에 돈을 입금한다.
    void deposit(int money) {

        this.balance = this.balance + money;

        System.out.println(this.owner + "님 계좌에 " + money + "원이 입금되었습니다.");
    }

    // 기능 3 : 현재 계좌 객체에서 돈을 출금한다.
    void withdraw(int money) {

        this.balance = this.balance - money;

        System.out.println(this.owner + "님 계좌에서 " + money + "원이 출금되었습니다.");

    }
}
