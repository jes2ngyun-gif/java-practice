package practice.chapter_2.class_object.character;
// 게임 캐릭터 객체 만들기
public class Main {
    public static void main(String[] args) {


        GameCharacter warrior = new GameCharacter("전사", 100, 15);
            // 전사 캐릭터 객체를 생성한다.
            // new GameCharacter(...)를 만나면 GameCharacter 생성자로 이동한다.
            // "전사", 100, 15 값이 생성자로 전달된다.

        GameCharacter slime = new GameCharacter("슬라임", 40, 5);
             // 슬라임 캐릭터 객체를 생성한다.
             // warrior와 slime은 같은 설계도로 만들어졌지만 서로 다른 객체이다.

        warrior.printStatus();
             // warrior 객체의 현재 상태를 출력한다.
             // 현재 this는 warrior다.

        slime.printStatus();
             // slime 객체의 현재 상태를 출력한다.
             // 현재 this는 slime이다.

        warrior.attack(slime);
              // warrior가 slime을 공격한다.
              // attack() 메서드 안에서 this는 warrior, target은 slime이다.

        slime.printStatus();
              // 공격당한 뒤 slime의 상태를 다시 출력한다.
              // slime의 hp가 줄어든 것을 확인할 수 있다.

        slime.attack(warrior);
               // slime이 warrior를 공격한다.
               // 이번에는 this가 slime, target이 warrior다.

        warrior.printStatus();
                // 공격당한 뒤 warrior의 상태를 다시 출력한다.
    }
}