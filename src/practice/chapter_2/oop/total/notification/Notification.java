package practice.chapter_2.oop.total.notification;

public interface Notification {
                         // Notification은 알림 기능의 "규칙"을 정의하는 인터페이스이다.
                         // 이 인터페이스를 구현하는 클래스는 반드시 send() 를 구현해야 한다.


    void send();         // 모둔 알림은 반드시 보낼 수 있어야 한다.
                         // 단, 이메일/ 문자/ 카카오톡은 보내는 방식이 다르므로 구현은 각 클래스가 한다.

}
