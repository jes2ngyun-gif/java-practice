package practice.chapter_2.class_object.character;

public class GameCharacter {

         //속성 : 캐릭터 객체가 각자 가지고 있는 데이터이다.
    String name;
    int hp;
    int attackPower;


          //생성자 : 캐릭터를 만들 때 이름, 체력, 공격력을 받아 객체 안에 저장한다.
    GameCharacter(String name, int hp, int attackPower) {

        this.name = name;            // this.name은 현재 만들어지는 캐릭터의 이름칸이다.
                                     // name은 Main에서 전달받은 임시 값이다.

        this.hp = hp;                 // this.hp는 현재 만들어지는 캐릭터의 체력칸이다.
                                      // hp는 Main에서 전달받은 체력 값이다.

        this.attackPower = attackPower;      // this.attackPower는 현재 만들어지는 캐릭터의 공격력칸이다.
                                             // attackPower는 Main에서 전달받은 공격력 값이다.
    }

        // 기능1 : 현재 캐릭터의 상태를 출력한다.
    void printStatus() {
        System.out.println("이름: " + this.name);
        System.out.println("체력: " + this.hp);
        System.out.println("공격력: " + this.attackPower);
        System.out.println("-----------------------------");
    }

         // 기능2 : 현재 캐릭터가 target 캐릭터를 공격한다.
    void attack(GameCharacter target) {

        System.out.println(this.name + "가" + target.name + "을 공격합니다.");

        target.takeDamage(this.attackPower);
    }

          // 기능3 : 현재 캐릭터가 데미지를 받는다.
    void takeDamage(int damage) {

        this.hp = this.hp - damage;

        System.out.println(this.name + "가" + damage + "의 데미지를 받았습니다.");
    }
}
