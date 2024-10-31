package stackQueue.쇠막대기;

import java.util.Scanner;
import java.util.Stack;

// 백준에서 class 는 Main 이여야함
public class MainTest {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    private static int solution(String str) {
        // 결과 변수 선언
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i =0; i<str.length();i++){
            // 레이저는 '()' 로 표현됨
            if(str.charAt(i)=='(') stack.push('(');

            else {
                // 막대의 끝 or 레이저
                stack.pop();
                // 이전값이 여는 괄호면 레이저
                if(str.charAt(i-1)=='(') answer += stack.size();
                // 막대의 끝이므로 1증가
                else answer++;
            }

        }
        // 다시
        //
        return answer;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 막대기
        String str = sc.next();

        System.out.print(solution(str));
    }
}
