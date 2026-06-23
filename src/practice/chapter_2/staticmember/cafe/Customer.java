package practice.chapter_2.staticmember.cafe;

public class Customer {

    String name;             // 고객마다 이름이 다르므로 인스턴스 변수로 선언한다.

    int age;                 // 고객마다 나이가 다르므로 인스턴스 변수로 선언한다.

    static int customerCount = 0;     // 전체 고객 수는 모든 Customer 객체가 함께 공유해야 하므로 static 변수로 선언한다.

    public Customer(String name, int age) {      // Customer 객체가 생성될 때 이름과 나이를 전달받는 `생성자`

        this.name = name;                  // 매개변수 name 값을 현재 객체의 name 필드에 저장한다.

        this.age = age;                    // 매개변수 age 값을 현재 객체의 age 필드에 저장한다.

        customerCount++;                   // 고객 객체가 생성될 때마다 전체 고객 수를 1 증가시킨다.

    }

    public static void printCustomerCount() {       // 전체 고객 수는 객체마다 다른 값이 아니라
                                                    // 클래스가 공유하는 값이므로 static `메서드`로 출력한다.

        System.out.println("전체 고객 수 : " + customerCount);
              // static 변수 customerCount 값을 출력한다.
    }
}
