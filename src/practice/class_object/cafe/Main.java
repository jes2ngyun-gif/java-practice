package practice.class_object.cafe;
//카페 주문 객체 만들기
public class Main {
    public static void main(String[] args) {

        CafeOrder orderA = new CafeOrder("아메리카노", 4500, 2);
              // 첫 번째 카페 주문 객체를 생성한다.
              // new CafeOrder(...)를 만나면 컴퓨터는 CafeOrder 클래스의 생성자로 이동한다.
              // "아메리카노", 4500, 2 값이 생성자의 매개변수로 전달된다.
        CafeOrder orderB = new CafeOrder("카페라떼", 5200, 1);
              // 두 번째 카페 주문 객체를 생성한다.
              // orderA와 orderB는 같은 CafeOrder 설계도로 만들어졌지만 `서로 다른 객체`이다.


        orderA.printOrderInfo();
               // orderA 객체에게 주문 정보를 출력하라고 시킨다.
               // 현재 this는 orderA를 의미한다.
        orderA.printTotalPrice();
               // orderA 객체에게 총 금액을 계산하라고 시킨다.
               // 4500 * 2 가 계산된다.



        orderB.printOrderInfo();
                // orderB 객체에게 주문 정보를 출력하라고 시킨다.
                // 현재 this는 orderB를 의미한다.
        orderB.printTotalPrice();
                // orderB 객체에게 총 금액을 계산하라고 시킨다.
                // 5200 * 1 이 계산된다.



    }
}
