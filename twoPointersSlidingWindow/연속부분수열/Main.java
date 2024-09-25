package twoPointersSlidingWindow.연속부분수열;

import java.util.Scanner;

// 백준에서 class 는 Main 이여야함
public class Main {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    private static int solution(int n, int[] a, int m) {

        // 각각 필요한 변수값 추가
        int answer = 0 , sum=0 , lt =0;

        // rt는 계속 증가
        for(int rt = 0; rt < n ; rt++){
            sum += a[rt];
            // 합계가 m이랑 같으면 카운트
            if(sum==m) answer++;
            // 합계가 m이상이면 왼쪽 lt에서 인덱스 하나씩 감소
            while(sum>=m){
                sum -= a[lt++];
                if(sum==m) answer++;
            }
        }

        return answer;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 첫번째 배열 크기 n
        int n = sc.nextInt();
        int[] a = new int[n];
        // 특정숫자 m
        int m = sc.nextInt();

        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int answer = solution(n,a,m);
        System.out.println(answer);
    }


}
