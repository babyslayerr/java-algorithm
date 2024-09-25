package twoPointersSlidingWindow.최대매출;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 백준에서 class 는 Main 이여야함
public class Main {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    private static int solution(int n, int[] a, int k) {
        // 값, 합계
        int answer = 0, sum = 0;

        // 첫 윈도우의 합계
        for(int i = 0; i<k; i++){
            sum += a[i];
        }
        answer = sum;

        // 슬라이딩 윈도우 구현
        for(int i = k; i < n; i++){
            // 뒷 인덱스를 더함
            sum += a[i];
            // k번째 뒤에있는 값을 뺌
            sum -= a[i-k];

            if(sum > answer) answer = sum;
        }
        return answer;
    }
    private static int wrongSolution(int n, int[] a, int k) {
        // 값
        int answer = 0;
        for(int i = 0; i < n-k+1; i++){
            int max = 0;
            // 연속된  숫자만큼 더하기
            for(int j = 0; j<k; j++){
                max += a[i+j];
            }
            if(max > answer) answer = max;
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 첫번째 배열 크기 n
        int n = sc.nextInt();
        int[] a = new int[n];
        // 연속된 숫자
        int k = sc.nextInt();

        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }





        int answer = solution(n,a,k);
        System.out.println(answer);
    }


}
