package practice.assignment.calculator;

import java.util.Scanner;
     // 사용자 입력을 받기 위해 Scanner 를 가져온다.

public class CalculatorApp {
     // CalculatorApp 클래스는 프로그램의 실행 흐름을 담당하는 호출부 클래스이다.
     // 사용자에게 숫자와 연산자를 입력받고, Calculator 객체에게 계산을 요청하고, 계산 결과를 출력하고, 결과 삭제 여부를 묻고, 프로그램을 계속 실행할지말지 결정함.
     // 직접 계산하지 않음. 계산은 Calculator에게 맡김.

    public static void main(String[] args) {     // main 메서드는 자바 프로그램이 시작되는 지점
                                                 // 프로그램을 실행하면 컴퓨터는 가장 먼저 main()을 찾는다.

        Scanner scanner = new Scanner(System.in);     //사용자 입력을 받기 위한 Scanner 객체를 생성한다.
                                                      // System.in은 키보드 입력을 의미한다.

        Calculator calculator = new Calculator();     // 실제 계산 기능을 가진 Calculator 객체를 생성한다.
                                                      // CalculatorApp은 계산 방법을 직접 알 필요가 없다.
                                                      // calculator.calculate()를 호출해서 계산을 요청하면 된다.


        while (true) {                                // while(true)는 사용자가 종료를 선택하기 전까지 계산을 계속 반복하기 위한 무한 반복문이다.

            System.out.print("첫번째 숫자 : ");
            int num1 = scanner.nextInt();

            System.out.print("두번째 숫자 : " );
            int num2 = scanner.nextInt();

            System.out.print("연산자를 입력하세요 (+, -, *, /) : ");
            char operator = scanner.next().charAt(0);          // 사용자가 입력한 문자열 중 첫 번째 글자만 가져와 char로 저장한다.
                                                               // scanner.next()는 문자열을 입력받는다.
                                                               // charAt(0)은 그 문자열의 첫번째 글자를 가져온다.

            double result = calculator.calculate(num1, num2, operator);
                 // Calculator 객체에게 계산을 요청한다.
                 // CalculatorApp이 직접 if문으로 계산하지 않고, calculator.calculate()를 호출하는 이유: 계산 책임은 Calculator 클래스에 있기 때문
                 // 이 한 줄에서 일어나는 일:
            // 1. num1, num2, operator 값이 Calculator로 전달된다.
            // 2. Calculator 내부에서 계산한다.
            // 3. 계산 결과를 resultList에 저장한다.
            // 4. 계산 결과를 return한다.
            // 5. return된 값을 result 변수에 저장한다.


            System.out.println("결과 : " + result);
            System.out.println("저장된 결과 목록 : " + calculator.getResultList());
                 // Calculator 내부에 저장된 결과 목록을 출력한다.
                 // resultList는 private 이므로 직접 접근할 수 없다.
                 // 그래서 getResultList() 메서드를 통해 조회한다.

            System.out.print("가장 먼저 저장된 결과를 삭제하시겠습니다? (yes 입력 시 삭제) : ");
            String removeAnswer = scanner.next();


            if(removeAnswer.equals("yes")) {           // 문자열 비교는 ==이 아니라 .equals()를 사용해야 한다.

                calculator.removeResult();             // Calculator 객체에게 가장 오래된 결과 삭제를 요청한다.
                                                       // CalculatorApp이 직접 resultList.remove(0)을 하지 않는 이유는:
                                                       // resultList는 Calculator의 내부 데이터이기 때문
                                                       // 내부 데이터는 해당 클래스가 직접 관리하는 것이 캡슐화에 맞다.

                System.out.println("삭제 후 결과 목록 : " + calculator.getResultList());

            }
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
            String answer = scanner.next();

            if (answer.equals("exit")) {
                break;
            }

        }
        scanner.close();
    }
}


