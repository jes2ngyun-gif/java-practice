package practice.java_basic.chapter_2.oop.encapsulation.bank;
//계좌설계도
public class BankAccount {              // 은행 계좌의 속성과 기능을 담당하는 클래스
                                        // Main이 요청하면, 실제 잔액 관리와 검증은 이 클래스가 처리한다.

    private int balance;
            // 계좌의 잔액을 저장하는 `필드`
            //private을 사용해서 외부에서 balance값을 직접 바꾸지 못하게 막는다.
            // 이것이 캡슐화의 핵심


    public BankAccount(int balance) {
            // 계좌 객체가 만들어질 때 처음 실행되는 `생성자`
            // 초기 잔액을 받아서 안전한 값인지 검사한 뒤 balance에 저장한다.

        if (balance < 0) {                // 초기 잔액이 음수라면 정상적인 계좌 상태가 아니므로 0원으로 설정한다.
                                          // 객체가 처음 만들어질 때부터 잘못된 상태가 되는 것을 막는다.
            this.balance = 0;


        } else {                           // 전달받은 초기 잔액이 정상이라면 객체의 balance필드에 저장한다.
             this.balance = balance;       // 오른쪽 balance는 매개변수, 왼쪽 this.balance는 객체의 실제 필드.

        }
    }

    public void deposit(int amount) {       // 입금 기능을 담당하는 `메서드`
                                            // 외부에서는 balance를 직접 수정하지 않고 deposit을 통해서만 입금할 수 있다.


        if (amount <= 0) {                                     //입금 금액이 0 이하라면 잘못된 요청이므로 입금을 중단한다.
            System.out.println("입금 금액은 0보다 커야 합니다."); // return은 여기서 메서드를 끝내고 빠져나가라는 뜻.
            return;
        }

        balance = balance + amount;                             // 검증을 통과한 경우에만 잔액을 증가시킨다.
        System.out.println(amount + "원이 입금되었습니다.");      // 입금 결과를 사용자에게 알려준다.
    }

    public void withdraw(int amount) {        // 출금 기능을 담당하는 '메서드'
                                              // 잔액보다 많이 출금하지 못하도록 내부에서 검증한다.


        if (amount > balance) {                     //출금 금액이 현재 잔액보다 크면 출금할 수 없다.
            System.out.println("잔액이 부족합니다."); // 이 조건문이 없으면 잔액이 음수가 되는 잘못된 상태가 발생할 수 잇다.
            return;

        }

        balance = balance - amount;                   // 검증이 통과한 경우에만 잔액을 감소시킨다.
        System.out.println(amount + "원이 출금되었습니다.");  // 출금 결과를 사용자에게 알려준다.
    }

    public int getBalance() {                    // 현재 잔액을 조회하는 `메서드`
                                                 // balance는 private이라 외부에서 직접 접근할 수 없기 때문에 getter를 제공한다.

        return balance;
        // 객체 내부에 저장된 현재 잔액을 호출한 쪽으로 돌려준다.
    }
}
