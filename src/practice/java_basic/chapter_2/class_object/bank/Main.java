package practice.java_basic.chapter_2.class_object.bank;

public class Main {
    public static void main(String[] args) {

        BankAccount bankaccountA = new BankAccount("콩떡", 10000);
                      // 콩떡 계좌 객체를 생성한다.
                      // new BankAccount(...)를 만나면 BankAccount 생성자로 이동한다.
                      //"콩떡", 10000 값이 생성자의 owner, balance로 전달된다.

        BankAccount bankaccountB = new BankAccount("나비", 5000);
                       // 나비 계좌 객체를 생성한다.
                       //bankaccountA와 bankaccountB는 서로 다른 계좌 객체다.


        bankaccountA.printInfo();             // bankaccountA의 계좌 정보를 출력한다.
                                              // 현재 this는 bankaccountA다.

        bankaccountB. printInfo();             // bankaccountB의 계좌 정보를 출력한다.
                                               // 현재 this는 bankaccountB다.

        bankaccountA.deposit(3000);      // bankaccountA 계좌에 3000원을 입금한다.
                                               // bankaccountA의 balance만 변경된다.

        bankaccountB.withdraw(2000);      // bankaccountB 계좌에서 2000원을 출금한다.
                                                // bankaccountB의 balance만 변경된다.

        bankaccountA.printInfo();               // 입금 후 bankaccount의 계좌 정보를 다시 출력한다.

        bankaccountB.printInfo();               // 출금 후 bankaccount의 계좌 정보를 다시 출력한다.
    }
}
