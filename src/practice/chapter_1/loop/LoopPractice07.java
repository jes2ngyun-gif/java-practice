package practice.chapter_1.loop;

import java.util.Scanner;

// 비밀번호 맞히기 - while문 + break;
// 문제 : 정답 비밀번호는 'java123'이다.
// 사용자가 비밀번호를 계속 입력하게 하고, 정답을 입력하면 '로그인 성공'을 출력하고 종료된다.
// 코딩조건 : while문 사용, break 사용, 문자열 비교는 .equals() 사용
public class LoopPractice07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);     // 사용자 입력을 받기 위한 Scanner 객체 생성

        String password = "java123";                // 정답 비밀번호를 문자열로 저장


        while (true) {                              // while(true)는 조건 없이 계속 반복된다.
                                                    // 대신 내부에서 break를 만나면 반복이 종료된다.
            System.out.print("비밀번호를 입력하세요: ");    // 사용자에게 비밀번호 입력 요청

            String input = scanner.nextLine();      // 사용자가 입력한 문자열을 input 변수에 저장


            if (input.equals(password)) {           // 문자열은 ==이 아니라 equals()로 비교해야 한다.

                System.out.println("로그인 성공");    // 비밀번호가 맞으면 성공 메세지 출력

                break;                             // 비밀번호를 맞혔으므로 반복문 종료
            }

            System.out.println("비밀번호가 틀렸습니다.");   // 비밀번호가 틀렸을 때 출력되는 메세지
        }

        scanner.close();                            // scanner 사용 종료
    }
}

// while 문은 몇 번 반복할지 모를 때 쓰기 좋다.

// 비밀번호 입력은 사용자가 한 번에 맞힐 수도 있고, 열 번 틀릴 수도 있다.
// 그래서 for문 보다 while문이 더 자연스럽다.