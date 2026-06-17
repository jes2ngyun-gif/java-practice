package practice.chapter_2.oop.total.notification;

      // SmsNotification 은 문자 알림을 담당하는 클래스이다.
public class SmsNotification extends AbstractNotification {


    private final int MAX_LENGTH = 80;              // 문자 메세지 최대 길이
                                                    // 변하지 않는 값이므로 final 을 사용한다.


    public SmsNotification(String receiver, String message) {          // 생성자

        super(receiver, message);                    // receiver 와 message는 부모 클래스가 처리한다.
    }

    @Override                                        // 문자 방식으로 send()를 구현한다.
    public void send() {
        System.out.println("[문자 발송]");
        printBasicInfo();
        System.out.println();
    }


    public void checkLength() {                       // 문자 알림만의 고유 기능

        if (getMessage().length() > MAX_LENGTH) {

            System.out.println("문자 메세지가 너무 깁니다.");

        } else {

            System.out.println("문자 메세지 길이가 적절합니다.");
        }
    }
}
