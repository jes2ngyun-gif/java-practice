package practice.java_basic.chapter_1.condition;
// ATM 출금
// 조건: 출금 금액이 0 이하이면 잘못된 금액
// 잔액보다 많이 출금하면 잔액 부족
// 정상 범위면 출금 성공
import java.util.Scanner;             // 사용자 입력을 받기 위해 Scanner 클래스를 가져온다.

public class ConditionPractice06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      // 키보드 입력을 받기 위한 Scanner 객체를 생성한다.

        System.out.print("현재 잔액 : ");                // 현재 계좌 잔액을 정수로 입력받는다.
        long balance = scanner.nextLong();

        System.out.print("출금 금액 : ");                // 사용자가 출금하려는 금액을 정수로 입력받는다.
        long money = scanner.nextLong();

        if(money <= 0) {                                // 출금 금액이 0이하이면 실제 출금 금액으로 볼 수 없으므로 잘못된 입력이다.
            System.out.println("잘못된 금액입니다.");

        } else if (money > balance) {                    // 출금 금액이 현재 잔액보다 크면 출금할 수 없다.
            System.out.println("잔액이 부족합니다.");

        } else {                                          // 위 두 조건에 걸리지 않으면 정상 출금이 가능하다.
            balance -= money;

            System.out.println("출금 성공");
            System.out.println("남은 잔액 : " + balance);    // 현재 잔액에서 출금 금액을 뺀 값을 다시 balance에 저장한다.

        }
        scanner.close();                                // Scanner 사용을 종료한다.
    }
}
