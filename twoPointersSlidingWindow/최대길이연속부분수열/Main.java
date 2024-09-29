package twoPointersSlidingWindow.최대길이연속부분수열;

import java.util.Scanner;

// 백준에서 class 는 Main 이여야함
public class Main {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    private static int solution(int n, int[] a, int k) {
        // 값변수, 0을 1로 바꾼 횟수, 오른쪽 포인터 변수 선언
        int answer = 0,count =0, lt=0;
        for(int rt = 0; rt<n; rt++){
            // 0을 만나면 0을 1로 바꿨다 가정한 횟수를 증가
            if(a[rt]==0) count++;
            // 주어진 k보다 크면 다시 lt를 증가시켜 k만큼 줄임
            while(count>k){
                if(a[lt]==0) count--;
                lt++;
            }
            // max값 비교
            answer = Math.max(answer, rt-lt+1);
        }

        return answer;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 첫번째 배열 크기 n
        int n = sc.nextInt();
        // 최대 k번 0을 1로 바꿀수 있는 횟수
        int k = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int answer = solution(n,a,k);
        System.out.println(answer);
    }


}
