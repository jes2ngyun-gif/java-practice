package practice.exception.lecture;

public class Main {
    public static void main(String[] args) {
//        // 1. 의도하지 않은 예외
//        int ret = 10 / 0;                   // 실행 시 산술 에러가 터짐. 예외가 터졌는데 예외 처리를 안해주니까 아래 코드가 실행 안됌.
//        System.out.println("ret = " + ret);
//        System.out.println("프로그램 종료");

//        // 2. 의도적인 예외 - throw로 발생시킬 수 있음.
//        int age = 10;
//        if (age < 18) {
//            throw new IllegalArgumentException("미성년자는 접근할 수 없습니다.");
//                      // IllegalArgumentException: 예외 객체, 그래서 앞에 new가 붙음.
//                      // throw를 통해서 예외를 발생시킨다.
//        }

        // 3. 언체크 예외 호출
        ExceptionPractice exceptionPractice = new ExceptionPractice();
//        try {
//            exceptionPractice.callUncheckedException();
//        } catch (RuntimeException e) {
//            System.out.println("언체크체크 예외 처리");
//        }

        // 4. 체크 예외 호출
        try {
            exceptionPractice.callCheckedException();

        } catch (Exception e) {
            System.out.println("체크 예외 처리!!");
        }

    }
}
