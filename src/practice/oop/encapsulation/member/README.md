**회원 정보는 보호하면서 필요한 기능만 외부에 제공하는 캡슐화**
# 회원(Member) 정보 관리
회원 정보 안전하게 관리하기

## 이 문제는
현실의 사이트를 생각해보자.
- 네이버
- 카카오
- 쿠팡
- 은행 앱 등

회원의 정보가 외부에서 마음대로 바뀌면 큰일 난다.

예를 들어
```
member.password = "1234";
member.age = -10;
member.name = "";
```
이런 일이 가능하면 시스템이 망가진다.

그래서

> 중요한 정보는 숨기고(private), 허용된 방법으로만 변경한다.

라는 캡슐화가 필요하다.

---
## 문제 설명
회원 객체를 만들어라.

회원은 다음 정보를 가진다.
- 이름(name)
- 나이(age)
- 비밀번호(password)

그리고 다음 기능을 제공한다.
- 회원 정보 조회
- 비밀번호 변경
- 나이 변경

---
## 코드 조건

| 필드       | 접근 제한   |
| -------- | ------- |
| name     | private |
| age      | private |
| password | private |

---

| 메서드              | 기능      |
| ---------------- | ------- |
| getName()        | 이름 조회   |
| getAge()         | 나이 조회   |
| changeAge()      | 나이 변경   |
| changePassword() | 비밀번호 변경 |

---
## 그림으로 보는 캡슐화
```
외부(Main)

      ↓

Member 객체

┌──────────────────┐
│ private name      │
│ private age       │
│ private password  │
└──────────────────┘

      ↑

getName()
getAge()
changeAge()
changePassword()
```
외부에서는
```
member.age = -100;
member.password = "1111";
```
직접 접근 불가.

반드시 메서드를 통해서만 접근한다.

---
## 코드 작성 전에 생각하는 순서

### 1단계
회원이 기억해야 할 데이터는?
```
이름 
나이
비번
```
↓

### 2단계
외부에서 직접 수정하게 할까?
**NO** 위험하다.

↓

private으로 숨긴다.

↓

### 3단계
필요한 행동만 제공한다.
```
조회하기

나이 변경하기

비번 기억하기
```

---
## 코드 작성하는 순서
```
1. Member 클래스 만들기

↓

2. private 필드 선언

name
age
password

↓

3. 생성자 만들기

↓

4. getter 만들기

↓

5. changeAge()

↓

6. changePassword()

↓

7. Main에서 객체 생성
```
---
## 실행 흐름
```
Main 시작

↓

new Member()

↓

Member 객체 생성

↓

name 저장

age 저장

password 저장

↓

changeAge()

↓

changePassword()

↓

getName()

↓

getAge()

↓

출력
```

---
## 값 변화 표

| 실행                        | age | password |
| ------------------------- | --: | -------- |
| 생성                        |  30 | abcd1234 |
| changeAge(31)             |  31 | abcd1234 |
| changePassword("java123") |  31 | java123  |


---
## 호출부와 기능부 구조
```
Main (호출부)

member.changeAge()

member.changePassword()

member.getName()

member.getAge()

        ↓

Member (기능부)

changeAge()

changePassword()

getName()

getAge()
```
---
## 핵심 원리
```
데이터는 숨긴다.
(private)

↓

필요한 행동만 공개한다.

↓

객체가 자신의 상태를 스스로 관리한다.

↓

잘못된 값이 들어오는 것을 막는다.
```
--
## 꼭 알아야 하는 것!
#### getter
정보를 안전하게 꺼내기 위한 창문
```
getName()
getAge()
```
---
#### setter보다 행동 중심 메서드가 좋다 !!!!
좋지 않은 방식
```
setAge()
setPassword()
```
조금 더 객체지향적인 방식:
```
changeAge()
changePassword()
```
왜냐하면:
```
무엇을 바꾼다(Change)

무엇을 입금한다(Deposit)

무엇을 출금한다(Withdraw)
```
처럼 **행동 중심으로 표현하는 것이 객체지향적인 설계에 더 가깝기 때문**이다.

---
> private + getter + 무분별한 setter 대신 행동 중심 메서드
