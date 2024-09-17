package 배열.점수계산;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // 백준방식은 class 이름이 Main 이여야함
    // 프로그래머스는 solution 메소드를 사용

    public static int solution(int[] n){

        int answer = 0;
        int accel = 0;
        // 갯수만큼 반복
        for(int i = 0; i<n.length;i++){
            if(n[i] == 0){
                //가산값 초기화
                accel = 0;
            } else{
                // 1이면 가산값을 1 증가시킴
                accel++;
                // 증감후 값에 반영
                answer += accel;
            }

        }

        return answer;
    }


    public static void main(String[] args){
        // 콘솔로 입력 받을 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 문제 개수 n
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // 배열에 입력
        for(int i = 0; i<n;i++){
            arr[i] = scanner.nextInt();
        }

        // 솔루션 메소드 호출 후  출력
        int answer = solution(arr);

        // 결과값 출력
        System.out.println(answer);
    }
}
