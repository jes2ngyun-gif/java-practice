package practice.oop.absrtaction.payment;
// 부모 클래스
// 여러 결제 방식들이 공통적으로 가져야 하는 기능을 정의하는 클래스
public abstract class Payment {

    private int amount;
         // 결제 금액을 저장하는 변수
         // private으로 선언하여 외부에서 직접 변경하지 못하도록 보호

    public Payment(int amount) {
         // 생성자
         // 객체가 만들어질 때 결제 금액을 초기화한다.

        if (amount < 0) {
            this.amount = 0;       //음수 금액이 들어오는 것을 방지

        } else {
            this.amount = amount;  // 정상이면 그대로 저장~
        }
    }

    public int getAmount() {       // 저장된 결제 금액을 반환하는 메서드
                                   // private 변수 amount를 외부에서 읽을 수 있도록 해준다.

        return amount;
    }

    public void printInfo() {      // 모든 결제 방식에서 공통으로 사용할 수 잇는 메서드
                                   // 결제 금액을 출력한다.

        System.out.println("결제 금액 : " + amount + "원");
    }

    public abstract void pay();
         // 추상 메서드
         // 자식 클래스가 반드시 구현해야 하는 메서드
         // 결제 방식마다 동작이 다르므로 여기서는 내용이 없다.
}
