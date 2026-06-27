package practice.java_basic.chapter_1.loop;

import java.util.Scanner;

//메뉴 선택 프로그램 - do-while문 + switch
//문제 : 아래 메뉴를 반복해서 보여주고, 사용자가 3을 선택하면 프로그램을 종료하숑
// 1. 인사하기
// 2. 현재 공부 중인 과목 출력하기
// 3. 종료
//코딩 조건 : do-while문 사용, 메뉴는 최소 한 번은 반드시 출력, 3입력 시 종료.
public class LoopPractice09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);         // 사용자 입력을 받기 위한 Scanner 객체 생성

        int choice;        // 사용자가 선택한 메뉴 번호를 저장할 정수형 변수

        do {              // do-while문은 조건을 나중에 검사한다.
                          // 그래서 메뉴가 최소 한 번은 반드시 출력된다.
            System.out.println("==== 메뉴 ====");                 // 사용자에게 보여줄 메뉴 출력
            System.out.println("1. 인사하기");
            System.out.println("2. 현재 공부 중인 과목 출력하기");
            System.out.println("3. 종료");
            System.out.print("메뉴를 선택하세요: ");

            choice = scanner.nextInt();                         // 사용자가 선택한 메뉴 번호를 choice 변수에 저장


            switch (choice) {                      // 사용자의 선택에 따라 다른 코드를 실행한다.

                case 1:                              // 1번을 선택했을 때 실행
                    System.out.println("안녕하세요!");
                    break;

                case 2:   // 2번을 선택했을 때 실행
                    System.out.println("현재 Java를 공부 중입니다.");
                    break;

                case 3:   // 3번을 선택했을 때 실행
                    System.out.println("프로그램을 종료합니다.");
                    break;

                default:    // 1,2,3이 아닌 값을 입력했을 때 실행

                    System.out.println("잘못된 메뉴입니다.");

            }
        }
              while (choice != 3);  // choice가 3이 아닐 동안 반복한다.
                                   // 즉, 사용자가 3을 입력하면 반복이 끝난다.
              scanner.close();     // scanner 사용 종료.
    }
}


// do-while 문은 일단 한 번 실행하고 나서 조건을 검사한다.
//그래서 메뉴 프로그램처럼 "일단 메뉴를 보여줘야 하는 상황"에 잘 맞는다.