package practice.java_basic.chapter_2.oop.absrtaction.payment;
// 카드 결제 클래스
public class CardPayment extends Payment {
         // 카드 결제를 담당하는 클래스
         // Payment를 상속받는다.

    public CardPayment(int amount) {            // 생성자
                                                // 카드 결제 객체가 만들어질 때 결제 금액을 부모에게 전달한다.

        super(amount);                          // 부모(Payment)의 생성자를 호출
                                                // amount 값을 부모의 amount 변수에 저장한다.
    }

    @Override                            // 부모의 추상 메서드 pay( )를 구현
    public void pay() {                  // 카드 결제 방식에 맞게 재정의(오버라이딩)한다.

        System.out.println("카드 결제가 진행됩니다.");
    }
}
