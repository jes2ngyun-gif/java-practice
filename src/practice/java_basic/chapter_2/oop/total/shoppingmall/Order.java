package practice.java_basic.chapter_2.oop.total.shoppingmall;

public class Order {


    private Customer customer;
    private Product product;
    private Payment payment;

    public Order(Customer customer, Product product, Payment payment) {
        this.customer = customer;
        this.product = product;
        this.payment = payment;
    }

    public void processOrder() {

        System.out.println("====== 주문 시작 ======");

        customer.printCustomerInfo();
        System.out.println();

        product.printProductInfo();
        System.out.println();

        payment.pay(product.getPrice());

        System.out.println("====== 주문 완료 ======");
        System.out.println();
    }


    public void processProductSpecialFeature() {

        if (product instanceof FoodProduct) {

            FoodProduct foodProduct = (FoodProduct) product;
            foodProduct.checkFreshness();

        }else if (product instanceof DigitalProduct) {

            DigitalProduct digitalProduct = (DigitalProduct) product;
            digitalProduct.sendDownloadLink();

        }
    }


    public void processPaymentSpecialFeature() {

        if (payment instanceof CardPayment) {

            CardPayment cardPayment = (CardPayment) payment;
            cardPayment.checkCardLimit();

        } else if (payment instanceof KakaoPayment) {

            KakaoPayment kakaoPayment = (KakaoPayment) payment;
            kakaoPayment.sendKakaoReceipt();

        } else if (payment instanceof TossPayment) {

            TossPayment tossPayment = (TossPayment) payment;
            tossPayment.sendTossNotification();
        }
    }
}
