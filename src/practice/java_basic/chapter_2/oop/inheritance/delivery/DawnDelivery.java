package practice.java_basic.chapter_2.oop.inheritance.delivery;

public class DawnDelivery extends Delivery {
     // 새벽 배송 클래스

    public DawnDelivery(String productName, int price) {   // 부모 생성자 호출
        super(productName, price);
    }


    @Override            // 배송비 계산 방식 재정의
    public int calculateShippingFee() {

        return 5000;      // 새벽 배송은 배송비가 5000원
    }

    public void startDawnDelivery() {         // 새벽 배송만의 고유 기능
        System.out.println("새벽 배송이 시작됩니다.");
    }
}
