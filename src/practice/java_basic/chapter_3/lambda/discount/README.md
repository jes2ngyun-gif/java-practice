**람다는 "기능 자체를 메서드에 전달하는 문법"**

### 문제 제목 : 람다를 활용한 상품 할인 정책 계산기
### 문제 설명
쇼핑몰에서 상품 가격에 여러 할인 정책을 적용하는 프로그램을 만든다.

예를 들어 같은 상품 가격 10000원이 있어도 할인 정책에 따라 결과가 달라진다.
```
정액 할인  → 1000원 할인
정률 할인  → 10% 할인
할인 없음 → 그대로
```
이때 할인 정책을 클래스로 여러 개 만들지 않고,
**람다식으로 할인 기능을 전달**해서 계산 한다.

| 파일명               | 역할                               |
| ----------------- | -------------------------------- |
| `DiscountPolicy`  | 할인 기능을 표현하는 함수형 인터페이스            |
| `DiscountService` | 상품 가격과 할인 정책을 받아 최종 가격을 계산하는 클래스 |
| `DiscountMain`    | 실행 클래스                           |

### 원리
```
상품 가격
  10000원
    │
    ▼
DiscountService
    │
    │ 할인 정책을 전달받음
    ▼
DiscountPolicy
    │
    ├── price -> price - 1000
    ├── price -> price * 90 / 100
    └── price -> price
    │
    ▼
최종 가격 계산
```
핵심은:
```
값만 전달하는 것이 아니라
"할인하는 기능" 자체를 전달한다.
```

---
### 실행 흐름도
```
main 시작
   ↓
   
DiscountService 객체 생성
   
   ↓
상품 원가 설정
   
   ↓
정액 할인 람다 전달
   
   ↓
할인 계산
   
   ↓
정률 할인 람다 전달
   
   ↓
할인 계산
   
   ↓
할인 없음 람다 전달
   
   ↓
할인 계산
   
   ↓
결과출력
   
   ↓
종료
```

---
### 클래스의 구도 
```
[DiscountPolicy]
할인 정책 설계도
int discount(int price)

        ▲
        │ 람다식이 구현
        │
price -> price - 1000
price -> price * 90 / 100
price -> price


[DiscountService]
상품 가격과 할인 정책을 받아 계산

        ▲
        │ 호출
        │
[DiscountMain]
실행 담당
```
---
### 코드 작성 전 생각하는 순서
#### 1단계
무엇을 계산해야 하는가??
> 상품 가격에 할인 정책을 적용한 최종 가격

#### 2단계
할인 정책은 고정되어 있는가?
> 노

#### 3단계
바뀌는 부분은 무엇인가
> 할인 계산 방식

#### 4단계
바뀌는 기능을 어떻게 전달할 것인가?
> 함수형인터페이스 + 람다

#### 5단계
서비스 클래스는 무엇을 해야 하는가??
> 가격과 할인 정책을 받아서 최종 가격을 계산한다.

---
### 코드 단계별 작성하는 순서
```
1. DiscountPolicy 인터페이스 작성

2. discount(int price) 추상 메서드 작성

3. @FunctionalInterface 붙이기

4. DiscountService 클래스 작성

5. applyDiscount() 메서드 작성

6. DiscountMain에서 원가 설정

7. 람다식으로 할인 정책 작성

8. 서비스에 가격과 할인 정책 전달

9. 결과 출력
```
---
### 여기 왜 이렇게 작성??
#### 1. DiscountPolicy를 먼저 만든다
할인 정책은 "기능"이다.
```
가격을 받는다
↓
할인된 가격을 반환한다
```
그래서 함수형 인터페이스로 만든다.

---
#### 2. DiscountService를 만든다.
**계산 흐름을 담당**하는 클래스다.

할인 정책 자체는 직접 알 필요가 없다.
> 나는 가격과 정책을 받으면 계산만 한다.

이 구조가 객체지향적으로 좋다.

---
#### 3. Main에서 람다식을 작성한다.
실제 할인 방식은 실행부(호출부)에서 결정한다.
```
price -> price - 1000
```
이 한 줄이 "1000원 할인 기능"이 된다.

---
### 컴퓨터가 코드를 읽고 실행하는 흐름
#### 정액 할인 기준
```
DiscountPolicy fixedDiscount = price -> price - 1000;
```
컴퓨터 입장에서는 이렇게 본다.
```
DiscountPolicy 타입이네?
↓

DiscountPolicy 안에는 discount(int price) 하나뿐이네?

↓
그럼 price -> price - 1000 은 discount() 구현이구나.

↓
fixedDiscount 변수에 저장
```
그 다음:
```
discountService.applyDiscount(originalPrice, fixedDiscount);
```
실행:
```
originalPrice = 10000
fixedDiscount = price -> price - 1000
```
메서드 내부는:
```
return discountPolicy.discount(price);
```
실행:
```
discountPolicy.discount(10000)
↓

10000 - 1000

↓
9000 반환
```
---
### 값 변화 표

| 단계    | price | discountPolicy 동작  |    결과 |
| ----- | ----: | ------------------ | ----: |
| 정액 할인 | 10000 | `price - 1000`     |  9000 |
| 정률 할인 | 10000 | `price * 90 / 100` |  9000 |
| 할인 없음 | 10000 | `price`            | 10000 |
| 직접 전달 | 10000 | `price - 3000`     |  7000 |

---
### 핵심 원리
#### 1. 람다는 "기능"을 전달한다.
기존에는 값을 전달했다.
```
applyDiscount(10000);
```
람다에서는 "기능도 전달"한다.
```
applyDiscount(10000, price -> price - 1000);
```
---
#### 2. 함수형 인터페이스가 있어야 컴파일러가 추론할 수 있다.
```
@FunctionalInterface
public interface DiscountPolicy {
    int discount(int price);
}
```
추상 메서드가 하나이기 때문에 컴파일러는 람다식을 보고 이렇게 판단한다.
```
이 람다식은 discount() 메서드 구현이구나.
```
---
#### 3. 서비스 클래스는 할인 방식을 몰라도 된다.
DiscountService는 정액 할인인지, 정률 할인인지 모른다.

그냥 이렇게 호출만 한다.
```
discountPolicy.discount(price);
```
실제 할인 방식은 밖에서 람다식으로 전달된다.

이게 실무적으로 중요한 구. 도.

---
### 이 실습에서 반드시 알고 넘어가야 할 것
#### 1. 람다는 익명 클래스를 줄인 문법이다.
```
price -> price - 1000
```
은 내부적으로 DiscountPolicy의 discount() 메서드를 구현한다.

---
#### 2. 람다는 함수형 인터페이스와 함께 사용한다.
추상 메서드가 하나여야 한다.

---
#### 3. 메서드에 값 뿐 아니라 기능도 전달할 수 있다.
이게 람다의 핵.심.
```
applyDiscount(10000, price -> price - 1000);
```
여기서 두 번째 인자 (price - 1000)는 단순 값이 아니라 계.산.방.식.이다.

---
#### 4. 랍다는 스트림에서 많이 사용된다.
나중에 스트림에서 이런 코드를 보게 된다고 한다.
```
list.stream()
    .filter(item -> item.getPrice() >= 10000)
    .map(item -> item.getName())
    .forEach(name -> System.out.println(name));
```
여기서 `item -> ...`, `name -> ...` 이 전부 람다다.

---
### 실무에서 어떻게 활용되는가?
#### 할인 정책
```
VIP 할인
쿠폰 할인
이벤트 할인
첫 구매 할인
```
처럼 계산 방식이 바뀔 때 사용 가능하다.

---
#### 조건 필터링
```
user -> user.isActive()
```
활성 사용자만 찾기

---
#### 정렬 기준
```
(user1, user2) -> user1.getAge() - user2.getAge()
```
나이순 정렬

---
#### 데이터 변환
```
user -> user.getName()
```
사용자 객체에서 이름만 꺼내기

---
> 할인 정책을 클래스로 여러 개 만들지 않고, 람다식으로 기능을 전달해서 계산한다.

