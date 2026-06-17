package practice.optional;

public class Student {

    // 속성
    private String name;

    // 생성자
    public Student(String name) {
         this.name = name;
}

    // 기능
    public String getName() {       // 이름을 가져갈 수 있는 getter
        return name;
    }
}
