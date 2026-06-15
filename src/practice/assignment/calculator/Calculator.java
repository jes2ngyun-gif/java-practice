package practice.assignment.calculator;

import java.util.ArrayList;
     // 계산 결과를 여러 개 저장하기 위해 List와 ArrayList를 가져온다.
     // List는 "목록을 다루는 규칙"이고,
     // ArrayList는 그 규칙을 실제로 구현한 `저장 공간`
import java.util.List;

public class Calculator {
     // Calculator 클래스는 "계산 기능"을 담당하는 기능부 클래스
     // 사용자 입력이나 출력은 xx
     // 실제 계산, 결과 저장, 결과 조회, 결과 삭제만 담당함.

    private List<Double> resultList = new ArrayList<>();        // 계산 결과들을 저장하는 목록
                                                                // private을 붙인 이유: 외부 클래스에서 resultList를 직접 맘대로 수정 못하게 하려고
                                                                // resultList는 Calculator 내부에서만 직접 다루고, 외부에서는 메서드를 통해 간접적으로 접근하도록 만든다.



    public double calculate(int num1, int num2, char operator) { // calculate `메서드`는 실제 계산을 담당하는 메서드.
                                                                 // 매개변수: num1, num2, operator
                                                                 // 반환값: 계산 결과를 double 타입으로 반환한다.


        double result = 0;              // 계산 결과를 담아둘 `변수`, 처음엔 아직 계산 전이므로 0으로 초기화한다.

        if (operator == '+') {
            result = num1 + num2;

        } else if (operator == '-') {
            result = num1 - num2;

        } else if (operator == '*') {
            result = num1 * num2;

        } else if (operator == '/') {

            if (num2 == 0) {
                System.out.println("분모는 0이 될 수 없습니다.");
                return 0;
            }
            result = (double) num1 / num2;   // int / int로 계산하면 소수점이 사라질 수 있다.
                                             // 그래서 num1을 double로 형변환해서 소수점까지 나올 수 있도록 한다.

        }

        resultList.add(result);               // 계산이 끝난 결과를 결과 목록에 저장한다.
                                              // 이 코드 덕분에 이전 계산 결과들을 계속 보관할 수 있다.
        return result;
             // 계산 결과를 호출한 쪽, 즉 CalculatorApp으로 돌려준다.

    }

    public List<Double> getResultList() {      // 저장된 계산 결과 목록을 외부에서 확인할 수 있게 해주는 메서드.
                                               // resultList가 private이기 때문에 CalculatorApp 에서는 resultList에 직접 접근할 수 없음.
                                               // 그래서 getResultList()를 통해 결과 목록을 확인한다.
        return resultList;


    }

    public void removeResult() {                 // 가장 먼저 저장된 계산 결과를 삭제하는 매서드
                                                 // resultList.remove(0)의 의미: 목록에서 0번 인덱스, 즉 가장 앞에 있는 데이터를 삭제한다.
                                                 //예: [10.0, 20.0, 30.0]에서 remove(0)실행 하면 [20.0, 30.0]


        if (!resultList.isEmpty()) {              // 결과 목록이 비어있지 않을 때만 삭제한다.
            resultList.remove(0);           // 이 조건이 없으면, 비어 있는 목록에서 remove(0)을 실행했을 때 오류가 발생함.
        }
    }
}



