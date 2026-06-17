package practice.chapter_2.oop.inheritance.member;

public class Member {
     // 일반 회원의 공통 정보를 담는 부모 클래스
    private String name;
         // 회원 이름은 외부에서 마음대로 바꾸지 못하게 private으로 보호한다.
    private int orderPrice;
         // 주문 금액은 외부에서 직접 수정하지 못하게 private으로 보호한다.


    public Member(String name, int orderPrice) {
         // 객체가 만들어질 때 회원 이름과 주문 금액을 초기화하는 `생성자`
        this.name = name;

        if (orderPrice < 0) {     // 주문 금액이 음수이면 말이 안 되므로 0으로 저장한다.
            this.orderPrice = 0;
        } else {
            this.orderPrice = orderPrice;
        }
    }

    public int getOrderPrice() {     // 자식 클래스에서도 주문 금액을 사용할 수 있도록 getter를 제공한다.
        return orderPrice;
    }

    public String getName() {     // 회원 이름을 조회하기 위한 getter
        return name;
    }

    public int calculatePayment() {     // 일반 회원의 결제 금액 계산 `메서드`
        return orderPrice;              // 일반 회원은 할인 없이 주문 금액 그대로 결제한다.
    }

    public void printOrderInfo() {     // 회원의 주문 정보를 출력하는 `메서드`

        System.out.println("회원 이름 : " + name);
        System.out.println("주문 금액 : " + orderPrice + "원");
        System.out.println("최종 결제 금액 : " + calculatePayment() + "원");
        System.out.println("------------------------------");
    }
}
