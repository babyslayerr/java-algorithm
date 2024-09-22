package 배열.멘토링;

import java.util.Scanner;

public class Main {

    // 백준방식은 class 이름이 Main 이여야함
    // 프로그래머스는 solution 메소드를 사용
    public static int solution(int[][] arr, int n, int m){

        // 총 경우의 수
        int answer = 0;

        // 학생 수로 나올 수 있는 총 경우의 수(번호로 측정) n*n
        for(int i = 1 ; i<=n ;i++){
            for(int j =1; j<=n ;j++){
                int count = 0;
                for(int k=0; k<m ; k++){
                    // 학생 경우의 수를 돌면서 학생번호에 해당하는 실제 인덱스
                    int pi = 0;
                    int pj = 0;
                    for(int s=0; s<n ; s++){
                        if(arr[k][s] == i){
                            // 멘토여야할 인덱스
                            pi = s;
                        } else if(arr[k][s] == j){
                            // 멘티여야할 인덱스
                            pj = s;
                        }
                    }
                    // 멘토가 멘티보다 앞 인덱스여야함
                    if(pi<pj){
                        count++;
                    }
                }
                // 모든경우의 수에 대해 만족하면
                if(count == m){
                    answer++;
                }
            }
        }



        return answer;
    }

    public static void main(String[] args){
        // 콘솔로 입력 받을 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 학생수 n
        int n = scanner.nextInt();
        // 테스트 수 m
        int m = scanner.nextInt();
        int[][] arr = new int[m][n];

        // 배열에 입력
        for(int i = 0; i<m;i++){
            for(int j =0; j<n;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        // 솔루션 메소드 호출 후  출력
        int answer = solution(arr,n,m);

        // 결과값 출력
        System.out.println(answer);
    }
}
