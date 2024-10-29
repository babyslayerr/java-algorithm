package stackQueue.후위식연산;

import java.util.Scanner;
import java.util.Stack;

// 백준에서 class 는 Main 이여야함
public class MainTest {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    private static int solution(String str) {
        // 결과 변수 선언
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for(char x : str.toCharArray()){
            if(Character.isDigit(x)){
                // ascii 0은 48임
                stack.push(x-48);
            }else{
                // 나중이 우측
                int rt = stack.pop();
                int lt = stack.pop();

                // 결과값 스택에 저장
                if(x=='+') stack.push(lt+rt);
                else if(x=='-') stack.push(lt-rt);
                else if(x=='*') stack.push(lt*rt);
                else if(x=='/') stack.push(lt/rt);
            }
        }
        // 마지막 값 가져옴
        answer= stack.get(0);

        return answer;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 연산식
        String str = sc.next();

        System.out.print(solution(str));
    }
}
