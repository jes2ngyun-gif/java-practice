### 로그인 실패 예외처리
### 로그인 실패 상황을 예외로 처리하는 프로그램

---
### 문제 설명
사용자에게 아이디와 비밀번호를 입력받는다.

정답은 다음과 같다.
```
아이디: admin
비밀번호: 1234
```
아이디 또는 비밀번호가 틀리면 `LoginService`에서 예외를 발생시킨다.

`Main`은 그 예외를 `try-catch`로 처리하고, 실패 메세지를 출력한 뒤 다시 입력받는다.

로그인에 성공하면 "로그인 성공!!"을 출력하고 프로그램을 종료한다.

---
```
Main
= 호출부
= 사용자 입력, 반복문, try-catch, 결과 출력 담당

LoginService
= 기능부
= 아이디/비밀번호 검사, 예외 발생 담당
```
---
### 원리 흐름도
```
사용자
  ↓
  
Main
  
  ↓
아이디 / 비밀번호 입력
  
  ↓
LoginService.login(username, password)
  
  ↓
아이디와 비밀번호 검사
  
  ↓
틀림
  
  ↓
throw new Exception(...)
  
  ↓
Main으로 예외 전파
  
  ↓
catch에서 처리
  
  ↓
실패 메시지 출력
  
  ↓
다시 입력
```
---
### 실행 흐름도
```
프로그램 시작
↓

LoginService 객체 생성

↓
Scanner 객체 생성

↓
while(true) 시작

↓
아이디 입력

↓
비밀번호 입력

↓
try 안에서 loginService.login() 호출

↓
LoginService로 이동

↓
아이디/비밀번호 검사

↓
틀렸는가?
├─ 예
│  ↓
│  throw new Exception(...)
│  ↓
│  Main의 catch로 이동
│  ↓
│  실패 메시지 출력
│  ↓
│  while 처음으로 돌아감
│
└─ 아니오

   ↓
   login() 정상 종료
   
   ↓
   Main으로 복귀
   
   ↓
   "로그인 성공!" 출력
   
   ↓
   break
   
   ↓
   "프로그램 종료" 출력
```
---
### 코드 작성 전 생각하는 순서
```
1. 로그인을 하려면 아이디와 비밀번호가 필요하다.

2. 사용자는 Main에서 입력받는다.

3. 실제 로그인 검사는 LoginService에게 맡긴다.

4. 아이디 또는 비밀번호가 틀리면 정상 상황이 아니므로 예외를 발생시킨다.

5. LoginService는 예외를 직접 처리하지 않고 throws로 Main에게 넘긴다.

6. Main은 try-catch로 예외를 잡아서 실패 메시지를 출력한다.

7. 실패하면 while문 때문에 다시 입력받는다.

8. 성공하면 break로 반복문을 종료한다.
```
---
### 코드 단계별 작성 순서
```
1단계: practice.chapter_3.exception.login 패키지를 만든다.

2단계: Main 클래스를 만든다.

3단계: LoginService 클래스를 만든다.

4단계: LoginService에 login(username, password) 메서드를 만든다.

5단계: login 메서드에서 아이디/비밀번호를 검사한다.

6단계: 틀리면 throw new Exception(...)을 작성한다.

7단계: login 메서드에 throws Exception을 붙인다.

8단계: Main에서 LoginService 객체를 생성한다.

9단계: Main에서 Scanner로 입력을 받는다.

10단계: Main에서 while(true)를 만든다.

11단계: try 안에서 loginService.login(username, password)를 호출한다.

12단계: catch에서 e.getMessage()를 출력한다.

13단계: 성공하면 break로 반복을 종료한다.
```
---
### 핵심 원리
```
Main은 흐름을 담당한다.
LoginService는 기능을 담당한다.

Main
↓

loginService.login()

↓
LoginService에서 검사

↓
틀리면 throw

↓
throws 때문에 Main으로 예외 전파

↓
Main의 catch에서 처리

↓
while문으로 다시 입력
```
---
#### 1. 예외가 발생한 곳과 처리하는 곳은 다를 수 있다.

이번 예제에서는 예외가 LoginService에서 발생한다.

하지만 처리하는 곳은 Main이다.
```
LoginService
= 예외 발생

Main
= 예외 처리
```
이게 매우 중요하다.

#### 2. throw와 throws는 다르다.
```   
throw new Exception("로그인 실패");
```
뜻:
```
지금 예외를 발생시킨다.
```
```
public void login(...) throws Exception
```
뜻:
```
이 메서드에서 예외가 발생할 수 있으니,
호출한 쪽에서 처리해라.
```
#### 3. try-catch는 프로그램을 죽지 않게 한다.

예외가 발생해도 catch가 잡으면 프로그램은 바로 종료되지 않는다.

이번 예제에서는 로그인 실패 후 다시 입력받을 수 있다.

#### 4. while(true)와 break

로그인 실패 시 계속 반복해야 하므로 while(true)를 썼다.

로그인 성공 시에는 더 이상 반복할 필요가 없으므로 break로 빠져나온다.

---
### 실무에서는??
실무 로그인 흐름은 대략:
```
사용자가 로그인 요청
↓
Controller가 요청 받음
↓
Service가 아이디/비밀번호 검사
↓
틀리면 예외 발생
↓
예외 처리기가 실패 응답 생성
↓
사용자에게 "아이디 또는 비밀번호가 잘못되었습니다" 전달
```
그리고 보안상 보통
```
아이디 또는 비밀번호가 잘못되었습니다.
```
라고 출력한다.

왜냐면 공격자가 어떤 아이디가 실제로 존재하는지 추측할 수 있기 때문이다.

---
