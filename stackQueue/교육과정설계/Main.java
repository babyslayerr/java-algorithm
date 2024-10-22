package stackQueue.교육과정설계;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 백준에서 class 는 Main 이여야함
public class Main {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    private static String solution(String order, String plan) {
        // 결과 변수 선언
        String answer = "YES";
        // Queue 객체 이용
        Queue<Character> queue = new LinkedList<>();
        // 값 삽입
        for(char x : order.toCharArray()){
            queue.offer(x);
        }
        // 계획 플랜을 반복
        for(char x : plan.toCharArray()){
            // 해당 값이 queue 에 있으면
            if(queue.contains(x)){
                // 맨 앞에 문자를 꺼내서 확인한다(순서를 지켰는지 확인한다.)
                if(x!=queue.poll()) return "NO";
            }
        }
        // 비어있지 않으면 해당값이 없다는 뜻
        if(!queue.isEmpty()) return "NO";
        return  answer;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 필수과목의 순서
        String order = sc.next();
        // 수업설계
        String plan = sc.next();

        System.out.println(solution(order,plan));

    }
}
