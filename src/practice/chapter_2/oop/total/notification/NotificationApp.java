package practice.chapter_2.oop.total.notification;
           // 프로그램 실행 클래스
           // 객체를 생성하고 메서드를 호출하는 호출부 역할을 한다.
public class NotificationApp {

    public static void main(String[] args) {


        // 왼쪽 타입은 인터페이스 Notification               오른쪽 실제 객체는 EmailNotification
        // 이것이 업캐스팅이며, 다형성의 시작이다.

        Notification email = new EmailNotification("jeongyun@email.com", "회원가입을 환영합니다.", "가입 안내");


        Notification sms = new SmsNotification("010-1234-4321", "인증번호는 1234입니다.");

        Notification kakao = new KakaoNotification("정윤", "주문하신 추르 배송이 시작되었습니다.", "쇼핑몰 알림통");



        Notification[] notifications = {email, sms, kakao};          // 서로 다른 알림 객체들을 Notification 타입 배열에 저장한다.
                                                                     // 실제 객체는 다르지만, 모두 Notification 규칙을 지키고 있기 때문에 가능하다.


        for (Notification notification : notifications) {            // 반복문으로 모든 알림을 발송한다.
            notification.send();                                     // 변수 타입은 Notification이지만,
        }                                                            // 실제 실행되는 send()는 각 객체의 오버라이딩된 send()이다.


        if (email instanceof EmailNotification) {                     // 여기서부터는 다운캐스팅 실습이다.
                                                                      // email 변수의 타입은 Notification이므로 attachFile()을 바로 호출할 수 없다.
            EmailNotification emailNotification = (EmailNotification) email;
            // 실제 객체가 EmailNotification이 맞으므로 안전하게 다운캐스팅한다.

                                                                      // attachFile()은 EmailNotification만의 고유 기능이기 때문이다.
            emailNotification.attachFile();
            // 다운캐스팅 후 이메일 고유 기능 사용
        }

        System.out.println();



        if (sms instanceof KakaoNotification) {                        // sms는 실제로 SmsNotification 객체이다.
                                                                       // KakaoNotification으로 다운캐스팅하면 안 된다.
            KakaoNotification kakaoNotification = (KakaoNotification) sms;  // 그래서 instanceof로 먼저 확인한다.
            kakaoNotification.addFriendMessage();

        } else {

            System.out.println("sms는 카카오톡 알림 객체가 이닙니다.");
        }
        System.out.println();


        if (sms instanceof SmsNotification) {                            // 문자 알림만의 기능도 안전하게 사용해본다.

            SmsNotification smsNotification = (SmsNotification) sms;
            smsNotification.checkLength();
        }
    }
}
