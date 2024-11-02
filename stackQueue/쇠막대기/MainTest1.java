package stackQueue.쇠막대기;

import java.util.Scanner;
import java.util.Stack;

// 백준에서 class 는 Main 이여야함
public class MainTest1 {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    private static int solution(String str) {
        // 결과 변수 선언
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='(') stack.push('(');
            else {
                // 레이저거나 막대의 끝
                stack.pop();
                // 레이저
                if(str.charAt(i-1)=='(') answer += stack.size();
                // 막대의 끝
                else answer++;
            }

        }
        return answer;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 막대기
        String str = sc.next();

        System.out.print(solution(str));
    }
}
