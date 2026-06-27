package practice.java_basic.chapter_1.condition;

import java.util.Scanner;                         // 사용자 입력을 받기 위해 Scanner 클래스를 가져온다.
    // 홀수 / 짝수 판별 예제
public class ConditionPractice01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      // 사용자에게 키보드로 숫자를 입력받기 위한 Scanner 객체를 생성한다.

        System.out.println("숫자를 입력하세요 : ");      // 어떤 값을 입력해야 하는지 사용자에게 안내 문구를 출력한다.
        int number = scanner.nextInt();               // 사용자가 입력한 정수를 number 변수에 저장한다.

        if (number % 2 == 0) {                        //짝수는 2로 나누었을 때 나머지가 0이다.
            System.out.println("짝수입니다.");          // number % 2는 number를 2로 나눈 나머지를 의미한다.
                                                      // == 는 왼쪽 값과 오른쪽 값이 같은지 비교하는 연산자다.
        } else {
            System.out.println("홀수입니다.");          //if 조건이 거짓이면, 즉 2로 나눈 나머지가 0이 아니면 홀수이다.
        }

        scanner.close();                              //Scanner 사용을 마무리한다.
    }
}
