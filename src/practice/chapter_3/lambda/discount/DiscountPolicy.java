package practice.chapter_3.lambda.discount;
                                // 함수형 인터페이스 선언
                                // 함수형 인터페이스는 추상 메서드를 따악 하 나 만 가져야 한다.
                                // 람다식은 이 하나를 추상 메서드를 구현하는 방식으로 동작한다.
@FunctionalInterface
public interface DiscountPolicy {

    int discount(int price);
                                 // 상품 가격을 받아서 할인된 최종 가격을 반환하는 추상 메서드
                                 // price : 할인 전 상품 가격, return : 할인 후 상품 가격


}
