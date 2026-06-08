package practice.array;
// 점수 합계 구하기
// 문제 : 점수 배열의 전체 합계를 구한다.
// 코딩조건 : int[] scores 배열을 만든다, sum 변수를 만든다, 향상된 for문으로 점수를 하나씩 꺼낸다, 꺼낸 점수를 sum에 누적한다.
public class ArrayPractice02 {
    public static void main(String[] args) {


        int[] scores = {80, 90, 70, 100};
        // 학생들의 점수를 배열로 관리한다.

        int sum = 0;
        // 점수의 총합을 저장할 변수다.
        // 처음에는 아무 점수도 더하지 않았으므로 0으로 시작한다.


        for (int score : scores) {
            // score 배열에서 점수를 하나씩 꺼내 score 변수에 담는다.

            sum += score;
            // 현재 꺼낸 점수를 sum에 더한다.
            // sum = sum + score 와 같은 의미이다.
        }

        System.out.println("총합: " + sum);
        // 반복문이 끝난 뒤에는 모든 점수가 sum에 누적되어 있다.
    }
}
