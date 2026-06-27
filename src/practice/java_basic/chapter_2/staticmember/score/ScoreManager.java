package practice.java_basic.chapter_2.staticmember.score;

public class ScoreManager {

     int[] scores;          // 학생 점수 배열은 ScoreManager 객체가 관리해야 하므로 인스턴스 변수로 선언한다.

     public ScoreManager(int[] scores) {        // ScoreManager 객체가 생성될 때 점수 배열을 전달받는 생성자

         this.scores = scores;       // 전달받은 점수 배열을 현재 객체의 scores 필드에 저장한다.
     }

     public int getTotal() {                 // 총점을 계산하는 인스턴트 메서드

         int sum = 0;                       // 총점을 저장할 변수를 0으로 초기화한다.

         for (int i = 0; i < scores.length; i++) {   // 배열의 첫번째 점수부터 마지막 점수까지 반복한다.

             sum = sum + scores[i];                  // 현재 인덱스의 점수를 sum에 더한다.

         }

         return sum;         // 계산된 총점을 반환한다.
     }

     public int getAverage() {                      // 평균을 계산하는 인스턴스 메서드

         return getTotal() / scores.length;         // 총점을 점수 개수로 나누어 평균을 구한다.
     }

     public void printResult() {                    // 총점, 평균, 반 분류 결과를 출력하는 메서드

         int total = getTotal();                    // 총점을 구한다.

         int average = getAverage();                // 평균을 구한다.

         System.out.println("총점 : " + total);      // 총점을 출력한다.

         System.out.println("평균: " + average);     // 평균을 출력한다.

         if (average >= 80) {

             System.out.println("우수반");          // 만약 평균이 80점 이상이면 우수반으로 판단한다.

         } else {
             System.out.println("일반반");
         }
     }
}
