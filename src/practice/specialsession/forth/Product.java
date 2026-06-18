package practice.specialsession.forth;

public class Product {

    private int price;



    public Product(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {  // 새로운 가격으로 변경하는 메서드

        if (price < 0) {
            System.out.println("가격은 0보다 커야 해요.");

            return;
        }
        this.price = price;
    }

}
