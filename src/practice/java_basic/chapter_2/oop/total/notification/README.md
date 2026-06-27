### 알림 시스템 만들기

### 문제 이름
인터페이스와 추상 클래스를 활용한 알림 발송 시스템

---
### 문제 설명
실제 서비스에서는 사용자에게 여러 방식으로 알림을 보낸다.
```
이메일 알림
문자 알림
카카오톡 알림
```
각 알림은 보내는 방식이 다르다.

하지만 사용하는 쪽에서는 알림 종류가 무엇이든 같은 방식으로 보내고 싶다.
```
notification.send();
```
이렇게.

그래서 이번 실습에서는 다음 구조를 만든다.
```
Notification 인터페이스
        ↓
AbstractNotification 추상 클래스
        ↓
EmailNotification / SmsNotification / KakaoNotification
```
---
### 이 문제에서 배우는 것

| 개념         | 사용 위치                                             |
| ---------- | ------------------------------------------------- |
| 인터페이스      | `Notification`                                    |
| 추상 클래스     | `AbstractNotification`                            |
| 캡슐화        | `private receiver`, `private message`             |
| 상속         | 자식 클래스들이 추상 클래스 상속                                |
| 오버라이딩      | 각 알림의 `send()` 구현                                 |
| 다형성        | `Notification[]` 배열                               |
| 업캐스팅       | `Notification email = new EmailNotification(...)` |
| 다운캐스팅      | 이메일 고유 기능 사용                                      |
| instanceof | 안전한 다운캐스팅                                         |
| 배열         | 여러 알림 저장                                          |
| 반복문        | 알림 일괄 발송                                          |
| final      | 문자 최대 길이 상수                                       |

---
### 클래스 구조도
```
                 Notification
                 인터페이스
              send() 규칙 정의
                      ▲
                      │ implements
                      │
             AbstractNotification
                추상 클래스
       receiver, message 공통 필드
       생성자, getter 공통 처리
                      ▲
        ┌─────────────┼─────────────┐
        │             │             │
EmailNotification SmsNotification KakaoNotification
 이메일 알림        문자 알림        카카오톡 알림
```
---
### 현실 비유
인터페이스는 **계약서**이다.
```
알림이라면 반드시 send() 기능이 있어야 한다.
```
추상 클래스는 **공통 양식이 들어간 기본 신청서**이다.
```
수신자
메시지
기본 검증
getter
```
자식 클래스는 **실제 알림 방식**이다.
```
이메일은 이메일 방식으로 보냄
문자는 문자 방식으로 보냄
카카오는 카카오톡 방식으로 보냄
```
---
### 코드 작성 전 생각하는 순서
```
1. 모든 알림이 반드시 가져야 하는 규칙은?
   → send()

2. 그 규칙은 어디에 둘 것인가?
   → Notification 인터페이스

3. 모든 알림이 공통으로 가지는 데이터는?
   → receiver, message

4. 공통 데이터와 생성자 검증은 어디에 둘 것인가?
   → AbstractNotification 추상 클래스

5. 실제 알림 종류는?
   → EmailNotification, SmsNotification, KakaoNotification

6. Main에서는 어떻게 사용할 것인가?
   → Notification 타입 배열에 담고 반복문으로 send()

7. 특정 알림만의 기능은 어떻게 사용할 것인가?
   → instanceof 검사 후 다운캐스팅
```

---
### 실행 흐름도
```
NotificationApp 실행
        ↓
        
Notification email = new EmailNotification(...)
        
        ↓
EmailNotification 객체 생성
        
        ↓
AbstractNotification 생성자 실행
        
        ↓
receiver, message 저장
        
        ↓
EmailNotification의 title 저장
        
        ↓
Notification 타입으로 업캐스팅

        ↓

Notification sms = new SmsNotification(...)
        
        ↓
SmsNotification 객체 생성
        
        ↓
Notification 타입으로 업캐스팅

        ↓

Notification kakao = new KakaoNotification(...)
        
        ↓
KakaoNotification 객체 생성
        
        ↓
Notification 타입으로 업캐스팅

        ↓

Notification[] 배열에 세 객체 저장
        
        ↓
for문 실행
        
        ↓
notification.send()
        
        ↓
실제 객체 기준으로 send() 실행
        
        ↓
Email / SMS / Kakao 방식으로 각각 출력

        ↓

instanceof 검사
        
        ↓
맞으면 다운캐스팅
        
        ↓
자식 고유 기능 실행
```
---
### 컴퓨터가 읽는 순서

| 순서 | 코드                             | 컴퓨터가 하는 일                      |
| -: | ------------------------------ | ------------------------------ |
|  1 | `main()`                       | 프로그램 시작                        |
|  2 | `new EmailNotification(...)`   | 이메일 객체 생성                      |
|  3 | `super(receiver, message)`     | 부모 생성자 실행                      |
|  4 | `this.title = title`           | 이메일 제목 저장                      |
|  5 | `Notification email = ...`     | 인터페이스 타입으로 업캐스팅                |
|  6 | `new SmsNotification(...)`     | 문자 객체 생성                       |
|  7 | `new KakaoNotification(...)`   | 카카오 객체 생성                      |
|  8 | `Notification[] notifications` | 객체들을 배열에 저장                    |
|  9 | `for`문                         | 배열에서 하나씩 꺼냄                    |
| 10 | `notification.send()`          | 실제 객체의 send() 실행               |
| 11 | `instanceof`                   | 실제 타입 확인                       |
| 12 | 다운캐스팅                          | 자식 타입으로 변환                     |
| 13 | 고유 기능 호출                       | attachFile(), checkLength() 실행 |

---

### 변수와 객체의 흐름
```
Notification email
        │
        ▼
EmailNotification 객체

Notification sms
        │
        ▼
SmsNotification 객체

Notification kakao
        │
        ▼
KakaoNotification 객체
```
핵심은 이거다.
```
변수 타입은 Notification
실제 객체는 각각 다름
실행되는 메서드는 실제 객체 기준
```
---
### 핵심 원리
#### 1.인터페이스는 규칙이다.
```
public interface Notification {
    void send();
}
```
Notification을 구현하는 클래스는 반드시 `send()`를 가져야 한다.

---
#### 2.추상 클래스는 공통 기능을 재사용하게 해준다.
```
public abstract class AbstractNotification implements Notification
```
공통 필드인 `receiver`, `message`와 getter를 한 곳에서 관리한다.

---
#### 3.캡슐화는 데이터를 보호한다.
```
private String receiver;
private String message;
```
필드를 직접 건드리지 못하게 하고, getter로 읽게 한다.

---
#### 4.상속은 공통 코드를 물려준다.
Email, SMS, Kakao는 모두 `AbstractNotification`을 상속받기 때문에 공통 필드와 메서드를 재사용할 수 있다.

---
#### 5.오버라이딩은 같은 이름의 메서드를 다르게 동작하게 한다.
```
@Override
public void send()
```
모두 `send()` 라는 이름을 쓰지만 실행 결과는 다르다.

---
#### 6.다형성은 하나의 타입으로 여러 객체를 다루는 것이다.
```
Notification[] notifications = {email, sms, kakao};
```
서로 다른 객체를 하나의 배열에 담고, 같은 방식으로 호출할 수 있다.

---
#### 7.다운캐스팅은 조심해서 써야 한다.
```
if (email instanceof EmailNotification) {
    EmailNotification emailNotification = (EmailNotification) email;
}
```
자식 고유 기능이 필요할 때만 사용한다.

무조건 다운캐스팅하는 습관은 좋지 않다.

---
### 반드시 알고 넘어가야 할 것.!.!.!.1!

| 내용                            |   중요도 | 설명                       |
| ----------------------------- | ----: | ------------------------ |
| 인터페이스는 규칙이다                   | 매우 중요 | 반드시 구현해야 할 기능 정의         |
| 추상 클래스는 공통 코드 재사용용이다          | 매우 중요 | 필드, 생성자, getter 관리       |
| 부모 타입으로 자식 객체를 담을 수 있다        | 매우 중요 | 업캐스팅                     |
| 오버라이딩된 메서드는 실제 객체 기준으로 실행된다   | 매우 중요 | 다형성 핵심                   |
| 자식 고유 기능은 부모 타입으로 바로 호출할 수 없다 |    중요 | 다운캐스팅 필요                 |
| 다운캐스팅 전에는 instanceof를 사용한다    |    중요 | ClassCastException 방지    |
| 다운캐스팅을 남발하면 설계가 나빠진다          |    중요 | 공통 기능은 인터페이스/부모에 두는 게 좋음 |

---
### 중요한 흐름
```
Notification 인터페이스
규칙 정의
        ↓
AbstractNotification 추상 클래스
공통 데이터와 공통 기능 관리
        ↓
Email / SMS / Kakao
각자 방식대로 send() 구현
        ↓
Notification 타입으로 묶기
        ↓
반복문으로 한 번에 실행
```
---
### 실무에서는 어떻게 쓰이나??
실무에서는 이런 구조가 자주 나온다.
```
결제 시스템
Payment 인터페이스
CardPayment / KakaoPayment / TossPayment

알림 시스템
Notification 인터페이스
EmailNotification / SmsNotification / PushNotification

파일 업로드
FileUploader 인터페이스
LocalUploader / S3Uploader
```
사용하는 쪽에서는 구체적인 클래스를 몰라도 된다.
```
notification.send();
```
만 호출하면 된다.

이 구조는 새로운 기능을 추가할 때 유리하다.

예를 들어 `PushNotification`을 추가하고 싶다면 기존 코드를 크게 바꾸지 않고 새 클래스를 추가하면 된다.

---
> 규칙은 인터페이스가 정한다.
> 
> 공통 데이터는 추상 클래스가 관리한다.
> 
> 실제 동작은 자식 클래스가 구현한다.
> 
> 사용하는 쪽은 부모 타입으로 통합해서 다룬다.




