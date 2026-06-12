package practice.oop.encapsulation.bank;
//실행하는 곳
public class Main {                        // 실제 은행 계좌 기능은 BankAccount  클래스에 맡기고, Main은 무엇을 실행할지 순서만 지킴.

    public static void main(String[] args) {

        BankAccount account = new BankAccount(10000);
                // BankAccount 객체를 생성한다.
                // new BankAccount(10000)은 "초기 잔액 10000원을 가진 계좌를 만들어라"는 뜻
                // 생성된 계좌 객체의 주소를 account 변수에 저장한다.

        account.deposit(5000);
                // account 객체에게 5000원을 입금하라고 요청한다.
                // 실제 입금 검증과 잔액 변경은 BankAccount의 deposit 메서드가 처리한다.

        account.withdraw(300);
                // account 객체에게 300원을 출금하라고 요청한다.
                // Main은 출금 조건을 직접 검사하지 않고, withdraw 메서드에게 맡긴다.

        account.withdraw(20000);
                // 잔액보다 큰 금액을 출금 요청한다.
                // 이 요청은 BankAccount  내부에서 잔액 부족으로 막힌다.

        System.out.println("현재 잔액: " + account.getBalance() + "원");
                // 현재 잔액을 직접 꺼내는 것이 아니라 getBalance()를 통해 조회한다.
                // balance가 private이기 때문에 외부에서는 메서드를 통해서만 확인할 수 있다.
    }
}
