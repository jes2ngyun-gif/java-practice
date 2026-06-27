package practice.java_basic.chapter_2.oop.absrtaction.lecture.v1;

public class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("냥냐냥");
    }

    @Override
    public void exist() {
        System.out.println("고양이가 존재합니다.");

    }

    public void scratch() {
        System.out.println("스크래치");
    }
}
