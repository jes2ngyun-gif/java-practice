package practice.java_basic.chapter_2.staticmember.bank;

public class BankAccount {

    String owner;                // 계좌 주인은 계좌마다 다르므로 인스턴스 변수로 선언한다.

    int balance;                // 잔액은 계좌마다 다르므로 인스턴스 변수로 선언한다.

    static double interestRate = 0.03;       // 이자율은 모든 계좌가 함께 사용하는 값이므로 static 변수로 선언한다.

    public BankAccount(String owner, int balance) {
                 // 계좌 객체가 생성될 때 계좌주인과 초기 잔액을 저장하는 `생성자`

        this.owner = owner;         // 매개변수 owner 값을 현재 객체의 owner 필드에 저장한다.

        this.balance = balance;     // 매개변수 balance 값을 현재 객체의 balance 필드에 저장한다.

    }

    public void deposit(int money) {       // 입금 기능은 특정 계좌 객체의 잔액을 변경하므로 인스턴스 메서드로 만든다.

        balance = balance + money;         // 현재 계좌의 잔액에 입금 금액을 더한다.

        if (balance >= 100000) {             // 입금 후 잔액이 100,000원 이상이면 VIP 고객으로 판단한다.
            System.out.println(owner + "님은 VIP 고객입니다.");

        }
    }

    public void printInfo() {                 // 현재 계좌 정보를 출력하는 인스턴스 메서드

        System.out.println("계좌 주인 : " + owner);
        System.out.println("현재 잔액 : " + balance);
        System.out.println("적용 이자율 : " + interestRate);

        // 현재 객체의 owner와 balance를 출력한다.
    }
}
