package practice.loop;
// 1부터 N까지 합 구하기
// 조건: 사용자가 정수 N을 입력하면 1부터 N까지의 합을 출력한다.-> N!

import java.util.Scanner;                       // 사용자가 입력을 받기 위해 Scanner 클래스를 가져온다.

public class LoopPractice01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       // 키보드 입력을 받기 위한 Scanner 객체를 생성한다.

        System.out.print("정수 N을 입력하세요: ");        // 어디까지 더할 것인지 사용자에게 입력을 받는다.
        int n = scanner.nextInt();                     // n을 정수로 입력 받는다.

        int sum = 0;                                    // 누적된 합계를 저장할 변수.
        //i : 1 → 2 → 3 → 4 → 5                        // 아직 아무 숫자도 더하지 않았으므로 0으로 시작한다.
        //sum : 0 → 1 → 3 → 6 → 10 → 15
        for (int i = 1; i <= n; i++) {                  //i를 1부터 시작하여 n까지 1씩 증가시키면서
                                                         // 각 숫자를 sum에 계속 더해 나간다.

            sum += i;                                  // 현재 i값을 기존 합계(sum)에 누적한다.
                                                       // 예) sum = 3, i = 3 → sum = 6
        }

        System.out.println("1부터 " + n + "까지의 합: " + sum);  // 최종적으로 계산된 1부터 n까지의 합을 출력한다.

        scanner.close();                              // Scanner 사용 종료. 자원을 반납한다.
    }
}
