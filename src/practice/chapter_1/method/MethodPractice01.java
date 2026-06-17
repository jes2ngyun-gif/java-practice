package practice.chapter_1.method;
// 인사 메세지 출력하기 - 메서드 호출 감 잡기
// 문제 : 인사 문장을 출력하는 메서드를 만들고 `main()`에서 호출한다.
// 코딩 조건 : printHello() 메서드를 만든다., 반환값은 없다., main()에서 printHello()를 호출한다.
public class MethodPractice01 {

    public static void main(String[] args) {

        printHello();
                                             // main 메서드는 프로그램이 시작되는 지점이다.
                                             // 여기서 printHello() 메서드를 호출한다.
                                             // "호출한다"는 것은 아래에 따로 만들어둔 기능을 실행시키는 뜻이다.

        System.out.println("프로그램을 종료합니다.");
                                              // printHello() 실행이 끝나면 다시 main으로 돌아와서 이 줄이 실행된다.
    }

    public static void printHello() {
                                              // 반환값이 없는 메서드이므로 void를 사용한다.
                                              // 이 메서드는 단순히 문장을 출력하는 기능만 담당한다.

        System.out.println("안녕하세요. 메서드 실습을 시작합니다.");
    }                                         // printHello()가 호출되면 이 줄이 실행된다.
}

// 여기서 중요한 해석
//9 → printHello(); 이 한 줄이 실행되면 자바는 18→ public static void printHelli()를 찾아가서 실행한다.

// 실제 활용 : 프로그램 시작 안내, 메뉴 출력, 공통 메세지 출력이 사용된다.

// 생각 순서
// 1. 반복해서 쓸 기능을 메서드로 뺀다.
// 2. 출력만 하면 되므로 return 은 필요없다.
// 3. 반환값이 없으므로 void를 쓴다.
// 4. main에서 메서드를 호출한다.

// 흐름
// main 시작 →
// printHelli() 호출 →
// printHello 메서드 실행 →
// main 으로 돌아옴 →
// 종료 문장 출력