package practice.java_basic.chapter_2.oop.encapsulation.member;

public class Member {

    private String name;  //  회원의 이름을 저장하는 변수// private으로 선언했기 때문에 외부에서 직접 접근할 수 없음.
    private int age;      // 회원의 나이를 저장하는 변수// 외부에서 member.age 형태로 접근할 수 없다.
    private String password;  // 회원의 비밀번호를 저장하는 변수// 중요한 정보이므로 외부에서 직접 수정하지 못하도록 숨긴다.


    // 생 성 자
    // Member 객체를 생성할 때 처음 값을 넣어주는 역할을 한다.
    public Member(String name, int age, String password) {

        this.name = name;       // 전달받은 이름을 객체 내부의 name 필드에 저장한다.

        if (age < 0) {          // 음수 나이는 존재할 수 없으므로 검사한다.
            this.age = 0;       // 잘못된 값이 들어오면 0으로 초기화한다.

        }else {

            this.age =age;       // 정상적인 값이면, 전달받은 나이를 저장한다.

            // this.age → 객체가 실제로 가지고 있는 age 필드(멤버 변수)
            // age → 메서드가 호출될 때 전달받은 매개변수(parameter)

        }

        this.password = password; // 전달받은 비밀번호를 저장한다.
    }


    // 회원의 이름을 반환하는 메 서 드
    // getter 역할
    public String getName() {
        return name;                // name 필드의 값을 호출한 곳(Main)으로 돌려준다.
    }

    // 회원의 나이를 반환하는 메 서 드
    // getter 역할
    public int getAge() {
        return age;                  // age 값을 호출한 곳(Main)으로 돌려준다.
    }


    //회원의 나이를 변경하는 메 서 드
    public void changeAge(int age) {

        if (age < 0) {                         // 음수 나이는 허용하지 않는다.
            System.out.println("나이는 음수가 될 수 없습니다.");
            return;                            // 메서드를 즉시 종료한다.
        }

        this.age = age;         // 조건을 통과하면 새로운 나이로 변경한다.

        // this.age → 객체가 실제로 가지고 있는 age 필드(멤버 변수)
        // age → 메서드가 호출될 때 전달받은 매개변수(parameter)
        // 객체의 age = 매개변수 age
    }

    //회원의 비번을 변경하는 메 서 드
    public void changePassword(String password) {

        if(password.length() < 4) {          // 비먼 길이가 4글자 미만이면 변경하지 않는다.
            System.out.println("비밀번호는 4글자 이상이어야 합니다.");
            return;     //메서드를 종료한다.
        }

        this.password = password;         // 조건을 통과한 경우 새로운 비번으로 변경한다.
    }
}
