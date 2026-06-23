package practice.chapter_2.staticmember.score;

public class Main {
    public static void main(String[] args) {

        int[] scores = {90, 85, 70, 95, 80};             // 학생 5명의 점수를 배열에 저장한다.

        ScoreManager manager = new ScoreManager(scores);  // 점수 배열을 관리할 ScoreManager 객체를 생성한다.

        manager.printResult();     // 총점, 평균, 반 분류 결과를 출력한다.
    }
}
