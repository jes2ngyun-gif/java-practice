package practice.chapter_2.oop.inheritance.delivery;

public class Main {
    public static void main(String[] args) {

        Delivery normalDelivery = new Delivery("키보드", 80000);   // 일반 배송 객체 생성

        DawnDelivery dawnDelivery = new DawnDelivery("마우스", 50000);   // 새벽 배송 객체 생성

        normalDelivery.printOrderInfo();   // 일반 배송 정보 출력

        dawnDelivery.printOrderInfo();     // 새벽 배송 정보 출력

        dawnDelivery.startDawnDelivery();  // 새벽 배송 전용 기능

    }
}
