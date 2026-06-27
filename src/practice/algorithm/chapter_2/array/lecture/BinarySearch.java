package practice.algorithm.chapter_2.array.lecture;
//이진 탐색
public class BinarySearch {

    static int cnt = 0;

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};           // 정렬된 배열이어야 함
        int target = 8;
        cnt = 0;


        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("찾은 위치 : " + result);
            System.out.println("비교 횟수 : " + cnt);

        } else {
            System.out.println("값을 찾지 못했습니다.");
        }
    }

    private static int binarySearch(int[] arr, int target) {          // : binarySearch 메서드 선언부
     // 배열 하나랑 찾을 값 하나 주면, 이진 탐색해서 위치 찾아줄게             // 정수 배열 arr와 찾을 값 target을 받아서, 이진 탐색을 수행한 뒤,
     // 배열에서 원하는 값을 찾아 인덱스를 돌려주는 이진 탐색 기능을 만들겠다.   // 찾은 위치를 int로 돌려주는 기능 하나 만들겠다.

        // 1. 탐색 범위의 시작점과 끝점을 설정
        // 1-1. left는 배열의 첫번째 인덱스로 설정
        // 1-2. right는 배열의 마지막 인덱스로 설정
        int left = 0;
        int right = arr.length - 1;                                                   // arr.length: 배열의 크기, 배열의 크기 - 1 = 마지막 인덱스


        // 2. 탐색 범위가 유효한 동안 반복
        while (left <= right) {
            // 2-1. 중간 위치 계산
            int mid = (left + right) / 2;
            cnt++;

            // 3. 중간 값과 target 값 비교후 처리
            // 3-1. 중간 값이 target과 같으면 해당 인덱스 mid 반환
            if (arr[mid] == target) {
                return mid;

            // 3-2. 중간 값이 target보다 크면 오른쪽 범위를 줄임
            } else if  (arr[mid] > target) {
                right = mid - 1;

            // 3-3. 중간 값이 target보다 작으면 왼쪽 범위를 줄임
            } else {
                left = mid + 1;
            }
        }
        // 4. 탐색 완료 후 결과 처리
        // 4-1. 찾지 못한 경우 -1(실패) 반환
        return -1;
    }
}
