package practice.java_basic.chapter_2.staticmember.game;

public class Main {
    public static void main(String[] args) {


        GameCharacter[] characters = new GameCharacter[3];
              // GameCharacter 객체 3개를 저장할 배열을 생성한다.


        characters[0] = new GameCharacter("가렌", 100);
              // 배열 0번 칸에 가렌 캐릭터 객체를 저장한다.

        characters[1] = new GameCharacter("애쉬", 40);
              // 배열 1번 칸에 애쉬 캐릭터 객체를 저장한다.

        characters[2] = new GameCharacter("럭스", 60);
              // 배열 2번 칸에 럭스 캐릭터 객체를 저장한다.


        for (int i = 0; i < characters.length; i++) {
                  // 배열에 저장된 캐릭터들을 처음부터 끝까지 하나씩 확인한다.

            characters[i].printInfo();      // 현재 인덱스에 있는 캐릭터 객체의 정보를 출력한다.
        }

        GameCharacter.printCharacterCount();
    }
}
