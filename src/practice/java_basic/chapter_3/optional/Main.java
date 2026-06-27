package practice.java_basic.chapter_3.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Camp camp = new Camp();                              // Camp를 인스턴스화 시켜주고(Camp 객체를 생성)
//        Student malphite = new Student("Malphite");
//        camp.setStudent(malphite);

        // Optional 객체 활용
        Optional<Student> studentOptional = camp.getStudent();
        boolean flag = studentOptional.isPresent();

        if (flag) {
            Student student = studentOptional.get();
            String studentName = student.getName();
            System.out.println("studentName = " + studentName);
        } else {
            System.out.println("학생 데이터가 없습니다.");
        }

        // 1. student = null
//        Student student = camp.getStudent();                 // camp의 getter를 통해서 Student를 가지고 온 다음에(Camp 객체 안에 있는 Student 객체를 꺼내온다.)
//        System.out.println("student = " + student);
//
//        // 직접적인 null 처리 방법
//        String studentName;
//        if (student != null) {
//            studentName = student.getName();
//        } else {
//            studentName = "등록된 학생이 아닙니다.";
//        }
//        System.out.println("studentName = " + studentName);
        

        // 2. NullPointException
//        String studentName = student.getName();              // Student 객체의 getName()을 호출하여 학생 이름을 가져온다.
//        System.out.println("studentName = " + studentName);  // 가져온 학생 이름을 출력한다..
    }
}
