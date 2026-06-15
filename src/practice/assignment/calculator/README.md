>계산 기능은 `Calculator`가 담당하고,
>
> 입력/ 출력/ 반복 흐름은 `CalculatorApp`이 담당하도록 역할을 나눈 객체지향 계산기.

### 문제 설명
```
CalculatorApp
→ 사용자와 대화하는 역할
→ 입력, 출력, 반복, 종료 담당

Calculator
→ 실제 계산 기능 담당
→ 계산, 결과 저장, 결과 조회, 결과 삭제 담당
```
즉, 이 문제의 핵심은 **계산기를 객체로 분리해서 역할과 책임을 나누는 것**이다.

---
### 코드 작성 전에 생각하는 순서
#### 1. 무엇을 만들어야 하는가
계산기 프로그램

---
#### 2. 사용자는 무엇을 입력하는가??
```
첫 번째 숫자
두 번째 숫자
연산자
삭제 여부
계속 계산 여부
```
---
#### 3. 계산 기능은 어디에 둘 것인가?
`Calculator` 클래스에 둔다.

왜냐하먄 계산은 계산기의 책임이지, `main()`의 책임이 아니기 때문.

---
#### 4. 사용자 입력과 출력은 어디에 둘것인가??
`CalculatorApp` 클래스에 둔다.

왜냐하면 사용자의 입력을 받고 화면에 보여주는 흐름은 실행부(이자 호출부)의 책임이기 때문.

---
#### 5. 결과는 어떻게 저장할 것인가?
여러 결과를 저장해야 하니까 `List<Double)`을 사용한다.
```
private List<Double> resultList = new ArrayList<>();
```

+ **왜 List<더블>인가?????**

**먼저 비유로 보면:**

계산 결과가 딱 한 번만 필요하면 메모지 한 장이면 됌:
```
double result = 15.0;
```
그런데 계산기를 계속 사용하면 결과가 여러 개 생긴
```
10 + 5 = 15.0
20 - 3 = 17.0
8 / 4 = 2.0
5 / 2 = 2.5
```
이걸 하나만 저장하면 이전 결과는 사라진다.

그래서 필요한 게 **결과 보관함**
```
계산 결과 보관함
[15.0, 17.0, 2.0, 2.5]
```
자바에서 이런 "여러 개의 순서대로 보관하는 상자"로 `List`를 사용한다.

---
- 왜 List인가???

### 1
double result 하나만 있으면 결과 하나만 저장할 수 있다.

계산을 여러 번 하면 값이 계속 덮어써진다.

그런데 과제에서는 **계산 결과들을 저장하고, 조회하고, 삭제**해야 한다.

그러면 하나의 변수로는 부족하다.

그래서 여러 값을 담을 수 있는 구조가 필요했다.
```
List<Double> resultList = new ArrayList<>();
```
### 2
배열도 여러 개 저장할 수는 있다.
```
double[] results = new double[10];
```
이런 식으로..
하지만 배열은 처음부터 크기를 정해야 한다.
```
10칸짜리 결과 보관함
[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]
```

`문제는 사용자가 계산을 몇 번 할지 모른다는 것`

3번 할 수도 있고, 100번 할 수도 있다.

배열은 이런 상황에서 아아아아주 불편함.

반면!!

`List`는 크기가 자동으로 늘어난다.
```
resultList.add(15.0);
resultList.add(17.0);
resultList.add(2.5);
```
```
처음: []
1번 계산 후: [15.0]
2번 계산 후: [15.0, 17.0]
3번 계산 후: [15.0, 17.0, 2.5]
```
그래서 **계산 결과가 몇 개 생길지 모를 때는 배열보다 List**가 적합하다.

### 3 왜 Double 인가??
```
List<Double>
```
여기서 `Double`은 `double`의 포장 클래스이다.

→ 자바에서는 `List`안에 기본형을 직접 넣을 수는 없음!!!

즉, 이건 안된다:
```
List<double> resultList; // 불가능
```
그래서 기본형`double`을 객체 형태로 감싼 `Double`을 사용한다.
```
List<Double> resultList;
```
 → `List`는 객체를 담는 구조라서, double이 아니라 `Double`을 써야 한다.

→ 
```
private List<Double> resultList = new ArrayList<>();
```
이 코드는 단순히 "결과 저장용" 이 아니라,
> 계산 결과가 여러 번 생기고,
> 
> 그 결과가 소수일 수 있으며,
> 
> 외부에서 직접 건드리면 안 되기 때문에 만든
> 
> Calculator 내부의 비공개 결과 보관함!!!

---
#### 6. 저장된 결과는 어떻게 보호할 것인가?
`private`으로 직접 접근을 막는다.

그리고 필요할 때만 메서드를 통해 접근한다.

---

### 전체 실행 흐름
```
프로그램 실행
↓

CalculatorApp의 main() 시작

↓
Scanner 객체 생성

↓
Calculator 객체 생성

↓
while(true) 반복 시작

↓
첫 번째 숫자 입력

↓
두 번째 숫자 입력

↓
연산자 입력

↓
calculator.calculate(num1, num2, operator) 호출

↓
Calculator 클래스의 calculate() 실행

↓
연산자에 따라 계산

↓
계산 결과를 resultList에 저장

↓
계산 결과를 CalculatorApp으로 반환

↓
결과 출력

↓
저장된 결과 목록 출력

↓
삭제 여부 입력

↓
yes면 removeResult() 호출

↓
계속 계산 여부 입력

↓
exit이면 break

↓
scanner.close()

↓
프로그램 종료
```
---
### 호출부와 기능부 관계
```
[CalculatorApp.java]
사용자 입력 담당
화면 출력 담당
반복/종료 담당
        │
        │ calculate(num1, num2, operator) 호출
        ▼
[Calculator.java]
실제 계산 담당
결과 저장 담당
결과 조회 담당
결과 삭제 담당
        │
        │ 계산 결과 return
        ▼
[CalculatorApp.java]
결과 출력
다음 입력 진행
```
---
### 한 번 계산할 때 내부의 흐름
예를 들어 사용자가 이렇게 입력했을 때:
```
첫번째 숫자 : 10
두번째 숫자 : 5
연산자 : +
```
흐름은:

| 순서 | 위치            | 실행 내용                    | 값        |
| -- | ------------- | ------------------------ | -------- |
| 1  | CalculatorApp | num1 입력                  | 10       |
| 2  | CalculatorApp | num2 입력                  | 5        |
| 3  | CalculatorApp | operator 입력              | '+'      |
| 4  | CalculatorApp | calculate(10, 5, '+') 호출 |          |
| 5  | Calculator    | result = 0               | 0        |
| 6  | Calculator    | operator == '+' 확인       | true     |
| 7  | Calculator    | result = num1 + num2     | 15.0     |
| 8  | Calculator    | resultList.add(result)   | [15.0]   |
| 9  | Calculator    | return result            | 15.0     |
| 10 | CalculatorApp | result 변수에 저장            | 15.0     |
| 11 | CalculatorApp | 결과 출력                    | 결과: 15.0 |

---
### resultList 값 변화 예시
사용자가 계산을 세 번 했을 때:
```
10 + 5 = 15.0
20 - 3 = 17.0
4 * 2 = 8.0
```
그러면 `resultList`는 이렇게 변한다.

| 실행             | result | resultList        |
| -------------- | -----: | ----------------- |
| 시작             |     없음 | []                |
| 10 + 5         |   15.0 | [15.0]            |
| 20 - 3         |   17.0 | [15.0, 17.0]      |
| 4 * 2          |    8.0 | [15.0, 17.0, 8.0] |
| removeResult() |     삭제 | [17.0, 8.0]       |

여기서 `remove`(0)`은 **가장 오래된 결과를 삭제** 하는 것.

---
> 1. CalculatorApp은 호출부다.
> 2. Calculator는 기능부다.
> 3. private은 내부 데이터를 보호한다.
> 4. getResultList()는 private 데이터를 조회하기 위한 통로다.
> 5. removeResult()는 데이터를 직접 지우는 대신 행동으로 요청하는 방식이다.
> 6. calculator()는 계산하고, 저장하고, 결과를 반환한다.
> 7. List는 여러 결과를 저장하기 위한 목록이다.
> 8. while(true)는 사용자가 exit를 입력할 때까지 반복하기 위한 구조이다.
