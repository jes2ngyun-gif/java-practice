package practice.staticmember.game;

public class GameCharacter {

    String name;                       // 캐릭터마다 이름이 다르므로 인스턴스 변수로 선언한다.

    int hp;                            //캐릭터마다 체력이 다르므로 인스턴스 변수로 선언한다.

    static int characterCount = 0;     // 전체 캐릭터 수는 모든 캐릭터 객체가 공유해야 하므로 static 변수로 선언한다.



    public GameCharacter(String name, int hp) {  // 캐릭터 객체가 생성될 때 이름과 체력을 저장하는 생성자

        this.name = name;                        // 매개변수 name값을 현재 객체의 name 필드에 저장한다.

        this.hp = hp;                            // 매개변수 hp 값을 현재 객체의 hp 필드에 저장한다.

        characterCount++;                        // 캐릭터 객체가 생성될 때마다 전체 캐릭터 수를 1 증가시킨다.
    }



    public void printInfo() {                    // 캐릭터 한 명의 정보를 출력하는 인스턴스 메서드

        System.out.println("이름 : " + name);     // 현재 객체의 이름을 출력한다.

        System.out.println("체력 : " + hp);       // 현재 객체의 체력을 출력한다.

        if (hp < 50) {                           // 체력이 50 이하라면 위험 상태로 판단한다.

            System.out.println("위험 상태");
        }

        System.out.println();     //********캐릭터 정보 사이를 보기 좋게 구분하기 위해 빈 줄 출력한 것*********
    }

    public static void printCharacterCount() {          // static 변수 characterCount 값을 출력한다.

        System.out.println("전체 캐릭터 수 : " + characterCount);
    }
}

