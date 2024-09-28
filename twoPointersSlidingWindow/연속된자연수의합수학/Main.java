package twoPointersSlidingWindow.연속된자연수의합수학;

import java.util.Scanner;

// 백준에서 class 는 Main 이여야함
public class Main {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    private static int solution(int n) {

        // 답변 변수와, 연속된 숫자의 개수를 나타내는 변수
        int answer=0,cnt = 1;
        //
        n--;
        // 0보다 클때 까지 반복
        while(n>0){
            // 연속된 숫자 추가
            cnt++;
            // 연속된 최소숫자를 n에서 마이너스
            n = n-cnt;
            if(n%cnt==0)answer++;
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
