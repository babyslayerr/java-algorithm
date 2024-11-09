package stackQueue.교육과정설계;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 백준에서 class 는 Main 이여야함
public class MainTest1 {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    private static String solution(String order, String plan) {
        // 결과 변수 선언
        String answer = "YES";
        // Queue 객체 이용
        Queue<Character> queue = new LinkedList<>();

        // 값 기입
        for(char x : order.toCharArray()){
            queue.offer(x);
        }

        for(char x : plan.toCharArray()) {
            // 만약 해당글자가 내부에 있고 순서에 의해 plan 값이 맨 앞과 같아야한다
            if (queue.contains(x) && queue.poll() != x) return "NO";
        }
        // 큐 내부가 비어있지 않으면 순서를 지키지 않은 것
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
        //

    }
}
