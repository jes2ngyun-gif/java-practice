package practice.java_basic.chapter_1.condition;

import java.util.Scanner;                         // 사용자 입력을 받기 위해 Scanner 클래스를 가져온다.

public class ConditionPractice02 {

     // 로그인 시스템 예제
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);    // 사용자에게 키보드로 비밀번호를 입력받기 위한 Scanner 객체를 생성한다.

        System.out.println("비밀번호를 입력하세요 : ");    // 사용자에게 비밀번호 입력을 안내한다.
        String password = scanner.nextLine();           // 사용자가 입력한 문자열을 password 변수에 저장한다.

        if (password.equals("1234")) {                  // equals()는 문자열의 내용이 같은지 비교하는 메서드이다.
            System.out.println("로그인 성공");            // 사용자가 입력한 값과 "1234"가 같으면 로그인 성공을 출력한다.

        } else {
            System.out.println("비밀번호가 틀렸습니다.");    // 입력한 값이 "1234"와 다르면 로그인 실패를 출력한다.
        }

        scanner.close();                                  // Scanner 사용을 종료한다.

    }
}
