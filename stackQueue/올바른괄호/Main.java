package stackQueue.올바른괄호;

import java.util.*;

// 백준에서 class 는 Main 이여야함
public class Main {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    private static String solution(String str) {
        // 기본 반환값 YES
        String answer = "YES";

        // Stack 변수 선언
        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()){
            // 여는 괄호면 스택에 push
            if(x=='(') stack.push(x);
            else {
                // 만약 닫는괄호인데 요소가 없다면 잘못된 괄호문자열이므로 NO 출력
                if(stack.isEmpty()) return "NO";
                // 요소가 있으면 제거
                stack.pop();
            }
        }
        // 반복문이 끝났을 때 요소가 남아있으면 잘못된 문자열
        if(!stack.isEmpty()) return "NO";

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 괄호 입력
        String str = sc.next();

        System.out.print(solution(str));
    }
}
