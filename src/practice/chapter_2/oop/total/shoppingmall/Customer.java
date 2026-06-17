package practice.chapter_2.oop.total.shoppingmall;

public class Customer {

    private String name;

    private String phoneNumber;


    public Customer(String name, String phoneNumber) {


        if (name == null || name.isEmpty()) {

            this.name = "이름 없음";

        } else {
            this.name = name;
        }

        if (phoneNumber == null || phoneNumber.isEmpty()) {
            this.phoneNumber = "전화번호 없음";
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    public String getName() {

        return name;
    }

    public String getPhoneNumber() {

        return phoneNumber;
    }

    public void printCustomerInfo() {
        System.out.println("[고객 정보]");
        System.out.println("이름 : " + name);
        System.out.println("전화번호 : " + phoneNumber);
    }
}
