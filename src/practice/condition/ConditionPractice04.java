package practice.condition;

import java.util.Scanner;                                 // 사용자 입력을 받기 위해 Scanner  클래스를 가져온다.

public class ConditionPractice04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);         // 키보드 입력을 받기 위한 Scanner 객체를 생성한다.

        System.out.print("첫 번째 숫자 : ");            // 첫번째 정수를 입력받는다.
        int num1 = scanner.nextInt();                 // print는 줄바꿈을 하지 않기 때문에 사용자가 같은 줄에 값을 입력할 수 있다.

        System.out.print("두 번째 숫자 : ");            // 두번째 정수를 입력받는다.
        int num2 = scanner.nextInt();

        scanner.nextLine();
        // nextLine()는 숫자만 가져가고 엔터(|n)는 입력 버퍼에 남긴다.
        // 위에서 nextLine()으로 연산자를 입력받기 전에,
        // 남아있는 엔터를 한 번 비워준다.


        System.out.print("연산자를 입력하세요 (+, -, *, /) : ");
        String operator = scanner.nextLine();
        // 수행할 연산자를 문자열로 입력받는다.
        // 연산자는 계산할 숫자가 아니라 "+", "-", "*", "/" 같은 문자이므로 String 으로 저장한다.


        switch (operator) {                                    // 입력받은 연산자 값에 따라 실행할 계산 코드를 선택한다.

            case "+":                                         // operator 값이 "+"와 같으면 덧셈을 수행한다.
                System.out.println(" 결과 : " + (num1 + num2));
                break;                                        // 덧셈 결과를 출력한 뒤 switch문을 빠져나간다.


            case "-":                                          // operator 값이 "-"와 같으면 뺄셈을 수행한다.
                System.out.println("결과 : " + (num1 - num2));
                break;

            case "*":                                           // operator 값이 "*"와 같으면 곱셈을 수행한다.
                System.out.println("결과 : " + (num1 * num2));
                break;

            case "/":                                            // operator 값이 "/"와 같으면 나눗셈을 수행한다.
                System.out.println("결과 : " + ((double) num1 / num2));   // int끼리 나누면 소수점 아래가 버려진다.
                break;                                      // num1을 double로 형변환하여 소수점 결과가 나오도록 한다.


            default:                                       // 위 case 중 어떤 연산자와도 일치하지 않으면 실행된다.
                System.out.println("잘못된 연산자입니다.");
        }

        scanner.close();                                     // Scanner 사용을 종료한다.

    }
}
