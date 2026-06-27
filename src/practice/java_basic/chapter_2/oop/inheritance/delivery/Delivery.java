package practice.java_basic.chapter_2.oop.inheritance.delivery;

public class Delivery {
     // 배송 시스템의 공통 기능을 담당하는 부모 클래스

    private String productName;
         // 상품 이름
    private int price;
         // 상품 가격
    public Delivery(String productName, int price) {    // 생성자
        this.productName = productName;

        if (price < 0) {              // 가격이 음수면 0으로 저장
            this.price = 0;

        } else {
            this.price = price;
        }
    }

    public String getProductName() {        // 상품 이름 조회
        return productName;
    }

    public int getPrice() {                 // 상품 가격 조회
        return price;
    }

    public int calculateShippingFee() {     // 일반 배송비 계산
        return 3000;
    }

    public int calculateTotalPrice() {      // 최종 금액 계산
        return price + calculateShippingFee();
    }

    public void printOrderInfo() {          // 주문 정보 출력

        System.out.println("상품명 : " + productName);

        System.out.println("상품 가격 : " + price + "원");

        System.out.println("배송비 : " + calculateShippingFee() + "원");

        System.out.println("최종 결제 금액 : " + calculateTotalPrice() + "원");

        System.out.println("-------------------------------");
    }
}
