package practice.java_basic.chapter_3.collection.score;

import java.util.HashMap;
import java.util.Map;

public class ScoreMain {
    public static void main(String[] args) {

        HashMap<String, Integer> scoreMap = new HashMap<>();
              // 학생 이름과 점수를 저장할 HashMap 생성
              // key : 학생 이름(String), value : 점수(Integer)

        // 학생 등록
        scoreMap.put("김민수", 95);
        scoreMap.put("박철수", 80);
        scoreMap.put("이영희", 100);

        // 특정 학생 점수 조회
        System.out.println("김민수의 점수 : " + scoreMap.get("김민수"));


        // 특정 학생이 존재하는지 확인
        if (scoreMap.containsKey("박철수")) {
            System.out.println("박철수 학생이 존재합니다.");
        }

        // 학생 삭제
        scoreMap.remove("박철수");
        System.out.println("\n====== 전체 학생 목록 ======");


        // Map.Entry를 이용해 key와 value를 하나씩 꺼낸다.
        for (Map.Entry<String, Integer> entry : scoreMap.entrySet()) {

            String name = entry.getKey();         // 학생 이름 출력

            Integer score = entry.getValue();     // 학생 점수 출력

            System.out.println(name + " : " + score);
        }
    }
}
