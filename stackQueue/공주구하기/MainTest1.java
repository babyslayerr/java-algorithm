package stackQueue.공주구하기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 백준에서 class 는 Main 이여야함
public class MainTest1 {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    private static int solution(int n , int k) {
        // 결과 변수 선언
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        // 값 초기화
        for(int i =1; i<=n ; i++){
            Q.offer(i);
        }
        while(!Q.isEmpty()){
            for(int i = 1; i<=k-1;i++){
                Q.offer(Q.poll());
            }
            // 마지막 값 들어감
            answer=Q.poll();
        }

        return  answer;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // n명의 왕자
        int n = sc.nextInt();
        // k번째 왕자는 제외
        int k = sc.nextInt();

        System.out.println(solution(n,k));

    }
}
