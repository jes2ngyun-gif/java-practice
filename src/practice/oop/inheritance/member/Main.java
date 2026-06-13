package practice.oop.inheritance.member;

public class Main {
    public static void main(String[] args) {

        Member member = new Member("정윤", 30000);       // 일반 회원 객체 생성

        VipMember vipMember = new VipMember("VIP정윤", 30000);      // VIP 회원 객체 생성

        member.printOrderInfo();     // 일반 회원 주문 정보 출력

        vipMember.printOrderInfo();  // VIP 회원 주문 정보 출력
    }
}
