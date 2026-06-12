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

### 전체 흐름도
```

```