package practice.java_basic.chapter_1.array.scorestatistics;

public class ScoreStatisticsApp {
    public static void main(String[] args) {

        int [] scores = {70, 85, 90, 60, 100};                // 학생들의 시험 점수를 저장한 배열
                                                              // 배열은 여러 값을 한 번에 저장할 수 있지만, 크기가 고정.
        printScores(scores);           //1. 전체 점수 출력

        int sum = calculateSum(scores);                       // 2. 총합 계산

        double average = calculateAverage(scores);            // 3. 평균 계산

        int maxScore = findMaxScore(scores);                  // 4. 최고 점수 찾기

        int passedCount = countPassedStudents(scores);        // 5. 80점 이상 학생 수 계산

                   // 최종 결과 출력
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + average);
        System.out.println("최고 점수 : " + maxScore);
        System.out.println("80점 이상 학생 수 : " + passedCount);
    }

                    // 배열에 들어 있는 전체 점수를 출력하는 '메서드'
    public static void printScores(int[] scores) {
        System.out.println("전체 점수 : " );

        for (int i = 0; i < scores.length; i++) {                // 배열의 0번 인덱스부터 마지막 인덱스까지 하나씩 접근한다.
            System.out.print(scores[i] + " ");
        }
        System.out.println();
    }
                      // 배열에 들어 있는 점수의 총합을 구하는 '메서드'
    public static int calculateSum(int[] scores) {
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {                  // 배열 안의 점수를 하나씩 꺼내 sum에 더한다.
            sum = sum + scores[i];
        }
        return sum;
    }
                       // 평균을 구하는 '메서드'
    public static double calculateAverage(int[] scores) {
        int sum = calculateSum(scores);

        return (double) sum / scores.length;                        // int / int 하면 소수점이 사라질 수 있다. 그래서 double로 형변환해서 정확한 평균을 구한다.
    }
                        // 최고 점수를 찾는 '메서드'
    public static int findMaxScore(int[] scores) {
        int max = scores[0];                                        // 첫 번째 점수를 일단 최고 점수라고 가정한다.

        for (int i = 1; i < scores.length; i++) {                   // 배열을 돌면서 현재 최고 점수보다 큰 값이 있으면 max를 바꾼다.
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }
                        // 80점 이상인 학생 수를 세는 '메서드'
    public static int countPassedStudents(int[] scores) {
        int count = 0;

        for (int i = 0; i < scores.length; i ++) {                    // 배열의 점수를 하나씩 확인한다.

            if (scores[i] >= 80) {                                    // 현재 점수가 80점 이상이면 count를 1 증가시킨다.
                count ++;
            }
        }
        return count;
    }
}
