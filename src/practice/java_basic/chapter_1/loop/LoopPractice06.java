package practice.java_basic.chapter_1.loop;
//1부터 숫자를 더하다가 합이 100을 넘으면 중단하기 - for문 + break;
//문제 : 1부터 차례대로 숫자를 더하다가 합계가 100을 넘는 순간 반복을 멈추고, 그때의 숫자와 합계를 출력해라.
// 조건 : for문 사용, break; 사용, 합계가 100을 초과하면 즉시 반복 종료.
public class LoopPractice06 {
    public static void main(String[] args) {

        int sum = 0;           // 숫자들의 합계를 저장하는 변수

        for (int i = 1; i <= 100; i++) {           // 1부터 100까지 숫자를 하나씩 증가시키며 반복한다.

            sum += i;                              // 현재 숫자 i를 sum에 더한다.

            if (sum > 100) {                        // sum이 100을 초과하면 더 이상 반복할 필요가 없다.
                                                    // 100을 넘긴 순간의 숫자와 합계를 출력한다.
                System.out.println("100을 넘긴 숫자: " + i);
                System.out.println("현재 합계 " + sum);


                break;       // 반복문을 즉시 종료한다.
            }
        }
    }
}


// break; 는 반복문을 끝내는 문법이다.
// continue가 "이번만 건너뛰기" 라면, break는 "가게 문 닫아버리기"다.