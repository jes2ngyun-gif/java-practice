package practice.lambda.discount;

public class DiscountService {

                                         // 상품 가격과 할인 정책을 받아 최종 가격을 계산하는 메서드
                                         // int price : 할인 전 상품 가격
                                         // DiscountPolicy discountPolicy : 할인 계산 방식을 담고 있는 객체, 실제로는 람다식으로 전달된 기능이 들어온다.
    public int applyDiscount(int price, DiscountPolicy discountPolicy) {

        return discountPolicy.discount(price);
                                         // 전달받은 할인 정책의 discount() 메서드를 실행한다.
                                         // 람다식이 이 discount() 메서드의 실제 구현 역할을 한다.
    }
}
