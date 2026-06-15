package practice.oop.total.notification;

public abstract class AbstractNotification implements Notification {
                                             // AbstractNotification은 알림들의 공통 데이터를 관리하는 추상 클래스이다.
                                             // Notification 인터페이스를 구현하지만, send()는 자식 클래스가 구현하도록 남겨둔다.



    private String receiver;                                     // 알림을 받을 사람
                                                                 // private으로 막아서 외부에서 직접 수정하지 못하게 한다.

    private String message;                                      // 알림 메세지


    public AbstractNotification(String receiver, String message) {             // 생성자
                                                                               // 모든 알림 객체는 생성될 때 수신자와 메세지를 반드시 받아야 한다.
        if (receiver == null || receiver.isEmpty()) {

            this.receiver = "수신자 없음";                          // 수신자가 null이거나 비어있으면 기본값을 넣는다.

        } else {

            this.receiver = receiver;
        }

        if (message == null || message.isEmpty()) {                // 메세지가 null이거나 비어있으면 기본값을 넣는다.

            this.message = "내용 없음";

        } else {
            this.message = message;
        }
    }

    public String getReceiver() {                                 // receiver는 private이므로 외부에서 직접 접근할 수 없다.
        return receiver;                                          // 대신 getter로 읽을 수 있게 한다.
    }


    public String getMessage() {                                  // message도 getter로만 읽게 한다.
        return message;
    }


    public void printBasicInfo() {                                // 공통 출력 기능
        System.out.println("받는 사람 : " +  receiver);            // 자식 클래스들이 필요하면 사용할 수 있다.
        System.out.println("내용 : " + message);
    }
}
