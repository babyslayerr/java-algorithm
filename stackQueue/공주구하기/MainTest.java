package stackQueue.공주구하기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 백준에서 class 는 Main 이여야함
public class MainTest {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    private static int solution(int n , int k) {
        // 결과 변수 선언
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        // 값 삽입
        for(int i=1; i<=n;i++){
            Q.offer(i);
        }
        // 빌때까지 반복
        while(!Q.isEmpty()){
            // k번째 전까지는 다시 뒤로 push
            for(int i = 1; i<k;i++) Q.offer(Q.poll());
            // k 번째 방출
            Q.poll();
            // 마지막남은 최종값이 답
            if(Q.size()==1) answer=Q.poll();
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
