package practice.chapter_1.loop;
// 입력한 숫자의 구구단 출력하기
// 조건 : 사용자가 `2~9 사이의 숫자`를 입력하면 해당 단의 구구단을 출력한다.
// 단, 범위를 벗어나면 "잘못된 입력입니다."를 출력한다.
import java.util.Scanner;

public class LoopPractice03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("2~9 사이의 숫자를 입력하세요: ");
        int dan  = scanner.nextInt();

        if ( dan < 2 || dan > 9 ){
            System.out.println("잘못된 입력입니다.");
        } else {



            for (int i = 1; i <= 9; i++) {
                System.out.println( dan + " x " + i + " = " + ( dan * i));
            }
        }
        scanner.close();
    }
}
