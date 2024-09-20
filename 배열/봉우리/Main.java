package 배열.봉우리;

import java.util.Scanner;

public class Main {

    // 상하좌우 값을 만들기 위한 배열
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    // 백준방식은 class 이름이 Main 이여야함
    // 프로그래머스는 solution 메소드를 사용
    public static int solution1(int[][] n){

        // 봉우리 갯수
        int answer = 0;
        // 가장자리는 봉우리가 없기 때문
        for(int i = 1; i < n.length-1;i++){
            for(int j = 1; j < n.length-1; j++){
                // 상하좌우보다 커야함
                if(n[i][j] > n[i-1][j] && n[i][j] > n[i][j-1] && n[i][j] > n[i][j+1] && n[i][j] > n[i+1][j]){
                    answer++;
                }
            }
        }

        return answer;
    }


    public static void main1(String[] args){
        // 콘솔로 입력 받을 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // N*N 격자판의 n
        int n = scanner.nextInt();
        // 격자의 가장자리는 0으로 초기화
        int[][] arr = new int[n+2][n+2];

        // 배열에 입력
        for(int i = 1; i<n+1;i++){
            for(int j =1; j<n+1;j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        // 솔루션 메소드 호출 후  출력
        int answer = solution(arr);

        // 결과값 출력
        System.out.println(answer);
    }

    public static int solution(int[][] n){

        // 봉우리 갯수
        int answer = 0;
        // 가장자리는 봉우리가 없기 때문
        for(int i = 0; i < n.length;i++){
            for(int j = 0; j < n.length; j++){
                boolean flag = true;
                for(int k = 0; k < 4; k++ ){
                    // 봉우리 주변 인덱스
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    // 주변중에 하나라도 봉우리보다 큰값이 있으면 봉우리가 아님
                    // index out of error를 위한 처리
                    if(nx >= 0 && nx<n.length && ny >=0 && ny < n.length && n[nx][ny] > n[i][j])flag = false;
                }
                // 봉우리면 카운팅
                if(flag) answer++;
            }
        }

        return answer;
    }

    // 리팩토링
    public static void main(String[] args){
        // 콘솔로 입력 받을 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // N*N 격자판의 n
        int n = scanner.nextInt();
        // 격자의 가장자리는 0으로 초기화
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
