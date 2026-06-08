package practice.method;
// 합격 여부 판단하기 - 조건문 + 메서드
// 문제 : 점수를 전달하면 합격/불합격 문장을 반환하는 메서드를 만든다.
//코딩 조건: checkPass(int score) 메서드를 만든다., 60점 미만이면 "합격"반환, 미만이면 "불합격"반환, main() 에서 결과를 출력한다.
public class MethodPractice04 {
    public static void main(String[] args) {


        String result1 = checkPass(85);        // checkPass 메서드에 85점을 전달한다.
                                                     // 메서드는 85점이 합격인지 불합격인지 판단한 뒤 문자열을 반환한다.


        String result2 = checkPass(40);        // checkPass 메서드에 40점을 전달한다.
                                                     // 마찬가지로 메서드는 40점이 합격인지 불합격인지 판단한 뒤 문자열을 반환한다.

        System.out.println("85점 결과: " + result1);
        System.out.println("40점 결과: " + result2);   // 반환받은 결과를 출력한다.

    }

    public static String checkPass(int score) {          // 점수를 받아서 합격/불합격 결과를 문자열로 반환하는 메서드다.
                                                         // 반환값이 문자열이므로 반환자료형은 String이다.

        if (score >= 60) {                               // score가 60 이상아면 합격이다.

            return "합격";                                //"합격" 이라는 문자열을 호출한 곳으로 반환한다.


        } else {

            return "불합격";                               // 60점 미만이면 "불합격"이라는 문자열을 반환한다.
        }
    }
}

// 실제 활용: 회원 등급 판정, 시험 결과 판정, 주문 상태 판정처럼 조건에 따라 결과를 나누는 기능에 사용된다.
// 생각 순서
//1. 점수 하나를 받는다.
//2. 점수는 int다.
//3. 결과는 "합격" 또는 "불합격"이라는 문자열이다.
//4. 반환자료형은 String이다.
//5. if문으로 60점 이상인지 판단한다.

// 해석
// 21 → public static String checkPass(int score) 이 문장은
// int 점수를 하나 받아서, String 결과를 돌려주는 메서드
// 여기서 핵심은 반환자료형과 return 값이 타입이 맞아야 한다는 것이다.

// 21 → 이면 return "합격"; 처럼 문자열을 반환해야 한다.