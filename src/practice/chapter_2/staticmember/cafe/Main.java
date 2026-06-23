package practice.chapter_2.staticmember.cafe;

public class Main {

    public static void main(String[] args) {

        Customer c1 = new Customer("유미", 20);
                // 첫번째 고객 객체를 생성한다.

        Customer c2 = new Customer("룰루", 22);
                // 두번째 고객 객체를 생성한다.

        Customer c3 = new Customer("나미", 25);
                // 세번째 고객 객체를 생성한다.

        Customer.printCustomerCount();
                // Customer 클래스가 공유하는 전체 고객 수를 출력한다.
    }
}
