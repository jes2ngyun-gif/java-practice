package practice.chapter_2.oop.total.shoppingmall;

public class KakaoPayment implements Payment {

    private String kakaoId;


    public KakaoPayment(String kakaoId) {


        if (kakaoId == null || kakaoId.isEmpty()) {

            this.kakaoId = "카카오ID 없음";

        } else {

            this.kakaoId = kakaoId;
        }
    }

    public String getKakaoId() {
        return kakaoId;
    }

    @Override
    public void pay(int amount) {
        System.out.println("[카카오페이 결제]");
        System.out.println(kakaoId + " 계정으로 " + amount + " 원을 결제합니다.");
    }

    public void sendKakaoReceipt() {
        System.out.println(kakaoId + " 계정으로 카카오페이 영수증을 발송합니다.");
    }
}
