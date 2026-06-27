package practice.java_basic.chapter_2.oop.inheritance.member;

public class VipMember extends Member {
     // VIP 회원은 일반 회원의 공통 기능을 물려받는다.
    public VipMember(String name, int orderPrice) {
         // VIP 회원 객체가 만들어질 때 부모 생성자를 먼저 호출한다.
        super(name, orderPrice);
    }

    @Override                         // VIP 회원은 결제 금액 계산 방식이 일반 회원과 다르다.
    public int calculatePayment() {   // 그래서 부모의 calculatePayment() 메서드를 재정의한다.

        int price = getOrderPrice();  // getOrderPrice()로 부모의 private 필드 값을 안전하게 가져온다.

        int discount = price / 10;    // VIP 회원은 10% 할인이 된다.

        return price - discount;      // 최종 결제 금액 = 주문 금액 - 할인 금액
    }
}
