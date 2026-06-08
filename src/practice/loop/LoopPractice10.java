package practice.loop;

import java.util.Scanner;

// ATM 프로그램 - while문 + break + switch문
//문제 : ATM 프로그램을 만든다.
// 메뉴 1. 입금, 2. 출금, 3. 잔액조회, 4. 종료
// 초기잔액은 10,000원이다.
// 코딩조건 : while문 사용, switch문 사용, 종료는 break 사용, 잔액보다 많이 출금하면 출금 실패, 4번 선택 시 프로그램 종료
// balance: 현재 잔액, menu: 메뉴 선택, money: 입금 또는 출금 금액
public class LoopPractice10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);         // 사용자가 입력을 받기 위한 Scanner 객체 생성


        int balance = 10000;   // 현재 계좌 잔액을 저장하는 정수형 변수, 프로그램 시작 시 초기 잔액은 10000원으로 설정한다.

        int menu;             // 사용자가 선택한 메뉴 번호를 저장하는 정수형 변수.

        while (true) {        // 사용자가 4번 종료 메뉴를 선택할 때까지 계속 반복된다.

            System.out.println("==== ATM 메뉴 ====");
            System.out.println("1. 입금");
            System.out.println("2. 출금");
            System.out.println("3. 잔액조회");
            System.out.println("4. 종료");
            System.out.print("메뉴를 선택하세요: ");


            menu = scanner.nextInt();       // 사용자가 입력한 메뉴 번호를 menu 변수에 저장한다.


            switch (menu) {                 // 사용자가 선택한 메뉴 번호에 따라 실행할 기능을 나눈다.

                case 1:
                    System.out.print("입금할 금액: ");     // 입금할 금액을 입력받는다.
                    int deposit = scanner.nextInt();

                    balance += deposit;                  // 현재 잔액에 입금 금액을 더한다.

                    System.out.print("입금 완료. 현재 잔액: " + balance + "원");    // 입금 후 잔액을 출력한다.
                    break;


                case 2:
                    System.out.print("출금할 금액: ");      // 출금할 금액을 입력받는다.
                    int withdraw = scanner.nextInt();

                    if (withdraw > balance) {             // 출금 금액이 현재 잔액보다 크면 출금할 수 없다.
                        System.out.println("잔액이 부족합니다.");
                    } else {                              // 잔액이 충분하면 현재 잔액에서 출금 금액을 뺀다.

                        balance -= withdraw;
                        System.out.println("출금 완료. 현재 잔액: " + balance + "원");
                    }
                    break;


                case 3:
                    System.out.println("현재 잔액: " + balance + "원");     // 현재 잔액을 출력한다.
                    break;


                case 4:
                    System.out.println("ATM을 종료합니다.");       // 종료 메세지를 출력한다.


                    scanner.close();         // scanner 사용을 종료한다.

                    return;                // main 메서드 자체를 종료하여 프로그램을 끝낸다.


                default:                   // 1, 2, 3, 4가 아닌 값을 입력했을 때 실행된다.
                    System.out.println("잘못된 메뉴입니다.");
            }
        }
    }
}

// 생각 순서
//잔액 변수 만들기 → 메뉴를 반복해서 보여주기 → 사용자가 메뉴 선택 → 1번이면 입금, 2번이면 출금, 3번이면 잔액 확인, 4번이면 종료.

// 은행 앱, 키오스크, 관리자 페이지처럼 사용자가 메뉴를 선택하고 기능을 반복 실행하는 구조의 기본 형태이다.

// while(true)는 계속 반복한다.
// 대신 case4에서 return으로 프로그램을 종료한다.
//여기서 핵심은 메뉴 출력 → 입력 → 조건 처리 → 다시 메뉴 출력.