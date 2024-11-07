package stackQueue.교육과정설계;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 백준에서 class 는 Main 이여야함
public class MainTest {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    private static String solution(String order, String plan) {
        // 결과 변수 선언
        String answer = "YES";
        // Queue 객체 이용
        Queue<Character> queue = new LinkedList<>();

        // 순서에 관한 데이터 큐로 삽입
        for(char x : order.toCharArray()) queue.offer(x);

        for(char x : plan.toCharArray()){
            // 요소값이 있으면 순서를 지키는지
            if(queue.contains(x)){
                // 맨 앞의 요소가 아니면 순서를 지키지 않는 것이므로 NO
                if(queue.poll() != x) return "NO";
            }
        }
        // 비어있지 않으면 순서를 지키지 않은 것이므로 "NO"
        if(!queue.isEmpty()) return "NO";
//
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
