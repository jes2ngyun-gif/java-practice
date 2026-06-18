package practice.generic.lecture;

public class Main {
    public static void main(String[] args) {

        // 1. 재사용 불가 케이스
        Box box1 = new Box(100);
//        new Box("ABC");
//        new Box(0.1);
        // 문자열도 담고 싶고, 소수점도 담고 싶은 상황이 있을 때,
        // 이 클래스는 정수로 고정이 되어 있기 때문에
        // 다른 데이터 타입을 유연하게 받지 못함. 즉, 재사용이 안된다.
        // 새로운 클래스를 만들어서 사용해야 함.
        // 이렇게 재사용이 불가능한 문제는 다형성을 활용해서 해결할 수 있긴함.

        // 낮은 타입 안정성
        ObjectBox strBox = new ObjectBox("ABC");
        ObjectBox intBox = new ObjectBox(100);
        // 재사용성은 해결함. 근데 박스 안에 담긴 데이터를 사용하기 위해서는 다운 캐스팅 필요


        // item을 활용하기 위해서는 다운 캐스팅이 필요함.
        String item = (String) strBox.getItem();
        System.out.println("item = " + item);

//        String item2 = (String) intBox.getItem();에러에러에러

        // 제네릭 활용
        // 1. 재사용성 보장 (타입소거가 일어나면: T -> Object)
        GenericBox<String> strGBox = new GenericBox<String>("ABC");
        GenericBox<Integer> intGBox = new GenericBox<Integer>(100);
        GenericBox<Double> doubleGBox = new GenericBox<Double>(0.2);

        // 2. 타입 안정성 보장-> 인스턴화된 객체들을 활용해서 보자
        //                 -> 타입소거가 일어나면: 자동으로 다운캐스팅 발생.(컴파일러가 다운캐스팅을 삽입.)
        String strGBoxItem = strGBox.getItem();
        // item을 getter를 통해 가지고 와서 출력
        System.out.println("strGBoxItem = " + strGBoxItem);

        Integer intGBoxItem = intGBox.getItem();
        // intGBox에서도 데이터(item)를 가져와서 출력
        System.out.println("intGBoxItem = " + intGBoxItem);

        Double doubleGBoxItem = doubleGBox.getItem();
        System.out.println("doubleGBoxItem = " + doubleGBoxItem);


        // 일반 메서드(String 기준으로 타입 소거가 발생함)
        strGBox.printItem("ABC");
//        strGBox.printItem(100);   // 불가능
//        strGBox.printItem(0.2);   // 불가능

        // 제네릭 메서드(String과 상관 없음)
        strGBox.printBoxItem("ABC");
        strGBox.printBoxItem(100);
        strGBox.printBoxItem(0.2);


    }
}
