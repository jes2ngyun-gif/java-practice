package practice.oop.encapsulation.member;

public class Main {

    public static void main(String[] args) {

        Member member = new Member("콩떡", 5, "cute123");
                // Member 객체를 생성한다.
                // 회원의 이름, 나이, 비밀번호를 전달하면서 객체를 만든다.



        member.changeAge(5);
                // 회원의 나이를 5살로 변경한다.
                // age 변수에 직접 접근하는 것이 아니라 changeAge() 메서드를 통해 변경된다.


        member.changePassword("cute123");
                // 회원의 비번을 변경한다.
                // pw 필드에 직접 접근하지 않고, changePassword() 메서드를 통해 변경된다.

        System.out.println("이름 : " + member.getName());
                // getName() 메서드를 이용해 회원 이름을 가져온다.
        System.out.println("나이 : " + member.getAge());
                // getAge() 메서드를 이용해 회원의 나이를 가져온다.
    }
}
