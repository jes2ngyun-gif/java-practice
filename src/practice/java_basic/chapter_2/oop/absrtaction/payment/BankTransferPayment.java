package practice.java_basic.chapter_2.oop.absrtaction.payment;
// 계좌이체 클래스
// Payment 클래스를 상속받는다.
public class BankTransferPayment extends Payment {

    public BankTransferPayment(int amount) {         // 생성자
                                                     // 객체가 생성될 때 결제 금액을 부모에게 전달한다.
        super(amount);       // 부모 생성자를 호출하여 amount를 초기화한다.
    }

    @Override                // 부모의 추상 메서드를 구현
    public void pay() {      // 계좌이체 방식에 맞게 내용을 작성한다.
        System.out.println("계좌이체가 진행됩니다.");
    }
}
