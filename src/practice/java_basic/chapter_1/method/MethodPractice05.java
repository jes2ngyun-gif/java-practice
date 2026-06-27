package practice.java_basic.chapter_1.method;
// 배열 합계 구하기 - 배열 + 반복문 + 메서드
// 문제 : 정수 배열을 메서드에 전달하고, 배열 안의 모든 숫자의 합계를 반환한다.
// 코딩조건 : sumArray(int[] numbers) 메서드를 만든다.
//           배열을 매개변수로 받는다., 향상된 for문을 사용한다., 합계를 return 한다., main()에서 반환값을 출력한다.
public class MethodPractice05 {
    public static void main(String[] args) {

        int[] scores = {80, 90, 70, 100};      // 여러 개의 점수를 하나의 배열로 관리한다.

        int total = sumArray(scores);        // scores 배열을 sumArray 메서드에 전달한다.
                                               // sumArray는 배열 안의 숫자를 모두 더한 뒤 결과를 반환한다.


        System.out.println("점수 총합: " + total);   // 반환받은 합계 결과를 출력한다.
    }

    public static int sumArray(int[] numbers) {     // int[] number는 정수 배열을 받는 배개변수다.
                                                    // 이 메서드는 배열 안의 모든 숫자를 더해서 int 결과를 반환한다.


        int sum = 0;          // 합계를 저장할 변수다.
                              // 아직 아무 숫자도 더하지 않았으므로 0으로 시작한다.


        for (int number : numbers) {   // 향상된 for문을 사용해서 numbers 배열의 값을 하나씩 꺼낸다.
                                       // 첫 번째 반복에서는 80, 두 번째 반복에서는 90, 이런 식으로 number에 들어간다.


            sum += number;            // 현재 꺼낸 숫자를 sum에 누적한다.
                                      // sum = sum + number와 같은 의미다.
        }

        return sum;          // 모든 숫자를 더한 최종 합계를 호출한 곳으로 반환한다.
    }
}

// 실제 활용 : 장바구니 총액, 학생 점수 총합, 매출 합계처럼 여러 데이터를 한 번에 계산할 때 사용된다.
// 생각 순서
//1. 여러 숫자를 배열로 관리한다.
//2. 배열 전체를 메서드에 넘긴다.
//3. 메서드 안에서 합계를 구한다.
//4. 합계 결과를 return한다.
//5. main에서 결과를 받아 출력한다.

//해석
//int total = sumArray(scores); 이 코드는 이렇게 흐른다.
//scores 배열 전달
//→ sumArray 메서드 실행
//→ 배열 요소 하나씩 더함
//→ 340반환
//→ total에 340 저장
//즉, 최종적으로는 int total = 340; 처럼 되는 것이다.