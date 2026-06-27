package practice.java_basic.chapter_2.oop.polymorphism.lecture;

public class Main {
    public static void main(String[] args) {


        //다형성 활용
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.exist();
        animal1.makeSound();

        animal2.exist();
        animal2.makeSound();

        // 업캐스팅 주의사항
//        animal1.scatch();
//        animal2.wag();

        // 다운캐스팅
        Cat cat = (Cat) animal1;
        cat.scratch();

        Dog dog = (Dog) animal2;
        dog.wag();

        // 잘못된 다운캐스팅 문제
//        Cat cat2 = (Cat) animal2;

        // 다운캐스팅시 instanceof 활용
        if (animal1 instanceof Cat) {
            Cat cat2 = (Cat) animal1;
            cat2.scratch();

        }else {
            System.out.println("객체가 고양이가 아닙니다!");
        }


    }
}
