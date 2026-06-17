package practice.chapter_1.loop;

import java.util.Scanner;

// 별 피라미드 출력하기
// 조건 : 사용자가 정수 N을 입력하면 아래처럼 별을 출력한다.
//예시입력 : 3
// *
//**
//***
public class LoopPractice05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("줄 수를 입력하세요:");
        int n = scanner.nextInt();


        for(int i = 1; i <= n; i++) {



            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        scanner.close();
    }
}
