package practice.java_basic.chapter_2.oop.total.shoppingmall;

public abstract class Product {

    private String name;

    private int price;


    public Product(String name, int price) {

        if (name == null || name.isEmpty()) {
            this.name = "상품명 없음";

        } else {
            this.name = name;
        }

        if (price < 0) {
            this.price = 0;

        } else {
            this.price = price;
        }
    }


    public String getName() {

        return name;
    }


    public int getPrice() {

        return price;
    }


    public abstract void printProductInfo();
}
