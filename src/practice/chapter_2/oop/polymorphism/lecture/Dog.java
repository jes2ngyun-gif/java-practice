package practice.chapter_2.oop.polymorphism.lecture;

public class Dog implements Animal {

    @Override
    public void exist() {
        System.out.println("강아지가 존재합니다.");

    }

    @Override
    public void makeSound() {
        System.out.println("멍멍");

    }

    public void wag() {
        System.out.println("흔들흔들~");
    }
}
