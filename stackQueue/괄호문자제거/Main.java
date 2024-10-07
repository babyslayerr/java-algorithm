package stackQueue.괄호문자제거;

import java.util.Scanner;
import java.util.Stack;

// 백준에서 class 는 Main 이여야함
public class Main {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    private static String solution(String str) {
        // 결과 변수 선언
        String answer = "";

        // 스택 변수 선언
        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()){
            if(x == '(') stack.push(x);
            else if(x == ')') stack.pop();
            // 괄호 Stack 이 비어있으면 답 문자열에 추가
            else if(stack.isEmpty()) answer += x;


        }


        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 괄호포함문자 입력
        String str = sc.next();

        System.out.print(solution(str));
    }
}
