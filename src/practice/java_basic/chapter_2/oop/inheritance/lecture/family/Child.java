package practice.java_basic.chapter_2.oop.inheritance.lecture.family;

public class Child extends Parent {

    public String familyName = "gygim";

    public Child() {
        super();
        System.out.println("자식 생성자");
    }

    public void superTest() {
        System.out.println(super.familyName);
    }

    public void showSocialMedia() {
        System.out.println("SNS에서 우리 가문을 소개드립니다.");
    }

    // 자식 입장에서 재정의하고 싶을 때,
    @Override
    public void introduceFamily() {
        System.out.println("오버라이드");

    }


}
