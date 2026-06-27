package practice.java_basic.chapter_3.optional;

import java.util.Optional;

public class Camp {

    // 속성
    private Student student;

    // 생성자


    // 기능
    public Optional<Student> getStudent() {         // 내부의 속성을 가져갈 수 있는 getter
        return Optional.ofNullable(student);
//        return student;
    }

    public void setStudent(Student student) {   // 내부의 속성을 설정해줄 수 있는 setter
        this.student = student;
    }
}
