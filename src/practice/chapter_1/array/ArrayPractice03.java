package practice.chapter_1.array;
// 짝수만 출력하기
// 문제: 정수 배열에서 짝수만 출력한다.
// 코딩 조건: int[] numbers 배열을 만든다., 향상된 for문을 사용한다., if 조건문으로 짝수인지 검사한다., 짝수만 출력한다.
public class ArrayPractice03 {
    public static void main(String[] args) {


        int[] numbers = {3, 4, 7, 10, 15, 20};
        // 여러 개의 정수를 배열로 관리한다.

        for (int number : numbers) {
            // number 배열에서 숫자를 하나씩 꺼내 number 변수에 담는다.

            if (number % 2 == 0) {
                // number를 2로 나누었을 때 나머지가 0이면 짝수다.
                // %는 나머지를 구하는 연산자다.

                System.out.println("짝수: " + number);
                // 조건을 만족한 짝수만 출력한다.
            }
        }
    }
}

// 실제 활용
// 조건에 맞는 데이터만 필터링할 때 사용한다.
// 예를 들면 재고가 있는 상품만 출력, 성인 회원만 출력, 완료된 주문만 출력 같은 경우다.