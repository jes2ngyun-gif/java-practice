package practice.specialsession.class_objectt;

public class Main {

    public static void main(String[] args) {

        Member m1 = new Member("홍길동", false, "VIP");
        Member m2 = new Member("김철수", true, "VIP");
        Member m3 = new Member("이영희", false, "일반");

        m1.printRentalInfo();
        m2.printRentalInfo();
        m3.printRentalInfo();
    }
}
