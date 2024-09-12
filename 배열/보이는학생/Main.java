package 배열.보이는학생;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // 백준방식은 class 이름이 Main 이여야함
    // 프로그래머스는 solution 메소드를 사용
    public static int solution(int[] arr){

        // 입력
        // 8
        // 130 135 148 140 145 150 150 153
        // 출력 5

        // 키큰 학생의 기준이 될 변수 선언(이보다 작은 값의 뒷 인덱스들은 볼 수 없음) - 0번째 인덱스 사용
        int max = arr[0];
        // 보이는 학생 수 -첫 학생은 무조건 보이기 때문
        int answer = 1;

        // 1 ~ 문자길이까지 반복
        for(int i = 1 ; i< arr.length; i++){
            // max보다 뒷값이 더크면 카운트 및 max값 교체
            if(arr[i] > max){
                max = arr[i];
                answer++;
            }
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
        int answer = solution(arr);
        System.out.print(answer);

    }
}
