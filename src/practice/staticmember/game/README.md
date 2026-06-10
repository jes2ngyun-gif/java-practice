# 문제 : 게임 캐릭터 관리 시스템
게임 캐릭터를 관리하는 `GameCharacter` 클래스를 만든다.

각 캐릭터는 이름과 체력을 가진다.

전체 캐릭터 수는 `static` 변수로 관리한다.

캐릭터 3명을 배열에 저장하고, 반복문으로 모든 캐릭터 정보를 출력한다.

체력이 50이하인 캐릭터는 `"위험상태"`를 출력한다.

---
## 문제 조건
- `GameCharacter` 클래스를 만든다.
- 캐릭터마다 name, hp를 가진다.
- 전체 캐릭터 수는 static 변수로 관리한다.
- 캐릭터 생성 시 전체 캐릭터 수가 증가한다.
- 캐릭터 정보를 출력하는 인스턴스 메서드를 만든다.
- 전체 캐릭터 수를 출력하는 static 메서드를 만든다.
- 캐릭터 3명을 배열에 저장한다.
- 반복문으로 배열을 순회한다.
- hp가 50 이하이면 "위험 상태"를 출력한다.
---
## 코드 작성 전 생각 순서
```
캐릭터마다 이름은 다르다.
→ 인스턴스 변수

캐릭터마다 체력도 다르다.
→ 인스턴스 변수

전체 캐릭터 수는 모든 객체가 공유한다.
→ static 변수

캐릭터가 생성될 때마다 수가 증가한다.
→ 생성자에서 characterCount++

여러 캐릭터를 묶어서 관리한다.
→ 배열

배열에 있는 캐릭터를 하나씩 확인한다.
→ 반복문

체력이 50 이하인지 확인한다.
→ 조건문
```

---
## 코드 작성하는 순서
```
1. GameCharacter 클래스 생성

2. name, hp 인스턴스 변수 선언

3. characterCount static 변수 선언

4. 생성자 작성

5. this.name, this.hp 저장

6. characterCount 증가

7. printInfo 인스턴스 메서드 작성

8. hp가 50 이하인지 if문으로 판단

9. printCharacterCount static 메서드 작성

10. Main에서 GameCharacter 배열 생성

11. 배열에 캐릭터 객체 저장

12. for문으로 배열 순회

13. 각 캐릭터의 printInfo 호출

14. 전체 캐릭터 수 출력
```
## 컴퓨터가 읽는 순서
```
Main 실행
↓

GameCharacter 클래스 로딩
↓

static characterCount = 0 생성
↓

GameCharacter 배열 생성
↓

characters[0]에 전사 객체 생성 후 저장
↓

characterCount = 1
↓

characters[1]에 궁수 객체 생성 후 저장
↓

characterCount = 2
↓

characters[2]에 마법사 객체 생성 후 저장
↓

characterCount = 3
↓

for문 시작
↓

characters[0].printInfo()
↓

전사 정보 출력
↓

hp 100은 50 이하가 아니므로 위험 상태 출력 안 함
↓

characters[1].printInfo()
↓

궁수 정보 출력
↓

hp 40은 50 이하이므로 위험 상태 출력
↓

characters[2].printInfo()
↓

마법사 정보 출력
↓

hp 60은 50 이하가 아니므로 위험 상태 출력 안 함
↓

GameCharacter.printCharacterCount()
↓

전체 캐릭터 수 3 출력
```

---
## 핵심 원리
> 여러 객체를 배열에 담아 반복문으로 처리하면, 같은 작업을 객체마다 반복해서 수행 할 수 있다. 
> 
> 객체마다 다른 값은 인스턴스 변수, 전체가 공유하는 값은 static 변수로 관리한다.

---
인스턴스 변수
→ 객체마다 따로 가지는 값

static 변수
→ 클래스가 하나만 가지고 모든 객체가 공유하는 값

인스턴스 메서드
→ 특정 객체의 값을 사용하는 기능

static 메서드
→ 객체 없이 클래스 이름으로 호출할 수 있는 기능

---
### 1. 프로그램 시작 - Main 클래스의 main() 메서드
컴퓨터는 자바 프로그램을 실행할 때 항상 main()  메서드부터 읽는다.
```
GameCharacter[] characters = new GameCharacter[3];
```
- 메모리의 스택(Stack) 영역에 characters 라는 참조 변수가 만들어진다.
- 힙 영역에는 크기가 3인 배열 공간이 생성된다.
  이 배열은 아직 비어 있고, 각 칸에는 `null`이 들어 있다.
  즉, "캐릭터 3명을 담을 그릇만 만들어진 상태"

---
### 2. 객체 생성 - new GameCharacter("가렌", 100)
```
characters[0] = new GameCharacter("가렌", 100);
```
- `new` 키워드가 실행되면 힙 영역에 GameCharacter 객체가 만들어진다.
- 그 객체 안에는 `name`과 `hp`라는 변수가 있고, 생성자에서 다음 코드가 실행된다:

```
this.name = name;   // "가렌" 저장
this.hp = hp;       // 100 저장
characterCount++;   // static 변수 1 증가
```
- `characterCount`는 `static 변수`라서 모든 캐릭터가 공유하는 하나의 공간에 저장돼.
- 즉, “전체 캐릭터 수”를 세는 역할을 한다.

이제 `characters[0]`은 “가렌 객체의 주소”를 저장하게 됌.

---
### 3. 나머지 캐릭터 생성
```
characters[1] = new GameCharacter("애쉬", 40);
characters[2] = new GameCharacter("럭스", 60);
```
- 각각의 `new`가 실행될 때마다 새로운 객체가 힙에 만들어지고, `characterCount++`가 실행돼서 총 캐릭터 수가 3이 된다.

즉, 힙에는:
```
[가렌 객체] name="가렌", hp=100
[애쉬 객체] name="애쉬", hp=40
[럭스 객체] name="럭스", hp=60
```
이렇게 저장돼 있음.

---
### for문 실행 - 각 캐릭터 정보 출력
```
for (int i = 0; i < characters.length; i++) {
    characters[i].printInfo();
}
```
컴퓨터는 배열의 각 칸을 순서대로 읽으면서 `printInfo()` 메서드를 호출한다.

#### 첫번째 반복(i = 0)
- `characters[0]` → 가렌 객체의 `printInfo()` 실행
```
System.out.println("이름 : 가렌");
System.out.println("체력 : 100");
```
- hp < 50 조건은 거짓 → "위험 상태" 출력 안 함
- 빈 줄 출력.

#### 두번째 반복(i = 1)
- 조건 참 → "위험 상태" 출력

#### 세번째 반복(i = 2)
- 조건 거짓 → "위험 상태" 출력 안 함.

---
## 전체 캐릭터 수 출력
```
GameCharacter.printCharacterCount();
```
- 이건 static 메서드라서 객체 없이 클래스 이름으로 직접 호출이 된다.
- characterCount는 3이니까 → 전체 캐릭터 수 : 3 이라고 출력된다.

---
## 최종 콘솔 출력
실행.