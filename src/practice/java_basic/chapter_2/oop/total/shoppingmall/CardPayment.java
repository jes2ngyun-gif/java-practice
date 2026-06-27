package practice.java_basic.chapter_2.oop.total.shoppingmall;

public class CardPayment implements Payment {

    private String cardCompany;

    public CardPayment(String cardCompany) {


        if (cardCompany == null || cardCompany.isEmpty()) {

            this.cardCompany = "알 수 없는 카드사";

        } else {
            this.cardCompany = cardCompany;
        }
    }

    public String getCardCompany() {
        return cardCompany;
    }

    @Override
    public void pay(int amount) {
        System.out.println("[카드 결제]");
        System.out.println(cardCompany + " 카드로 " + amount + "원을 결제합니다.");
    }


    public void checkCardLimit() {
        System.out.println(cardCompany + "카드 한도를 확인합니다.");
    }
}
