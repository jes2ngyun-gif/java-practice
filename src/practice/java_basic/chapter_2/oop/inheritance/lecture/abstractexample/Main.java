package practice.java_basic.chapter_2.oop.inheritance.lecture.abstractexample;

public class Main {

    public static void main(String[] args) {

        //추상클래스는 인스턴스화 할 수 없다.
//        Animal animal = new Animal();

        Cat cat = new Cat();
        cat.name = "cat";
        cat.sleep();

        // 자식에게 강제로 구현된 메서드
        cat.eat();
    }
}
