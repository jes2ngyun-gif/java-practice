package practice.chapter_3.collection.lecture;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // 배열의 한계(정적인 특징)
        // 배열은 선언과 동시에 길이를 설정해줘야 한다.
        // numbers라는 길이가 3으로 선언되면서 고정되었기 때문에 3개 이상의 데이터는 넣어줄 수 없음.
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
//        numbers[3] = 40; 배열의 정적인 특징의 한계

        // 컬렉션
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        // ArrayList 활용
        ArrayList<String> names = new ArrayList<>();
             // new ArrayList는 객체이고 클래스이다. ArrayList 클래스의 생성자를 호출해서 인스턴스화 시킨 것을 names라는 변수에 넣어준다.
             // ArrayList는 문자열을 다룬다.

        // 데이터 추가
        names.add("Spartan");
        names.add("Steve");
        names.add("jyun");
        names.add("1");
        names.add("2");
        // 순서 보장
        System.out.println("names = " + names);

        // 중복 데이터 허용
        names.add("Spartan");
        System.out.println("names = " + names);

        // 데이터 단건 조회
        String name1 = names.get(0);     // get 괄호 안에 들어가는 숫자는 인덱스
        System.out.println("name1 = " + name1);

        // 데이터 삭제
        names.remove("Steve");
        System.out.println("names = " + names);

        // HashSet 사용 방법
        HashSet<String> uniqueNames = new HashSet<>();   // HashSet도 클래스. 생성자 호출해서 인스턴스화 시켜준 것을
                                                         // uniqueNames 변수에 넣고 활용한다.

        // 데이터 추가
        uniqueNames.add("Spartan");
        uniqueNames.add("Steve");
        uniqueNames.add("Jyun");
        uniqueNames.add("1");
        uniqueNames.add("4");
        // 순서를 보장 안함
        System.out.println("uniqueNames = " + uniqueNames);

        // so get() 활용 불가
        // 중복 데이터 불가. 중복 데이터는 자동으로 들어가지 않는다.
        uniqueNames.add("Spartan");
        System.out.println("uniqueNames = " + uniqueNames);
        // 데이터 제거
        uniqueNames.remove("Spartan");
        System.out.println("uniqueNames = " + uniqueNames);

        // HashMap 활용
        //<키(" "), 값(정수)> 으로 저장됌. 여기서는 키가 문자열이고 값이 정수로 약속되있는 것.
        // 꺽쇠에 들어가는타입들은 원하는 대로 정할 수 있음.
        HashMap<String, Integer> memberMap = new HashMap<>();

        // 데이터 추가: 값 중복 됌!
        memberMap.put("Spartan", 15);  // 스파르탄의 15라는 숫자를 맵핑 시켜서 값으로 저장함.
        memberMap.put("Jyun", 15);
        memberMap.put("Isac", 1);
        memberMap.put("mipo", 2);
        memberMap.put("Yumi", 3);
        // 순서 보장 xx
        System.out.println("memberMap = " + memberMap);

        // 키 중복 불가: 값이 덮어씌어짐
        memberMap.put("Yumi", 5);
        System.out.println("memberMap = " + memberMap);

        // 단건 조회
        Integer spartanNum = memberMap.get("Spartan");
        System.out.println("spartanNum = " + spartanNum);
        
        // 삭제
        memberMap.remove("Spartan");
        System.out.println("memberMap = " + memberMap);

        // 키 확인
        Set<String> keySet = memberMap.keySet();
        System.out.println("keySet = " + keySet);
        // 값 확인
        Collection<Integer> values = memberMap.values();
        System.out.println("values = " + values);





    }
}
