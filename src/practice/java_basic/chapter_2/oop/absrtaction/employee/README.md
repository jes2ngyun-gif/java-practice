## 회사 직원 급여 시스템

### 이 문제에서 사용된 것

| 개념        | 사용 |
| --------- | -- |
| 클래스       | O  |
| 객체        | O  |
| 생성자       | O  |
| private   | O  |
| getter    | O  |
| if 조건문    | O  |
| 상속        | O  |
| 추상 클래스    | O  |
| 추상 메서드    | O  |
| 오버라이딩     | O  |
| super()   | O  |
| @Override | O  |

---
### 문제 설명
회사에는 여러 종류의 직원이 있다.

#### 정규직
- 기본급 + 보너스 지급

#### 계약직
- 근무 시간 x 시급 지급
직원마다 급여 계산 방식은 다르지만,

모든 직원은
- 이름
- 직원 정보 출력
- 급여 계산

이라는 공통점을 가진다.

그래서

> 직원이라면 반드시 급여를 계산할 수 있어야 한다.

라는 규칙을 만들어보자.

---
### 클래스 구조
```
                  Employee
                (추상 클래스)

              name
              printInfo()
              calculateSalary()

                    ↑
         ┌──────────┴──────────┐

         ↑                     ↑

FullTimeEmployee       PartTimeEmployee

기본급 + 보너스          시급 × 근무시간
```
---
### 코드를 작성하기 전에 생각하는 순서
#### 1단계
직원들이 공통적으로 갖는 것은?
```
이름
직원 정보 출력
급여 계산
```
↓

`부모 클래스`

---
#### 2단계
직원마다 달라지는 것은?
```
급여 계산 방식
```
↓
`자식 클래스`

---
#### 3단계
모든 직원은 급여를 계산할 수 있어야 한다.

↓

calculateSalary( ) 는 추상 메서드

---
### 코드를 작성하는 순서
```
1. Employee 추상 클래스 생성

2. name 필드 생성

3. 생성자 작성

4. getter 작성

5. printInfo() 작성

6. calculateSalary() 추상 메서드 선언

7. FullTimeEmployee 생성

8. PartTimeEmployee 생성

9. calculateSalary() 구현

10. Main에서 객체 생성 후 실행
```

---
### 실행 흐름
```
Main
 ↓

new FullTimeEmployee()

 ↓

super()

 ↓

Employee 생성자 실행

 ↓

이름 저장

 ↓

calculateSalary()

 ↓

FullTimeEmployee의 급여 계산 실행

--------------------------------

new PartTimeEmployee()

 ↓

super()

 ↓

Employee 생성자 실행

 ↓

calculateSalary()

 ↓

PartTimeEmployee의 급여 계산 실행
```
---

### 핵심 원리
상속에서 부모 클래스는
> 공통 기능을 재사용하기 위한 존재

였다.

추상화에서 부모 클래스는
> 공통 기능을 제공하면서 반드시 지켜야 할 규칙까지 정의하는 존재

가 된다.

즉,

```
상속
=
공통 기능 재사용
==================================
추상화
=
공통 기능 재사용
+
구현 강제
```
이다.

---
### 반드시 알고 넘어가기!
지금 만든 구조를 보면
```
FullTimeEmployee employee1 =
        new FullTimeEmployee(...);

PartTimeEmployee employee2 =
        new PartTimeEmployee(...);
```
라고 사용하고 있다.

그런데 다음 챕터인 **다형성**에서는 드디어
```
Employee employee1 =
        new FullTimeEmployee(...);

Employee employee2 =
        new PartTimeEmployee(...);
```
처럼 사용할 수 있게 된다.!

> 지금까지 만든 상속과 추상화 구조는 사실 다형성을 사용하기 위한 준비 단계였다.
