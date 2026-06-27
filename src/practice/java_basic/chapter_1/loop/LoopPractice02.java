package practice.java_basic.chapter_1.loop;
// 짝수만 출력하기
// 조건 : 사용자가 정수 N을 입력하면 1부터 N까지의 숫자 중 짝수만 출력한다.
import java.util.Scanner;         // 사용자 입력을 받기 위해 Scanner 클래스를 가져온다.

public class LoopPractice02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    // 키보드로 입력을 받기 위한 Scanner 객체를 생성한다.


        System.out.print("정수 N을 입력하세요: ");       // 사용자가 입력한 숫자까지 검사한다.
        int n = scanner.nextInt();


        for (int i = 1; i <= n; i++) {                // 1부터 n까지 숫자를 하나씩 확인한다.

            if (i % 2 == 0) {                         // i를 2로 나누었을 때 나머지가 0이면 짝수다.
                System.out.print(i + " ");
            }
        }
            scanner.close();

    }
}
