package practice.array;
// 합격자만 출력하기
// 문제 : 학생 점수 배열에서 60점 이상인 점수만 합격으로 출력한다.
// 코딩 조건 : int[] scores 배열을 만든다., 향상된 for문을 사용한다., 60점 이상이면 "합격"을 출력.,60점 미만이면 "불합격" 출력.
public class ArrayPractice04 {
    public static void main(String[] args) {


        int[] scores = {95, 45, 70, 58, 80};

        for (int score : scores) {

            if (score >= 60) {

                System.out.println(score + "점: 합격");


            } else {

                System.out.println(score + "점: 불합격");
            }
        }
    }
}

//실제 활용
// 채용 합격 여부, 시험 통과 여부, 회원 등급 판정처럼 기준에 따라 결과를 나누는 상황에서 사용한다.

// 중요한 해석
// 향상된 for문은 배열의 값을 하나씩 읽어오는 데 강하다.
// 하지만 단점도 있다.
//  for(int score:scores) 에서는 현재 값을 알 수 있지만, 이 값이 0번 인덱스인지, 1번 인덱스인지는 바로 알기 어렵다.
// 그래서 인덱스가 필요하면 일반 for문을 써야 한다.
