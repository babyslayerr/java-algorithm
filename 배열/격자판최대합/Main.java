package 배열.격자판최대합;

import java.util.Scanner;

public class Main {
    // 백준방식은 class 이름이 Main 이여야함
    // 프로그래머스는 solution 메소드를 사용
    public static int solution(int[][] n){

        // 최댓값의 기준일 될 max값이다
        int answer = 0;
        int sum = 0;
        // 각행의 합을 구하여 비교한다
        for(int i =0; i<n.length;i++){
            sum =0;
            for(int j =0; j<n.length;j++){
                sum += n[i][j];
            }
            // 만약 더한값이 answer(max)보다 크다면 교체
            if(sum > answer){
                answer = sum;
            }
        }
        // 각 열의 합을 구하여 비교한다
        for(int i = 0; i<n.length;i++){
            sum = 0;
            for(int j = 0; j<n.length;j++){
                sum += n[j][i];
            }
            if(sum>answer){
                answer = sum;
            }
        }

        // sum 초기화
        sum = 0;
        // 왼쪽방향 대각선 비교
        for(int i = 0; i<n.length;i++){
            sum += n[i][i];
        }
        if(sum>answer){
            answer =sum;
        }

        // 합계 초기화
        sum =0;
        // 오른쪽 방향 대각선 비교
        for(int i = 0; i<n.length;i++){
            sum = n[n.length-i-1][i];
        }
        if(sum>answer){
            answer=sum;
        }


        return answer;
    }


    public static void main(String[] args){
        // 콘솔로 입력 받을 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // N*N 격자판의 n
        int n = scanner.nextInt();

        int[][] arr = new int[n][n];

        // 배열에 입력
        for(int i = 0; i<n;i++){
            for(int j =0; j<n;j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        // 솔루션 메소드 호출 후  출력
        int answer = solution(arr);

        // 결과값 출력
        System.out.println(answer);
    }
}
