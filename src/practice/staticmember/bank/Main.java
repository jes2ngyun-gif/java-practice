package practice.staticmember.bank;

public class Main {

    public static void main(String[] args) {


        BankAccount account1 = new BankAccount("유미", 50000);
                   // 유미의 은행 계좌 객체를 생성한다.

        BankAccount account2 = new BankAccount("룰루", 120000);
                   // 룰루의 은행 계좌 객체를 생성한다.




        account1.deposit(60000);
                   // 유미 계좌에 60,000원을 입금한다.

        account2.deposit(10000);
                   // 룰루 계좌에 10,000원을 입금한다.

        account1.printInfo();
                    // 유미 계좌 정보를 출력한다.

        account2.printInfo();
                    // 룰루 계좌 정보를 출력한다.
    }
}
