# 문제 : 카페 방문 고객 수 관리
카페에 손님이 들어올 때마다 `customer` 객체를 생성한다.

각 손님은 이름과 나이를 가진다.

전체 방문 고객 수는 모든 객체가 함께 공유해야 하므로 `static` 변수로 관리한다.

마지막엔 전체 방문 고객 수를 출력한다.

---
## 문제 조건
- `Customer` 클래스를 만든다.
- 고객마다 `name`, `age`를 가진다.
- 전체 고객 수는 `static int customerCount`로 관리한다.
- 고객 객체가 생성될 때마다 고객 수가 1 증가해야 한다.
- 전체 고객 수를 출력하는 static 메서드를 만든다.
---
## 코드 작성 전 순서
```
고객마다 이름은 다르다.
→ 인스턴스 변수

고객마다 나이도 다르다.
→ 인스턴스 변수

전체 고객 수는 모든 고객이 공유해야 한다.
→ static 변수

고객이 생성될 때마다 고객 수가 증가해야 한다.
→ 생성자에서 customerCount++

전체 고객 수 출력은 객체 없이도 가능해야 한다.
→ static 메서드
```
---
## 코드 작성 순서
```
1. Customer 클래스 생성

2. name, age 인스턴스 변수 선언

3. customerCount static 변수 선언

4. 생성자 작성

5. this.name, this.age로 값 저장

6. customerCount 증가

7. printCustomerCount static 메서드 작성

8. Main에서 Customer 객체 3개 생성

9. Customer.printCustomerCount() 호출
```
---
## 컴퓨터가 읽는 순서
```
Main 실행
↓

Customer 클래스 로딩
↓

static customerCount = 0 생성
↓

new Customer("유미", 20)
↓

c1 객체 생성
↓

this.name = "유미"
this.age = 20
customerCount = 1
↓

new Customer("룰루", 22)
↓

c2 객체 생성
↓

customerCount = 2
↓

new Customer("나미", 25)
↓

c3 객체 생성
↓

customerCount = 3
↓

Customer.printCustomerCount()
↓

전체 고객 수 : 3 출력
```

---
## 핵심 원리
>객체마다 다른 값은 인스턴스 변수로 만들고, 모든 객체가 함께 공유해야 하는 값은 static 변수로 만든다.

---
### 호출부와 기능부 사이에서 어떤 일이 일어나는지, 결과가 어떻게 출력되는지?

### 1. 프로그램 시작 - Main클래스의 main() 메서드
```
BankAccount account1 = new BankAccount("유미", 50000);
BankAccount account2 = new BankAccount("룰루", 120000);
```
- `new BankAccount(...)`는 BankAccount 설계도(클래스)를 이용해 새 계좌 객체를 만드는 명령이다.
- `BankAccount` 클래스의 생성자가 호출돼서 실행됌:
```
 public BankAccount(String owner, int balance) {
    this.owner = owner;
    this.balance = balance;
}
```
- `this.owner = owner;` → 전달받은 `"유미"`를 객체 내부의 `owner` 변수에 저장
- `this.balance = balance;` → 전달받은 `50000`을 객체 내부의 `balance` 변수에 저장
- 이렇게 해서 `account1`에는 “유미의 계좌 정보”가 들어 있고, `account2`에는 “룰루의 계좌 정보”가 들어 있다.

---
### 2. 입금 기능 호출 - deposit() 메서드
```
account1.deposit(60000);
account2.deposit(10000);
```
**account1.deposit(60000)을 예로**
- deposit() 메서드가 실행되면, 그 안의 첫 줄이 작동함:
```
balance = balance + money;
```
즉, 현재 잔액(balance)에 입금 금액(money)을 더해서 다시 저장함.

>유미의 경우: 50000 + 60000 = 110000
룰루의 경우: 120000 + 10000 = 130000

- 다음 줄:
```
 if (balance >= 100000) {
        System.out.println(owner + "님은 VIP 고객입니다.");
}
```
유미의 잔액은 110,000원이니까 조건 balance >= 100000이 참 → “유미님은 VIP 고객입니다.” 출력

룰루의 잔액은 130,000원이니까 역시 VIP 메시지 출력

--- 
### 3. 정보 출력 - printInfo() 메서드
```
account1.printInfo();
account2.printInfo();
```
내부에서 일어나는 일

printInfo() 는 단순히 계좌 정보를 화면에 보여주는 기능이다.
```
System.out.println("계좌 주인 : " + owner);
System.out.println("현재 잔액 : " + balance);
System.out.println("적용 이자율 : " + interestRate);
```
- `owner`, `balance`는 각 객체가 가진 고유 정보
- `interestRate`는 `static 변수`라서 모든 계좌가 **공통으로 0.03**을 사용해


---
### 4. 최종 출력
실행
