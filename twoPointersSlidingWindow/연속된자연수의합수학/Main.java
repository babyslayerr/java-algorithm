package twoPointersSlidingWindow.연속된자연수의합;

import java.util.Scanner;

// 백준에서 class 는 Main 이여야함
public class Main {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    private static int solution(int n) {

        // 배열 초기화
        int[] arr = new int[n];
        // 2개 이상의 연속된 수로 나와야 하기 때문에 n값은 제외 또한 배열의 크기는 n/2+1
        for(int i = 0; i<(n/2)+1; i++){
            arr[i] = i+1;
        }

        // 답 변수
        int answer = 0, sum = 0, lt = 0;

        for(int rt = 0; rt < arr.length; rt++){
            // 합계 함수 초기화
            sum += arr[rt];
            if(sum == n) {
                answer++;
            } else{ // 합이 클경우 앞인덱스에서부터 뺀다
                while(sum > n){
                    sum -= arr[lt++];
                    if(sum == n){
                        answer++;
                    }
                }
            }
        }



        return answer;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 첫번째 배열 크기 n
        int n = sc.nextInt();

        int answer = solution(n);
        System.out.println(answer);
    }


}
