package practice.java_basic.chapter_1.loop;

import java.util.Scanner;

// 비밀번호 맞힐 때까지 반복하기
// 조건: 정답 비밀번호는 '1234'이다.
// 사용자가 비밀번호는 입력하고, 맞히면 "로그인 성공"을 출력한다.
// 틀리면 계속 다시 입력받는다.
public class LoopPractice04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int correctPassword = 1234;


        int inputPassword;


        while (true) {
            System.out.print("비밀번호 입력: ");
            inputPassword = scanner.nextInt();


            if (inputPassword == correctPassword) {
                System.out.println("로그인 성공");


                break;
            }

            System.out.println("비밀번호가 틀렸습니다.");
        }
        scanner.close();
    }
}
