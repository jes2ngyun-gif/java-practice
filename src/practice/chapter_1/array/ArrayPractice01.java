package practice.chapter_1.array;
// 학생 이름 전체 출력하기
//문제 : 학생 이름이 들어있는 배열에서 모든 학생 이름을 출력한다.
// 코딩 조건: String[] student 배열을 만든다, 향상된 for문을 사용한다, 학생 이름을 한 줄씩 출력한다.
public class ArrayPractice01 {
    public static void main(String[] args) {


        String[] students = {"철수", "영희", "민수", "지영"};
        // 학생 이름 여러 개를 하나의 그룹으로 관리하기 위해 문자열 배열을 만든다.
        // 배열은 같은 주제의 데이터를 묶어서 관리할 때 사용한다.



        for (String student : students) {
            // 향상된 for문
            // student 배열 안에 있는 값을 앞에서부터 하나씩 꺼내서
            // student 변수에 임시로 저장한다.
            // student 배열에서 String 값을 하나씩 꺼내서 Student에 담아라.


            System.out.println(student);
            // 현재 꺼내온 학생 이름을 출력한다.
            // 반복이 돌 때마다 student에는 다른 이름이 들어온다.
        }
    }
}

// 실제 활용: 회원 목록, 상품 목록, 게시글 목록처럼 전체 데이터를 하나씩 보여줄 때 사용한다.
// 값 변화는 1회차 → 철수, 2회차 → 영희, 3회차 → 민수, 4회차 → 지영 이렇게 된다.