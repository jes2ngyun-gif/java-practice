package practice.chapter_2.oop.absrtaction.payment;

public class Main {
    public static void main(String[] args) {

        CardPayment cardPayment = new CardPayment(50000);

        BankTransferPayment bankPayment = new BankTransferPayment(30000);

        cardPayment.printInfo();
        cardPayment.pay();

        System.out.println();

        bankPayment.printInfo();
        bankPayment.pay();
    }
}
