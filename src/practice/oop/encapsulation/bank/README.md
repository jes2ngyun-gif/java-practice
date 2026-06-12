# 문제
캡슐화를 적용한 은행 계좌 프로그램

## 문제 설명
은행 계좌를 만들어
- 계좌 생성
- 입금
- 출금
- 잔액 조회

기능을 구현한다.

단, 잔액(balance)은 외부에서 마음대로 수정할 수 없도록 보호해야 한다.

---
## 코드 조건
#### 조건 1
잔액은 음수가 될 수 없다.

#### 조건 2
0원 이하 입금은 불가능하다.

#### 조건 3
잔액보다 많은 돈은 출금할 수 없다.

#### 조건 4
잔액은 외부에서 직접 변경하지 못한다.

---
## 코드를 작성하기 전에 생각하는 순서
#### 1. 무엇을 보호해야 하는가?
```
잔액(balance)
```
은행 계좌의 가장 중요한 정보다.

↓

외부에서
```
account.balance = -100000;
```
같은 짓을 하면 안 된다.

↓

`private` 필요!!

---
#### 2. 어떤 행동이 필요한가?
```
입금
출금
잔액조회
```

↓

메서드필요함!!
```
deposit()
withdraw()
getBalance()
```
---
#### 3. 입금이나 출금 전에 검사해야 하는 것은?
입금
```
0보다 커야 함
```
출금
```
잔액보다 작거나 같아야 함
```
↓

`if 문` 필요!!!!!

---
## 코드를 작성하는 순서
```
BankAccount 클래스 생성

↓

balance 필드 선언

↓

private 적용

↓

생성자 작성

↓

deposit()

↓

withdraw()

↓

getBalance()

↓

Main에서 객체 생성

↓

메서드 호출
```

---
## 실행 흐름
#### Main(호출부)
```
BankAccount account = new BankAccount(10000);

account.deposit(5000);
account.withdraw(3000);

System.out.println(account.getBalance());
```
---
#### BankAccount(기능부)
```
생성자
↓

balance = 10000

↓

deposit(5000)

↓

15000

↓

withdraw(3000)

↓

12000

↓

getBalance()

↓

12000 반환
```

---
## 컴퓨터가 이해하는 순서
```
Main 시작

↓

new BankAccount(10000)

↓

BankAccount 생성자 실행

↓

balance = 10000

↓

deposit(5000)

↓

balance = 15000

↓

withdraw(3000)

↓

balance = 12000

↓

getBalance()

↓

12000 반환

↓

출력
```

---
## 핵심 원리
#### 왜 캡슐화가 필요할까?

은행 계좌의 잔액을 아무나 수정할 수 있으면 시스템이 망가진다.

```
account.balance = -1000000;
```
같은 일이 가능해진다.

그래서
> 중요한 데이터는 숨기고`(private)`
> 
> 허용된 행동만 공개한다`(public)`.

라는 개념이 등장했슴.

---

## 캡슐화란?
> 데이터를 보호하고, 허용된 방법으로만 접근하도록 만드는 것.

이다.

---
## 캡슐화는 어떻게 사용되나?
```
private int balance;
```
로 데이터를 숨긴다.

그리고
```
deposit()
withdraw()
getBalnace()
```
같은 메서드를 통해서만 접근하도록 한다.


---

### 잔액 `balance`는 아무나 직접 건드리면 위험하다.
### 그래서 `private`으로 숨기고, `deposit()`, `withdraw()`, `getBalance()`라는 안전한 통로만 열어둔다.

## 실행 흐름

```
[Main 클래스]
   |
   | 1. 계좌 생성 요청
   v
new BankAccount(10000)
   |
   v
[BankAccount 객체]
   ├── private int balance = 10000
   ├── deposit(5000)
   ├── withdraw(3000)
   └── getBalance()
```

조금 더 현실적인 비유로 보면:
```
손님(Main)
   ↓ 요청
은행 직원(BankAccount 메서드)
   ↓ 검사 후 처리
금고(balance)
```
---
## 필드가 뭐야?
은행 계좌를 하나 만든다고 생각해보자.
```
은행 계좌

계좌번호 : 1234
예금주 : 정윤
잔액 : 10000
```
이 계좌가 가지고 있는 정보들이 있지?
- 계좌번호
- 예금주
- 잔액

이런 **객체가 가지고 있는 데이터(속성)**를 자바에서는 **필드(Field)**라고 부른다.

BankAccount에서는
```
private int balace;
```
이것이 필드이자 속성이다.
```
BankAccount 객체

┌─────────────┐
│ balance     │
│ 10000       │
└─────────────┘
```
객체가 살아있는 동안 계속 가지고 있는 값이다.

---
## 매개변수(parameter)는 뭐야?
비유를 먼저 해보자

피자를 주문한다고 생각해보자.
```
피자집(생성자)

주문서
---------
사이즈 : 라지
---------
```
손님이 "라지" 라는 값을 잠깐 전달해준다.

이 값은 영원히 저장되는 것이 아니다.

잠시 전달되는 값이다.

이것을 **매 개 변 수** 라고 한다.
```
public BankAccount(int balance)
```
여기서
```
int balance
```
가 매개변수이다.

---
## 객체가 만들어질 때의 흐름.
**Main**
```
BankAccount account = new BankAccount(10000);
```
↓

**생성자 호출**
```
public BankAccount(int balance)
```
여기서
```
balance = 10000
```
이 된다.

즉,
```
매개변수 balance

┌───────┐
│10000  │
└───────┘
```
가 잠~깐 생긴다. 잠~~~~~~~~~~깐!!!!

---
## 그런데 객체 안의 진짜 잔액은 아직 비어있다.
```
BankAccount 객체

┌─────────────┐
│ balance     │
│ ???         │
└─────────────┘
```
그래서 생성자 안에서
```
this.balance = balance;
```
를 실행한다.

---
## 그림으로 보면
#### 오른쪽 balance (매개변수)
```
주문서

balance
┌──────┐
│10000 │
└──────┘
```
↓

#### 왼쪽 this.balance (객체의 필드)
```
BankAccount 객체

┌─────────────┐
│ balance     │
│ 10000       │
└─────────────┘
```
---
## 왜 this가 붙어있을까?

여기서
```
this.balance
```
는
> 내 객체가 가지고 있는 balance


를 뜻한다.ㅏ

즉,
```
this.balance = balance;
```
는
매개변수 balance에 들어있는 값을, 내 객체의 balance 필드에 복사해 넣어라!!!!!!!
라는 뜻.

---
```
Main

new BankAccount(10000)

       ↓

생성자

public BankAccount(int balance)

        ↓

매개변수 balance
┌──────┐
│10000 │
└──────┘

        ↓ 복사

객체 내부(this)

┌─────────────┐
│ balance     │
│ 10000       │
└─────────────┘

        ↓

Main으로 돌아감

account
   │
   ▼

┌─────────────┐
│ balance     │
│ 10000       │
└─────────────┘
```

