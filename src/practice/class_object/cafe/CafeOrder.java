package practice.class_object.cafe;

public class CafeOrder {
           //속성 : 카페 주문 객체가 각자 가지고 있어야 할 데이터이다.
    String menuName;
    int price;
    int quantity;

            //생성자 : Main에서 new CafeOrder(...)를 실행할 때 호출된다.
    CafeOrder(String menuName, int price, int quantity) {


        this.menuName = menuName;       // 우항 menuName은 생성자로 들어온 임시 주문서 값이다.
                                        // 좌항 this.menuName은 실제 객체 안의 메뉴명 칸이다.

        this.price = price;             // 우항 price는 전달받은 가격 값이다.
                                        // 좌항 this.price는 실제 객체 안의 가격 칸이다.

        this.quantity = quantity;       // 우항 quantity는 전달받은 수량 값이다.
                                        // 좌항 this.quantity는 실제 객체 안의 수량 칸이다.
    }

    //기능1 : 현재 객체의 주문 정보를 출력한다.
    void printOrderInfo() {
        System.out.println("주문 메뉴: " + this.menuName);
        System.out.println("가격: " + this.price);
        System.out.println("수량: " + this.quantity);
    }
    //기능2 : 현재 객체의 가격과 수량을 이용해서 총 금액을 계산한다.
    void printTotalPrice() {
        int totalPrice = this.price * this.quantity;
        System.out.println("총 금액: " + totalPrice + "원");
        System.out.println("---------------------");
    }

}
