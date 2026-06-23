package practice.chapter_3.exception.login;

public class LoginService {


    public void login(String username, String password) throws Exception {

        if (!username.equals("admin") || !password.equals("1234")) {

            throw new Exception("로그인 실패!!! 아이디 또는 비밀번호가 잘못되었습니다.");
        }
    }
}
