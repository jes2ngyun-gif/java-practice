package practice.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        // for문  명령형 스타일 : 각 요소 * 10 처리
        List<Integer> ret1 = new ArrayList<>();
        for (Integer num : arrayList) {
            Integer multipliedNum = num * 10;
            ret1.add(multipliedNum);
        }
        System.out.println("ret1 = " + ret1);

        // stream 선언형 스타일 : 각 요소 * 10 처리
        List<Integer> ret2 = arrayList.stream()   // 데이터 준비 단계 : stream은 흐름을 만들어주는 메서드
                .map(num -> num * 10)      // 중간 연산 등록 단계
                .collect(Collectors.toList());    // 최종 연산 단계 : 리스트로 결과를 반환받겠다.
        System.out.println("ret2 = " + ret2);

        // 1. 익명 클래스를 직접 만들어서 변수에 담아 매개변수로 전달.
        Function<Integer, Integer> function = new Function<>() {

            @Override
            public Integer apply(Integer integer) {
                return integer * 10;
            }
        };
        List<Integer> ret3 = arrayList.stream()      // 1. 데이터 흐름 준비
                .map(function)                       // 2. 중간 연산 등록
                .collect(Collectors.toList());       // 3. 최종 연산
        System.out.println("ret3 = " + ret3);


        // 2. 람다식을 만들어서 변수에 담아 매개변수로 전달
        Function<Integer, Integer> functionLambda = (num -> num * 10);
        List<Integer> ret4 = arrayList.stream()
                .map(functionLambda)
                .collect(Collectors.toList());
        System.out.println("ret4 = " + ret4);


        // 3. 람다식을 직접 매개변수로 전달
        List<Integer> ret5 = arrayList.stream()
                .map(num -> num * 10)
                . collect(Collectors.toList());
        System.out.println("ret5 = " + ret5);


        // 4. 중간 연산을 함께 사용하는 방법(filter() , map())
        // 요구사항: 리스트에서 짝수를 찾아서 * 10
        // 이럴러면 우선 짝수를 찾고, 곱하기 10을 해줘야 함.

        List<Integer> ret6 = arrayList.stream() // 1. 데이터 흐름 준비 (1, 2, 3, 4, 5)
                .filter(num -> num % 2 == 0)       // 2. 중간 연산 등록 ( 짝수 찾기)
                .map(num -> num * 10)               // 3. 중간 연산 등록 ( * 10)
                .collect(Collectors.toList());
        System.out.println("ret6 = " + ret6);


    }
}
