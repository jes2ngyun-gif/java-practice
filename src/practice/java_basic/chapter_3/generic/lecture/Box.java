package practice.java_basic.chapter_3.generic.lecture;
     // 데이터를 담을 수 있는 Box
public class Box {

    // 속성
    private Integer item;       // 정수형을 담을 수 있는 박스라고 우선 생각하자


    // 생성자
    public Box(Integer item) {
        this.item = item;        // 박스를 인스턴스화 할 때 속성을 초기화 할 수 있게 만들어 주고,
    }

    // 기능
    public Integer getItem() {
        return item;             // 속성을 외부에서 조회할 수 있는 getter를 하나 만들자.
    }
}
