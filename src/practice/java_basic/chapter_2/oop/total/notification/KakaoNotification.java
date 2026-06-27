package practice.java_basic.chapter_2.oop.total.notification;
          // KakaoNotification은 카카오톡 알림을 담당하는 클래스이다.
public class KakaoNotification extends AbstractNotification {


    private String channelName;              // 카카오톡 채널명


    public KakaoNotification(String receiver, String message, String channelName) {
                                             // 생성자

        super(receiver, message);            // 공통 데이터는 부모 생성자에서 처리한다.


        if (channelName == null || channelName.isEmpty()) {          // 카카오톡 알림만의 데이터 처리

            this.channelName = "기본 채널";

        } else {

            this.channelName = channelName;
        }
    }

    public String getChannelName() {           // 채널명 getter
        return channelName;
    }

    @Override                                   // 카카오톡 방식으로 send()를 구현한다.
    public void send() {
        System.out.println("[카카오톡 알림]");
        System.out.println("채널명 : " + channelName);
        printBasicInfo();
        System.out.println();
    }


    public void addFriendMessage() {             // 카카오톡 알림만의 고유 기능
        System.out.println(channelName + "채널 친구 추가 안내 메세지를 함께 보냅니다.");
    }
}
