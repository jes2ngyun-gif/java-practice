package practice.java_basic.chapter_2.oop.inheritance.lecture.family;

public class Parent {
    public String familyName = "스파르타";
    public int honor = 10;

    public Parent() {
        System.out.println("부모 생성자");
    }

    public void introduceFamily() {
        System.out.println("우리 " + this.familyName + "가문은 대대로 ....");

    }
}
