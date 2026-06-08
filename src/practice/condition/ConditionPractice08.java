package practice.condition;

import java.util.Scanner;                       // 사용자가 입력을 받기 위해 Scanner 클래스를 가져온다.

//switch- 학점 판정 시스템
// 학점을 입력받는다.
//A+, A → 우수
//B+, B → 보통
//C+, C → 재시험 권장
//F → 불합격
public class ConditionPractice08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);    // 키보드 입력을 받기 위한 Scanner 객체를 생성한다.

        System.out.print("학점을 입력하세요 : ");      //학점은 A+,B+ 처럼 문자와 기호가 섞일 수 있으므로 String으로 입력받는다.
        String grade = scanner.nextLine();

        switch (grade) {                            // switch문은 입력된 학점 값에 따라 다른 결과를 출력하기 위해 사용한다.

            case "A+" :
            case "A" :
                System.out.println("우수");
                break;                               // A와 A+는 같은 결과를 출력하므로 case를 이어서 작성한다.

            case "B+" :
            case "B" :
                System.out.println("보통");
                break;                               // B와 B+는 같은 결과를 출력한다.

            case "C+" :
            case "C" :
                System.out.println("재시험 권장");
                break;                               //C 와 C+은 같은 결과를 출력한다.

            case "F" :
                System.out.println("불합격");           // F는 불합격으로 처리한다.

            default :
                System.out.println("잘못된 입력입니다.");   // 위 CASE 중 어떤 학점에도 해당하지 않으면 잘못된 입력으로 처리한다.
        }
        scanner.close();               //Scanner 사용을 종료한다.
    }
}
