package practice.oop.total.shoppingmall;

public interface Payment {
                                              // Payment는 모든 결제 방식이 지켜야 하는 규칙이다.
                                              // 카드, 카카오페이, 토스페이는 결제 방식은 다르지만,
                                              // 모두 "결제한다"는 공통 기능을 가져야 한다.

    void pay(int amount);
                                               // 결제 기능
                                               // 실제 결제 방식은 CardPayment, KakaoPayment, TossPayment가 각각 구현한다.
}
