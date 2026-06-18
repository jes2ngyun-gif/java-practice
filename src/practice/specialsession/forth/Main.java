package practice.specialsession.forth;

public class Main {
    public static void main(String[] args) {


        Product p = new Product(10000);

        p.setPrice(-5000);

        System.out.println(p.getPrice());
    }
}
