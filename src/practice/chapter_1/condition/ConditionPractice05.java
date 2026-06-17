package practice.chapter_1.condition;
// 영화 관람 가능 여부
import java.util.Scanner;       // 사용자 입력을 받기 위해 Scanner 클래스를 가져온다.

public class ConditionPractice05 {
    // 조건 : 19세 이상 → 관람 가능
    // 15세 이상이고 보호자가 있으면 → 관람 가능
    // 그 외 → 관람 불가

    // 나이 : 16
    // 보호자 동반 여부 (yes/no) : yes
    // 출력 : 관람 가능합니다.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);    // 키보드 입력을 받기 위한 Scanner 객체를 생성한다.

        System.out.print("나이 : ");                  // 사용자의 나이를 정수로 입력받는다.
        int age = scanner.nextInt();

        scanner.nextLine();                          // nextInt()는 숫자만 가져가고 엔터는 남긴다.
                                                     // 아래에서 문자열을 입력받기 전에 남아 있는 엔터를 제거한다.
        System.out.print("보호자 동반 여부 (yes/no) : ");   // 보호자 등반 여부를 문자열로 입력받는다.
        String guardian = scanner.nextLine();

        if (age >= 19) {                              // 19세 이상이면 보호자 여부와 상관없이 관람 가능하다.
            System.out.println("관람 가능합니다.");

        } else if (age >= 15 && guardian.equals("yes")) {  // 19세 미만이라도 15세 이상이고 보호자가 있으면 관람 가능하다.
            System.out.println("관람 가능합니다.");
        } else {
            System.out.println("관람 불가합니다.");         // 위 조건을 모두 만족하지 못하면 관람 불가이다.
        }

        scanner.close();                                 // Scanner 사용을 종료한다.
    }
}
