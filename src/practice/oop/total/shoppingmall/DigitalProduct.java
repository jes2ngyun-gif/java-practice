package practice.oop.total.shoppingmall;

public class DigitalProduct extends Product {


    private String downloadLink;


    public DigitalProduct(String name, int price, String downloadLink) {


        super(name, price);


        if (downloadLink == null || downloadLink.isEmpty()) {

            this.downloadLink = "다운로드 링크 없음";

        } else {

            this.downloadLink = downloadLink;
        }
    }

    public String getDownloadLink() {
        return downloadLink;
    }


    @Override
    public void printProductInfo() {
        System.out.println("[디지털 상품]");
        System.out.println("상품명 : " + getName());
        System.out.println("가격 : " + getPrice() + "원");
        System.out.println("다운로드 링크 : " + downloadLink);
    }


    public void sendDownloadLink() {
        System.out.println(getName() + "다운로드 링크를 발송합니다.");
    }
}
