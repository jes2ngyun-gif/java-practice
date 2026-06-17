package practice.chapter_1.loop;

import java.util.Scanner;

// 0을 입력할 때까지 숫자 합계 구하기 - while문
// 문제 : 사용자가 숫자를 계속 입력한다.
//        입력한 숫자들을 모두 더하다가 0을 입력하면 반복을 종료하고 최종 합계를 출력하쇼
// 코딩조건 : while문 사용, 0 입력시 종료, 입력한 숫자는 합계에 누적.
public class LoopPractice08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      // 사용자 입력을 받기 위한 Scanner 객체 생성

        int number;                               // 사용자가 입력한 숫자를 저장할 변수

        int sum = 0;                              // 입력한 숫자들의 합계를 저장할 변수


        while (true) {                           // 처음에는 반복을 계속 진행하기 위해 true를 사용한다.

            System.out.print("숫자를 입력하세요. 0을 입력하면 종료됩니다: ");      // 사용자에게 숫자 입력 요청

            number = scanner.nextInt();           // 사용자가 입력한 숫자를 number 변수에 저장

            if (number == 0) {                   // 입력값이 0이면 더 이상 합산하지 않고 반복을 종료한다.
                break;
            }

            sum += number;                        // 0이 아닌 숫자는 sum에 누적한다.
        }

        System.out.println("최종 합계: " + sum);   // 반복이 끝난 뒤 최종 합계를 출력한다.

        scanner.close();                           // scanner 사용 종료.
    }
}

// 핵심은 종료 조건.
// 사용자가 언제 0을 입력할지 모르기 때문에 while문이 적합하다.