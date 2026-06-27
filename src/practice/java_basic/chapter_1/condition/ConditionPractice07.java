package practice.java_basic.chapter_1.condition;
// 음식 주문 시스템
import java.util.Scanner;                      // 사용자 입력을 받기 위해 Scanner 클래스를 가져온다.

//switch 문제. 음식 주문 시스템
//번호를 입력 받는다.
//1 → 김치찌개
//2 → 된장찌개
//3 → 제육볶음
//4 → 돈까스
//그 외 → 없는 메뉴
public class ConditionPractice07 {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);  // 키보드 입력을 받기 위한 Scanner 객체를 생성한다.

        System.out.print("메뉴 번호를 입력하세요. : ");   // 사용자가 선택할 메뉴 번호를 정수로 입력받는다.
        int menu = scanner.nextInt();

        switch (menu){                              // switch문은 하나의 값(menu)에 따라 실행할 코드를 나눌 때 사용한다.
                                                  // 메뉴 번호처럼 정해진 값 중 하나를 선택하는 구조에 적합하다.
            case 1:
                System.out.println("김치찌개");
                break;                              // 메뉴 값이 1이면 김치찌개를 출력한다.

            case 2:
                System.out.println("된장찌개");
                break;                               // 메뉴 값이 2이면 된장찌개를 출력한다.

            case 3:
                System.out.println("제육볶음");
                break;                              // 메뉴 값이 3이면 제육볶음을 출력한다.

            case 4:
                System.out.println("돈까스");
                break;                             // 메뉴 값이 4이면 돈까스를 출력한다.

            default:
                System.out.println("없는 메뉴입니다.");    // 위 case 중 어떤 값에도 해당하지 않으면 실행된다.
        }

        scanner.close();                 // Scanner 사용을 종료한다.
    }
}
