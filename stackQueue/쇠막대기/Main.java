package stackQueue.쇠막대기;

import java.util.Scanner;
import java.util.Stack;

// 백준에서 class 는 Main 이여야함
public class Main {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    private static int solution(String str) {
        // 결과 변수 선언
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i =0; i<str.length();i++){
            // 여는 괄호면 stack에 푸쉬
            if(str.charAt(i) == '(') stack.push('(');
            // 닫는 괄호
            else {
                stack.pop();
                // 만약 이전 비교값이 여는 괄호면 레이저
                if(str.charAt(i-1)=='(') answer+= stack.size();
                // 1개의 막대의 끝이므로 1증가
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
