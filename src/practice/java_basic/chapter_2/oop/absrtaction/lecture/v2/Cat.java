package practice.java_basic.chapter_2.oop.absrtaction.lecture.v2;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("냠냠냥냥오");
    }

    public void scratch() {
        System.out.println("스크래치");
    }
}
