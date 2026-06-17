package practice.chapter_1.method;
// 두 수 더하기 - return 이해
// 문제 : 두 숫자를 받아서 더한 결과를 반환하는 메서드를 만든다.
// 코딩 조건 : add(int num1, int num2) 메서드를 만든다., 두 수를 더한다., 결과를 return 한다., main()에서 반환값을 변수에 저장하고 출력한다.
public class MethodPractice03 {
    public static void main(String[] args) {

        int result = add(10, 20);     // add(10,20)을 호출한다.
                                      // add 메서드는 10과 20을 더한 결과를 return으로 돌려준다.
                                      // 돌려받은 값을 result 변수에 저장한다.

        System.out.println("더하기 결과: " + result);    // add 메서드가 돌려준 결과값을 출력한다.
    }



    public static int add(int num1, int num2) {     // int는 이 메서드가 int 타입의 결과를 반환한다는 뜻이다.
                                                   // num1, num2는 호출부에서 전달받는 매개변수다.


        int result = num1 + num2;                // 전달받은 두 숫자를 더해서 result 변수에 저장한다.



        return result;             // 계산한 결과를 호출한 곳으로 돌려준다.
                                   //  이 return이 있어야 main에서 결과를 받아 사용할 수 있다.
    }

}

// 해석
// int result = add(10, 20); 이 코드는
// int result = 30; 이렇게 이해하면 된다. add(10, 20)의 결과가 30으로 돌아오기 때문이다.
