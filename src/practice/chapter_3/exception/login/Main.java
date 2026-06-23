package practice.chapter_3.exception.login;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LoginService loginService = new LoginService();

        Scanner scanner = new Scanner(System.in);


        while (true) {

            try {
                System.out.print("아이디 입력 : ");
                String username = scanner.next();

                System.out.print("비밀번호 입력 : ");
                String password = scanner.next();



                loginService.login(username, password);

                System.out.println("로그인 성공!!");

                break;
            } catch (Exception e) {

                System.out.println(e.getMessage());
            }
        }
        scanner.close();

        System.out.println("프로그램 종료~");
    }
}
