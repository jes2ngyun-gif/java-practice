package practice.chapter_2.oop.total.notification;
 // EmailNotification은 이메일 알림을 담당하는 클래스
 // AbstractNotification을 상속받기 때문에 receiver, message 기능을 재사용할 수 있다.
public class EmailNotification extends AbstractNotification {


    private String title;                       // 이메일 제목은 이메일 알림에만 필요한 고유 데이터이다.

    public EmailNotification(String receiver, String message, String title) {           // 생성자

        super(receiver, message);               // 부모 생성자를 호출한다.
                                                // receiver와 message는 부모 클래스가 검증하고 저장한다.


        if (title == null || title.isEmpty()) { // title은 이메일 알림만의 데이터이므로 여기서 처리한다.

            this.title = "제목 없음";

        } else {

            this.title = title;
        }
    }

    public String getTitle() {                   // 이메일 제목을 읽는 getter
        return title;
    }


    @Override                                    // Notification 인터페이스의 send()를 실제 이메일 방식으로 구현한다.
    public void send() {
        System.out.println("[이메일 발송]");
        System.out.println("받는 사람 : " + getReceiver());
        System.out.println("제목 : " + title);
        System.out.println("내용 : " + getMessage());
        System.out.println();
    }

              // 이메일 알림만 가지고 있는 고유 기능
              // Notification 타입으로는 바로 호출할 수 있고, 다운캐스팅이 필요하다.
    public void attachFile() {
        System.out.println(getReceiver() + "에게 보낼 이메일에 파일을 첨부합니다.");
    }
}
