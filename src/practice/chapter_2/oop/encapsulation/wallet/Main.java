package practice.chapter_2.oop.encapsulation.wallet;

public class Main {

    public static void main(String[] args) {

        // Wallet 객체를 생성하면서 처음 가진 돈을 10000원으로 설정한다.
        Wallet wallet = new Wallet(10000);

        // 지갑에 5000원을 넣는다.
        wallet.deposit(5000);

        // 지갑에서 3000원을 뺀다.
        wallet.withdraw(3000);

        // 가진 돈보다 많은 금액을 빼려고 시도한다.
        wallet.withdraw(20000);

        // 현재 지갑에 남아 있는 돈을 출력한다.
        System.out.println("현재 지갑의 돈: " + wallet.getMoney() + "원");
    }

}
