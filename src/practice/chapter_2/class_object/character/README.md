# 게임 캐릭터 객체 만들기

## 문제
게임 캐릭터를 객체로 만든다.
각 캐릭터는 이름, 체력, 공격력을 가진다.
상태 출력, 공격, 데미지 받기 기능을 수행한다.

## 코드 조건
```
클래스 이름: GameCharacter

속성:
- name
- hp
- attackPower

생성자:
- 이름, 체력, 공격력을 받아 객체에 저장

기능:
- printStatus()
- attack(GameCharacter target)
- takeDamage(int damage)
```

## 코드 작성할 때 생각하는 순서
```
1. 캐릭터는 어떤 정보를 가져야 하지?
   → 이름, 체력, 공격력

2. 캐릭터를 만들 때 어떤 값을 받아야 하지?
   → 이름, 체력, 공격력

3. 캐릭터가 어떤 행동을 해야 하지?
   → 상태 출력, 공격, 데미지 받기

4. 공격할 때 필요한 대상은?
   → 공격당하는 캐릭터 target
```

## 핵심 원리
```
"warrior.attack(slime);"

이 코드는 warrior가 slime을 공격한다는 뜻이다.

attack() 안에서
this = warrior
target = slime

-----------------------------------------------------------------

"target.takeDamage(this.attackPower);"

이 코드는 

공격당하는 대상인 slime에게
공격하는 캐릭터 warrior의 공격력만큼 데미지를 주라는 뜻이다.
```
---
## 실행 흐름
```
Main 시작
↓
new GameCharacter("전사", 100, 15) 발견
↓
GameCharacter 생성자로 이동
↓
name = "전사"
hp = 100
attackPower = 15 전달받음
↓
this.name = name;
this.hp = hp;
this.attackPower = attackPower;
실행
↓
warrior 객체 완성
↓
Main으로 복귀
↓
slime 객체도 같은 방식으로 생성
```

## 공격 흐름
```java
warrior.attack(slime);
```
을 만나면:
```
Main에서 warrior.attack(slime) 발견
↓
GameCharacter.java의 attack() 메서드로 이동
↓
현재 this = warrior
target = slime
↓
"전사가 슬라임을 공격합니다." 출력
↓
target.takeDamage(this.attackPower) 실행
↓
target은 slime
this.attackPower는 warrior의 공격력 15
↓
slime.takeDamage(15) 실행
↓
takeDamage() 안에서 현재 this = slime
↓
slime의 hp에서 15를 뺌
↓
slime hp: 40 → 25
↓
Main으로 복귀
```
---

