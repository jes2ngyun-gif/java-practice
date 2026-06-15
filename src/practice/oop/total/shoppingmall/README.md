## 쇼핑몰 주문. 결제 시스템

### 문제 이름
**상품 주문과 결제 시스템 구현**

---
### 현실 비유
쿠팡, 네이버 쇼핑, 무신사 같은 쇼핑몰을 생각해보자.

사용자는
```
상품 선택
↓

주문 생성

↓
결제 방식 선택

↓
결제 진행

↓
주문 완료
```
를 경험한다.

하지만 내부에서는
```
상품 종류
결제 방식
고객 정보
주문 정보
```
등 수많은 객체들이 서로 협력하면서 동작한다.

이 구조를 `객체지향 방식으로 구현`한다.

---
### 문제 설명
상품은 두 종류가 있다.

#### 실물 상품
```
FoodProduct
```
예)
- 사과
- 피자
- 커피

---
#### 디지털 상품
```
DigitalProduct
```
예)
- 전자책
- 강의
- 게임 쿠폰

---
결제 방식은 세 가지가 있다.
```
CardPayment
KakaoPayment
TossPayment
```

사용자는 상품을 주문하고,

선택한 결제 방식으로 결제를 진행한다.

---
### 이 문제에서 다루는 것!!

| 개념         | 사용 |
| ---------- | -- |
| 클래스        | O  |
| 객체         | O  |
| 생성자        | O  |
| private    | O  |
| getter     | O  |
| 캡슐화        | O  |
| 상속         | O  |
| 추상 클래스     | O  |
| 인터페이스      | O  |
| 오버라이딩      | O  |
| 다형성        | O  |
| 업캐스팅       | O  |
| 다운캐스팅      | O  |
| instanceof | O  |
| 배열         | O  |
| 반복문        | O  |
| if문        | O  |
| final      | O  |
| static     | 선택 |

---
### 클래스 구조도
```
                   Payment
                  인터페이스
                  pay()
                     ▲
     ┌───────────────┼────────────────┐
     │               │                │
CardPayment    KakaoPayment      TossPayment



                 Product
               추상 클래스
        productName, price
                    ▲
          ┌─────────┴──────────┐
          │                    │
    FoodProduct          DigitalProduct



Customer
(고객 정보)

Order
(주문 관리)

ShoppingMallApp
(실행 클래스)
```
---
### 원리 흐름
```
상품 생성
↓

고객 생성

↓
주문 생성

↓
결제 방식 선택

↓
Payment 인터페이스 타입으로 관리

↓
pay() 호출

↓
실제 결제 객체가 동작

↓
주문 완료
```
---
### 코드 작성 전에 생각하는 순서
#### 1. 어떤 객체들이 필요한가?
```
상품
고객
주문
결제
```
---
#### 2. 상품은 공통점이 있는가? 
있다.
```
상품명
가격
```
↓

추상 클래스 Product

---
#### 3. 결제 방식들의 공통점은??
모두 결제를 한다.
```
pay()
```
↓

인터페이스 Payment

---
#### 4. 결제 방식은?
```
CardPayment
KakaoPayment
TossPayment
```
---
#### 5. 주문은 무엇을 가져야 하는가?/
```
상품
고객
결제방식
```
---
### 실행 흐름도
```
ShoppingMallApp 시작

↓


FoodProduct 생성

↓

Customer 생성

↓

CardPayment 생성

↓

Order 생성

↓

order.processOrder()

↓

payment.pay()

↓

CardPayment의 pay() 실행

↓

결제 완료

↓

주문 완료
```
---
### 중요한 핵심
#### 1. 결제 방식은 계속 늘어날 수 있다.
```
CardPayment
KakaoPayment
TossPayment
ApplePayment
NaverPay
```
그래도
```
payment.pay();
```
는 바뀌지 않는다.

---
#### 2. 상품 종류도 계속 늘어날 수 있다.
```
FoodProduct
DigitalProduct
BookProduct
SubscriptionProduct
```
그래도 Order 클래스는 거의 수정하지 않는다.

---
#### 3. 새로운 기능 추가에는 열려있고, 기존 코드 수정에는 닫혀 있는 구조이다.

---
### 실무에서 정말 많이 나오는 구조
```
쇼핑몰

결제 시스템

주문 시스템

배달 시스템

구독 시스템
```
등에서 매우 많이 활용된다.

---

#### Product는 추상 클래스인가??
yes. why?

공통 필드가 있기 때문.
```
name
price
```
---
#### Payment는 인터페이스인가?
yes. why?

결제 방식들의 규칙만 필요하기 때문.
```
pay()
```
---
#### 다형성은 어디에서 사용되는가??
```
Payment payment = new CardPayment();
```
이 부분.

---
#### 그럼 업 캐스팅은??
```
Payment payment = new CardPayment();
```
자동 발생.

---
#### 다운 캐스팅은 어디에서??
특정 결제 방식만의 기능이 필요할 때.

---
#### instanceof는?
다운캐스팅 전에 안전 검사용.

---
### 꼭 알아야 하는 것.
```
인터페이스 → 규칙

추상 클래스 → 공통 데이터

상속 → 재사용

오버라이딩 → 각자 다르게 동작

다형성 → 하나의 타입으로 여러 객체 처리

업캐스팅 → 매우 많이 사용

다운캐스팅 → 필요할 때만 사용
```
---
### 코드 작성하는 순서
```
1. Payment 인터페이스 생성
2. CardPayment / KakaoPayment / TossPayment 생성
3. Product 추상 클래스 생성
4. FoodProduct / DigitalProduct 생성
5. Customer 클래스 생성
6. Order 클래스 생성
7. ShoppingMallApp 실행 클래스 생성
```
---
### 클래스 구조 그림으로
```
Payment 인터페이스
pay(int amount)
        ▲
        │ implements
 ┌──────┼────────┐
 │      │        │
Card  Kakao    Toss
Payment Payment Payment


Product 추상 클래스
name, price
printProductInfo()
        ▲
        │ extends
 ┌──────┴────────┐
 │               │
FoodProduct   DigitalProduct


Customer
name, phoneNumber


Order
Customer + Product + Payment


ShoppingMallApp
객체 생성 / 주문 실행
```
### 실행 흐름도
```
ShoppingMallApp 실행
        ↓
        
Customer 생성
        
        ↓
FoodProduct 생성
        
        ↓
DigitalProduct 생성
        
        ↓
CardPayment 생성
        
        ↓
KakaoPayment 생성
        
        ↓
Order 생성
        
        ↓
order.processOrder()
        
        ↓
고객 정보 출력
        
        ↓
상품 정보 출력
        
        ↓
payment.pay(product.getPrice())
        
        ↓
실제 결제 객체의 pay() 실행
        
        ↓
주문 완료
        
        ↓
instanceof 검사
        
        ↓
상품/결제 고유 기능 실행
```
---
### 핵심 원리
```
Product는 추상 클래스
→ 상품명, 가격 같은 공통 데이터가 있기 때문

Payment는 인터페이스
→ 결제 방식마다 공통 규칙 pay()만 필요하기 때문

Order는 조립자
→ 고객, 상품, 결제 방식을 연결해서 주문을 처리

ShoppingMallApp은 호출부
→ 객체를 만들고 실행 흐름을 시작
```

---
### 이 예제 코딩에서 꼬옥 꼬옥 알고 넘어가야 하는 것.

| 내용                                    | 설명                  |
| ------------------------------------- | ------------------- |
| `Product product = new FoodProduct()` | 부모 타입으로 자식 객체 저장    |
| `Payment payment = new CardPayment()` | 인터페이스 타입으로 구현 객체 저장 |
| `payment.pay()`                       | 실제 객체의 pay() 실행     |
| `product.printProductInfo()`          | 실제 상품 객체 기준으로 실행    |
| `instanceof`                          | 다운캐스팅 전 안전 검사       |
| `Order`                               | 객체들을 연결하는 역할        |

---
> 상품은 Product로 묶고
> 
> 결제는 Payment로 묶고
> 
> 주문은 Order가 처리한다.

즉, 객체마다 역할을 나누고, 공통 다입으로 묶어서 사용하는 구조.