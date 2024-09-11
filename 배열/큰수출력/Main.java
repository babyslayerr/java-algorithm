package 배열.큰수출력;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // 백준방식은 class 이름이 Main 이여야함
    // 프로그래머스는 solution 메소드를 사용
    public static List<Integer> solution(int[] arr){

        // 값 리스트
        List<Integer> answer = new ArrayList();

        // 0번째 인덱스는 비교값 없으므로 입력
        answer.add(arr[0]);

        for(int i = 1 ; i< arr.length; i++){
            // 앞쪽보다 더 큰수면 출력
            if(arr[i] > arr[i-1]) answer.add(arr[i]);
        }

        return answer;
    }


    public static void main(String[] args){
        // 콘솔로 입력 받을 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 문자의 갯수
        int n = scanner.nextInt();
        // 입력받을 int 배열
        int[] arr = new int[n];

        // 남은 숫자 입력 받음
        for(int i = 0;i< arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        // 솔루션 메소드 호출 후  출력
        for(int x : solution(arr)){
            System.out.print(x + " ");
        }

    }
}
