package stackQueue.공주구하기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

// 백준에서 class 는 Main 이여야함
public class Main {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    private static int solution(int n , int k) {
        // 결과 변수 선언
        int answer = 0;
        // Queue 객체 이용
        Queue<Integer> queue = new LinkedList<>();
        // 값 삽입
        for(int i = 1;i<=n;i++){
            queue.offer(i);
        }
        // 값이 빌때 까지 반복
        while(!queue.isEmpty()){
            // 1번부터 시작
            // k-1번째 까지 다시 queue 로부터 꺼내서 뒤로 보낸다
            for(int i=1; i<k;i++)queue.offer(queue.poll());
            // k번째 왕자 제외
            queue.poll();
            // 만약 size 가 1이면 마지막이므로 값 삽입
            // size 가 0이 되면서 반복문 탈출
            if(queue.size()==1) answer=queue.poll();
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
