package practice.java_basic.chapter_3.generic.lecture;
// <T> 타입 매개변수
public class GenericBox<T> {
    // 속성
    private T item; // 데이터타입 자리에 T(타입 매개변수)


    // 생성자
    public GenericBox(T item) {
        this.item = item; // 얘도 데이터타입이 오는 자리에 T(타입 매개변수)로 선언해줌
    }


    // 기능
    public T getItem() {
        return this.item; // T item의 속성을 얻어가는 getter를 만든다.
    }


    // 일반 메서드
    public void printItem(T item) {
        System.out.println(item);
    }


    // 제레닉 메서드
    public <S> void printBoxItem(S item) {
        System.out.println(item);
    }
}
