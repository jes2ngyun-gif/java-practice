package practice.lambda.discount;

public class DiscountMain {
    public static void main(String[] args) {

        DiscountService discountService = new DiscountService();
                                                             // 할인 계산을 담당하는 서비스 객체 생성

        int originalPrice = 10000;
                                                             // 할인 전 상품 가격

                                                             // 1. 정액 할인 정책
                                                             // price -> price - 1000
                                                             // 의미 : 상품 가격을 받아서 1000원을 뺀 값을 반환한다.
                                                             // 컴파일러는 DiscountPolicy 인터페이스의 discount(int price)를 보고 이 람다식이 discount() 메서드를 구현한 것이라고 추론한다.ㅏ
        DiscountPolicy fixedDiscount = price -> price - 1000;

        int fixedResult = discountService.applyDiscount(originalPrice, fixedDiscount);

        System.out.println("정액 할인 결과 : " + fixedResult + "원");


                                                               // 2. 정률 할인 정책
                                                               // price -> price * 90 / 100
                                                               // 의미 : 상품 가격의 90%만 남긴다. 즉, 10% 할인과 같은 의미이다.
        DiscountPolicy rateDiscount = price -> price * 90 / 100;

        int rateResult = discountService.applyDiscount(originalPrice, rateDiscount);

        System.out.println("정률 할인 결과 : " + rateResult + "원");


                                                                 // 3. 할인 없음 정책
                                                                 // price -> price
                                                                 // 의미 : 상품 가격을 그대로 반환한다.
        DiscountPolicy noDiscount = price -> price;

        int noDiscountResult = discountService.applyDiscount(originalPrice, noDiscount);

        System.out.println("할인 없음 결과 : " + noDiscountResult + "원");


                                                                // 4. 람다식을 변수에 담지 않고 직접 전달하는 방식
                                                                // applyDincount() 메서드의 두 번째 매개변수 타입이 DiscountPolicy이므로
                                                                // 컴파일러는 이 람다식이 DiscountPolicy의 discount() 메서드를 구현한다고 추론한다.
        int directResult = discountService.applyDiscount(originalPrice, price -> price - 3000);
        System.out.println("직접 전달 할인 결과 : " + directResult + "원");
    }
}
