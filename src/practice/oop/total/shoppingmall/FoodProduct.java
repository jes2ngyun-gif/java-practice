package practice.oop.total.shoppingmall;

public class FoodProduct extends Product {


    private String expirationDate;


    public FoodProduct(String name, int price, String expirationDate) {

        super(name, price);


        if (expirationDate == null || expirationDate.isEmpty()) {

            this.expirationDate = "유통기한 정보 없음";

        } else {

            this.expirationDate = expirationDate;
        }
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public void printProductInfo() {
        System.out.println("[실물 상품]");
        System.out.println("상품명 : " + getName());
        System.out.println("가격 : " + getPrice() + "원");
        System.out.println("유통기한 : " + expirationDate);
    }

    public void checkFreshness() {
        System.out.println(getName() + "의 신선도를 확인합니다.");
    }
}

