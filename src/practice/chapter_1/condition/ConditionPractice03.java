package practice.chapter_1.condition;

import java.util.Scanner;

public class ConditionPractice03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);    // 사용자에게 월(month)을 입력받기 위한 Scanner 객체를 생성한다.

        System.out.println("월을 입력하세요 : ");      // 사용자에게 어떤 값을 입력해야 하는지 안내 문구를 출력한다.
        int month = scanner.nextInt();               // 사용자가 입력한 정수를 month 변수에 저장한다.

        switch (month) {                            // switch문은 하나의 값(month)에 따라 실행할 코드를 나누는 조건문이다.
                                                   // if 문보다 특정 값이 여러 개로 나뉠 때 보기 좋게 작성할 수 있다.
            case 3:
            case 4:
            case 5:                                 // 3,4,5월은 모두 봄이므로 같은 출력 코드로 연결한다.
                System.out.println("봄");
                break;                              // 해당 계절을 출력한 뒤 switch문을 빠져나간다. : break;

            case 6:
            case 7:
            case 8:
                System.out.println("여름");          // 6,7,8월은 여름이다.
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("가을");           // 9,10,11월은 가을이다.
                break;

            case 12:
            case 1:
            case 2:
                System.out.println("겨울");            // 12,1,2 월은 겨울이다.
                break;

            default:                                        // 위 case에 해당하지 않는 값이 들어오면 실행된다.
                    System.out.println("잘못된 입력입니다.");  // 예) 0,13,-1 등 잘못된 월 입력


        }
            scanner.close();                                // Scanner 사용을 종료한다.

    }
}
