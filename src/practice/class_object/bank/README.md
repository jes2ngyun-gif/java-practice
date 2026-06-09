# 은행 계좌 객체 만들기  
## 문제
은행 계좌를 객체로 만든다.
각 계좌는 예금주 이름과 잔액을 가진다.
계좌 정보 출력, 입금, 출금 기능을 수행한다.

## 코드 조건
```
클래스 이름: BankAccount

속성:
- owner
- balance

생성자:
- 예금주 이름, 초기 잔액을 받아 객체에 저장

기능:
- printInfo()
- deposit(int money)
- withdraw(int money)
```

---
## 코드 작성할 때 생각하는 순서
```
1. 계좌는 어떤 정보를 가져야 하지?
   → 예금주, 잔액

2. 계좌를 만들 때 어떤 값을 받아야 하지?
   → 예금주, 초기 잔액

3. 계좌가 어떤 행동을 해야 하지?
   → 계좌 정보 출력, 입금, 출금

4. 입금과 출금은 무엇을 바꾸지?
   → 현재 객체의 balance 값을 바꾼다.
```

---
## 핵심 원리
```
bankaccountA.deposit(3000);

이 코드는 bankaccountA 계좌에 3000원을 입금하라는 뜻이다.

deposit() 안에서
this = bankaccountA

따라서 this.balance는 bankaccountA의 잔액이다.

bankaccountA의 잔액이 바뀌어도
bankaccountB의 잔액은 바뀌지 않는다.

왜냐하면 두 객체는 서로 다른 객체이기 때문이다.
```

---
BankAccount는 계좌 설계도이고,  bankaccountA는 실제 계좌 객체다.

---
## 실행 흐름
### 1. 객체 생성
```java
BankAccount accountA = new BankAccount("콩떡", 10000);
```
컴퓨터
```
Main 시작
↓

new BankAccount("콩떡",10000) 발견

↓

BankAccount 생성자로 이동

↓

owner = "콩떡"
balance = 10000

전달받음

↓

this.owner = owner
this.balance = balance

실행

↓

콩떡 계좌 객체 완성

↓

Main으로 복귀

↓

bankaccountA라는 이름표를 붙임
```

---
### 2. 입금
```java
bankaccountA.deposit(3000);
```
컴퓨터:
```
Main에서 deposit 발견

↓

BankAccount.java의 deposit()으로 이동

↓

현재 this = bankaccountA

↓

this.balance = this.balance + money

↓

10000 + 3000

↓

13000

↓

bankaccountA의 잔액이 13000으로 변경

↓

Main으로 복귀
```

---
### 3. 출금
```java
bankaccountB.withdraw(2000);
```
컴퓨터:
```
Main에서 withdraw 발견

↓

withdraw()로 이동

↓

현재 this = bankaccountB

↓

5000 - 2000

↓

3000

↓

bankaccountB의 잔액이 3000으로 변경

↓

Main으로 복귀
```

---
## 이 실습에서 중요한거!!
```java
bankaccountA.deposit(3000);
```
를 만나면
```
Main

↓

bankaccountA가 입금해!

↓

deposit() 메서드로 이동

↓

현재 this = bankaccountA

↓

bankaccountA의 잔액 수정

↓

Main으로 복귀
```

---
## 사람이 코딩하는 순서와 컴퓨터 실행 순서는 다르다.
```
사람이 코딩하는 순서

1. 속성 작성
2. 생성자 작성
3. 기능 작성
4. Main에서 객체 생성
5. Main에서 기능 호출
```

```
컴퓨터 실행 순서

1. Main 시작
2. 객체 생성 코드 발견
3. 생성자로 이동
4. 객체 속성에 값 저장
5. Main으로 복귀
6. 메서드 호출 코드 발견
7. 메서드로 이동
8. 기능 실행
9. Main으로 복귀
```

---
```
Main은 객체를 만들고 일을 시키는 곳이다.

속성은 객체가 가지고 있는 데이터다.

생성자는 객체가 태어날 때 값을 저장하는 통로다.

메서드는 객체가 할 수 있는 행동이다.

this는 지금 만들어지고 있거나,
지금 행동하고 있는 객체 자기 자신이다.
```