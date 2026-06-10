# 문제 : 학생 점수 평균 계산기
학생 5명의 점수를 배열에 저장한다.

반복문을 이용해 총점과 평균을 계산한다.

평균이 80점 이상이면 `"우수반"`, 아니면 `"일반반"`을 출력한다.

---
## 문제 조건
- 점수 5개를 배열에 저장한다.
- 반복문으로 총점을 구한다.
- 평균을 구한다
- 조건문으로 평균 등급을 판단한다.
- `ScoreManager` 클래스를 만들어 점수 계산 기능을 분리한다.

---
## 코드 작성 전 생각하는 순서
```
점수가 여러 개 있다.
→ 배열

점수를 하나씩 더해야 한다.
→ 반복문

총점을 점수 개수로 나누면 평균이다.
→ average = sum / scores.length

평균이 80 이상인지 확인한다.
→ 조건문

계산 기능을 따로 분리한다.
→ ScoreManager 클래스
```
---
## 코드 작성하는 순서
```
1. ScoreManager 클래스 생성

2. scores 배열을 인스턴스 변수로 선언

3. 생성자에서 배열 저장

4. getTotal 메서드 작성

5. for문으로 총점 계산

6. getAverage 메서드 작성

7. printResult 메서드 작성

8. if문으로 우수반/일반반 판단

9. Main에서 배열 생성

10. ScoreManager 객체 생성

11. printResult 호출
```

---
## 컴퓨터가 읽는 순서
```
Main 실행
↓

scores 배열 생성
↓

ScoreManager 객체 생성
↓

this.scores에 배열 주소 저장
↓

manager.printResult() 호출
↓

getTotal() 호출
↓

for문으로 배열 점수 하나씩 더함
↓

총점 반환
↓

getAverage() 호출
↓

총점 / 배열 길이 계산
↓

평균 반환
↓

평균이 80 이상인지 if문으로 판단
↓

결과 출력
```
---
## 핵심 원리
> 배열은 여러 값을 묶어서 관리하고, 반복문은 배열 안의 값을 하나씩 처리할 때 사용한다.

---

## 흐름 이해
메모리 안에서 어떤 일이 일어나고, 호출부(Main)와 기능부(설계도:ScoreManager)가 어떻게 협력하는지를 이해하는 과정

---
### 1. 프로그램 시작 - Main 클래스의 main() 메서드
컴퓨터는 자바 프로그램을 실행할 때 main() 메서드부터 읽기 시작함.
- 메모리의 **스택(Stack)영역**에 `scores`라는 이름의 **참조 변수**가 만들어짐.
- 그리고  **힙(Heap)** 영역에는 실제 배열 `[90, 85, 70, 95, 80]`이 저장됌.
- `scores` 변수는 그 배열의 주소를 기억하고 있음.

즉,
> "scores는 배열의 위치를 가리키는 화살표 역할을 한다."


---
### 2. 객체 생성 - new ScoreManager(scores)

```
ScoreManager manager = new ScoreManager(scores);
```
- `new` 키워드가 실행되면 **힙 영역에 ScoreManager 객체**가 만들어짐.
- 그 안에는 `int[] scores` 라는 인스턴스 변수가 있고, 생성자에서 `this.scores = scores'`가 실행됌.

즉,
> “ScoreManager 객체가 만들어지고, 그 안에 Main에서 만든 배열의 주소가 저장된다.”

이제 `manager` 변수는 그 객체를 가리키는 **참조**가 됌.


---
### 3. 메서드 호출 - manager.printResult()

이제 Main은 ScoreManager 에게 일을 시킨다.
```
manager.printResult();
```
컴퓨터는 `ScoreManager` 클래스 안으로 들어가서 `printResult()` 메서드를 실행함.


---
### 4. 내부 계산 - getTotal() 호출
printResult() 안에서 먼저 getTotal() 을 호출함.
```
int total = getTotal();
```
- 새로운 지역변수 `sum`이 만들어지고 0으로 초기화 된다.
- `for`문이 배열의 길이만큼 반복하면서 각 점수를 더함
- `return sum;` → `total` 변수에 420이 저장된다.

---
### 5. 평균 계산 - getAverage() 호출
```
int average = getAverage();
```
- getAverage() 는 내부엥서 다시 getTotal() 을 호출해 총점을 구하고,
- 배열 길이(5)로 나누어 평균을 계산한다. → 420 / 5 = 84
- return 84 → average 변수에 84 저장

---
### 6. 결과 출력 - System.out.println()
이제 printResult()가 화면에 결과를 보여줌

---
### 7. 조건문 실행
```
if (average >= 80) {
    System.out.println("우수반");
} else {
    System.out.println("일반반");
}
```
- 평균이 84니까 조건 average > 80 은 true
- 따라서 "우수반"이 출력된다.

---
- 호출부(Main)는 명령을 내리는 곳
- 기능부(ScoreManager)는 그 명령을 수행하는 곳
- 스택에는 변수(주소), 힙에는 실제 데이터(객체, 배열)가 저장됌.
- this.scores 는 현재 객체가 가진 배열의 주소 를 의미함.