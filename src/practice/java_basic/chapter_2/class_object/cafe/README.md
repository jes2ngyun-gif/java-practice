# 카페 주문 객체 만들기

## 문제
카페에서 음료 주문을 객체로 만든다.
각 주문은 메뉴명, 가격, 수량을 가진다.
주문 정보 출력과 총 금액 계산 기능을 수행한다.

## 코드 조건
```
클래스 이름 : CafeOrder

속성:
- menuName
- price
- quantity

생성자:
- 메뉴명, 가격, 수량을 받아 객체에 저장

기능:
- printOrderInfo()
- printTotalPrice()
```
## 코드 작성할 때 생각하는 순서
```
1. 주문 객체는 어떤 정보를 가져야 하지?
 → 메뉴명, 가격, 수량
2. 객체를 만들 때 어떤 값을 받아야 하지?
 → 메뉴명, 가격, 수량
3. 객체가 어떤 행동을 해야 하지?
 → 주문 정보 출력, 총 금액 계산
4. Main에서는 무엇을 해야 하지?
 → 주문 객체를 만들고, 기능을 실행시킨다. 
 ```

---
## 실행 흐름
```
Main 시작
↓
new CafeOrder("아메리카노", 4500, 2) 발견
↓
CafeOrder 생성자로 이동
↓
menuName = "아메리카노"
price = 4500
quantity = 2 전달받음
↓
this.menuName, this.price, this.quantity에 저장
↓
orderA 객체 완성
↓
Main으로 복귀
↓
orderB도 같은 방식으로 생성
↓
orderA.printOrderInfo() 발견
↓
CafeOrder.java의 printOrderInfo()로 이동
↓
현재 this는 orderA
↓
아메리카노 정보 출력
↓
Main으로 복귀
↓
orderA.printTotalPrice() 발견
↓
현재 this는 orderA
↓
4500 * 2 계산
↓
9000원 출력
```

---
## 핵심 원리
```
new CafeOrder(...) = 주문 객체 생성
생성자 = 주문서 값을 실제 객체에 저장
this = 지금 행동 중인 객체
orderA.printTotalPrice() = orderA에게 총액 계산을 시킨 것
```

---
클래스는 설계도다.
객체는 설계도를 바탕으로 실제 만들어진 것이다.

CafeOrder는 주문 설계도이고, orderA는 실제 주문 객체이다.

---
#### 생성자

생성자는 객체를 만들 때 실행되는 특별한 메서드이다.

```
new CafeOrder("아메리카노", 4500, 2)

이 코드를 만나면 CafeOrder 생성자가 실행된다.

생성자는 전달받은 값을 this.menuName, this.price, this.quantity 같은
실제 객체의 속성에 저장한다.
```
---
#### this
this는 현재 객체를 의미한다.
```
생성자 안에서는 지금 만들어지고 있는 객체를 의미한다.
메서드 안에서는 지금 그 기능을 실행하고 있는 객체를 의미한다.

orderA.printOrderInfo()를 실행하면 this는 orderA다.
orderB.printOrderInfo()를 실행하면 this는 orderB다.
```
---
#### this.name = name 구조
```
this.name = name;

왼쪽 this.name:
실제 객체 안의 name 칸

오른쪽 name:
생성자나 메서드로 잠깐 전달받은 임시 값

즉, 오른쪽의 값을 왼쪽 실제 객체의 속성에 복사해서 저장하는 코드다.
```

---
## 같은 메서드인데 결과가 다른 이유
```
orderA.printTotalPrice();
orderB.printTotalPrice();

둘 다 같은 printTotalPrice() 메서드를 사용한다.

하지만 orderA가 호출하면 this는 orderA이고,
orderB가 호출하면 this는 orderB다.

그래서 같은 메서드를 사용해도 객체마다 다른 결과가 나온다.
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
## 요약
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