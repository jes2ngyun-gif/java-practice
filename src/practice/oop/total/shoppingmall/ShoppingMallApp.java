package practice.oop.total.shoppingmall;

public class ShoppingMallApp {

    public static void main(String[] args) {


        Customer customer = new Customer("정윤", "010-1234-4321");

        Product food = new FoodProduct("샐러드", 100, "2026-06-01");

        Product lecture = new DigitalProduct("자바 입문 강의", 500, "https://dawnload.bullah.com/java");



        Payment cardPayment = new CardPayment("콩떡은행");

        Payment kakaoPayment = new KakaoPayment("cutijyun");

        Order order1 = new Order(customer, food, cardPayment);
        Order order2 = new Order(customer, lecture, kakaoPayment);


        order1.processOrder();
        order1.processProductSpecialFeature();
        order1.processPaymentSpecialFeature();

        System.out.println();

        order2.processOrder();
        order2.processProductSpecialFeature();
        order2.processPaymentSpecialFeature();
    }
}
