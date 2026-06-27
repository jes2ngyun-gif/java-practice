package practice.java_basic.chapter_2.oop.total.shoppingmall;

public class TossPayment implements Payment {


    private String phoneNumber;

    public TossPayment (String phoneNumber) {

        if (phoneNumber == null || phoneNumber.isEmpty()) {
            this.phoneNumber = "전화번호 없음";

        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("[토스 결제]");
        System.out.println(phoneNumber + " 번호로 " + amount + "원을 결제합니다.");
    }


    public void sendTossNotification() {
        System.out.println(phoneNumber + " 번호로 토스 결제 알림을 보냅니다.");
    }
}
