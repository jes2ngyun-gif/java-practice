package practice.chapter_1.loop;

import java.util.Scanner;

// 1부터 N까지 짝수만 출력하지 - for 문 + continue
// 사용자로부터 정수 N을 입력받고, 1부터 N까지 숫자 중 짝수만 출력하쇼.
// for문 사용, continue 사용, 홀수는 출력하지 않고 건너뛸 것
public class LoopPractice02_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);     // 사용자에게 키보드로 입력을 받기 위한 Scanner 객체 생성

        System.out.print("숫자 N을 입력하세요: ");       // 사용자에게 숫자 입력 안내

        int n = scanner.nextInt();                    // 입력받은 숫자를 정수형 n 변수에 저장


        for (int i = 1; i <= n; i++) {                // 1부터 n까지 숫자를 하나씩 확인한다

            if (i % 2 == 1) {                         // i를 2로 나누었을 때 나머지가 1이면 홀수이다.
                continue;                            // 홀수는 출력 대상이 아니므로 continue로 이번 반복을 건너뛴다.
            }

            System.out.println(i);                    // continue에 걸리지 않은 숫자는 '짝수'이므로 출력한다.
        }

        scanner.close();                               // Scanner 사용 종료
    }
}

// continue는 이번만 건너뛰고 다음 반복으로 넘어가는 문법이다.
// 비유하면 검사대에서
// "이 사람은 조건에 안 맞네? 다음 사람!" 하고 넘기는 것.