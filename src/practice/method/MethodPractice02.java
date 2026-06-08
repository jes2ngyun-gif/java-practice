package practice.method;
// 숫자 하나 받아서 출력하기 - 매개변수 이해
// 문제 : 숫자 하나를 메서드에 전달하고, 그 숫자를 출력한다.
// 코딩조건 : printNumber(int number) 메서드를 만든다., main() 에서 숫자를 넘긴다., 반환값은 없다.
public class MethodPractice02 {
    public static void main(String[] args) {


        printNumber(10);                     // printNumber 메서드에 10이라는 값을 전달한다.
                                             // 이 10은 printNumber 메서드의 number 변수로 들어간다.



        printNumber(25);                     // 같은 메서드지만 다른 값을 전달할 수 있다.
                                             // 이번에는 25가 number 변수로 들어간다.
    }

    public static void printNumber(int number) {      //  int number는 매개변수다.
                                                      // 매개변수에서 호출하는 쪽에서 넘겨준 값을 받는 변수다.
        System.out.println("전달받은 숫자: " + number);
        // 호출부에서 전달받은 number 값을 출력한다.
    }
}

// 실제 활용 : 사용자 번호, 상품 번호, 주문 번호처럼 외부에서 받은 값을 메서드에 전달해 처리할 때 사용된다.
// 생각 순서
// 1. 메서드가 숫자를 받아야 한다.
// 2. 숫자는 int 정수 타입니다.
// 3. 메서드 괄호 안에 int number를 적는다.
// 4. main에서 printNumber(10) 처럼 값을 넘긴다.

//값 변화
//호출코드:printNumber(10); → number값:10 → 출력: 전달받은 숫자:10
//호출코드:printNumber(25); → number값:25 → 출력: 전달받은 숫자:25

// 해석
//printNumber(10);에서 10은 그냥 사라지는 게 아니다.
// public static void printNumber(int number) 여기의 number 안으로 들어간다.
//즉, 10 → number, 25 → number. 이렇게 전달된다.