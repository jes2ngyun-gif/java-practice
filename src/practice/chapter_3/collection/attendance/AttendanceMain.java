package practice.chapter_3.collection.attendance;

import java.util.ArrayList;
import java.util.HashSet;

public class AttendanceMain {
    public static void main(String[] args) {

        ArrayList<String> studentList = new ArrayList<>();
            // 학생 이름들을 저장할 리스트 생성
            // List는 순서를 유지하고 중복을 허용한다.

        // 학생들을 출석부에 추가
        studentList.add("이즈리얼");
        studentList.add("카이사");
        studentList.add("시비르");

        // 일부러 중복 학생들 추가
        studentList.add("카이사");
        studentList.add("시비르");

        System.out.println(" ========== ArrayList ==========");


             // 향상된 for문으로 학생 전체 출력
        for (String student : studentList) {
            System.out.println(student);
        }

             // HashSet 생성, Set은 중복을 허용하지 않는다.
        HashSet<String> studentSet = new HashSet<>();

        studentSet.addAll(studentList);      // ★★★ ArrayList의 데이터를 HashSet으로 옮긴다. ★★★
                                             // 같은 이름은 자동으로 제거된다.

        System.out.println("\n===== HashSet =====");

        for (String student : studentList) {       // 중복이 제거된 학생들을 출력
            System.out.println(student);
        }

        studentSet.remove("이즈리얼");            // 특정 학생 삭제
        System.out.println("\n====== 이즈 삭제 후 =====");

        for (String student : studentSet) {         // 삭제 후 다시 출력
            System.out.println(student);
        }

    }
}
