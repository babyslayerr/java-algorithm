package stackQueue.후위식연산;

import java.util.Scanner;
import java.util.Stack;

// 백준에서 class 는 Main 이여야함
public class Main {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    private static int solution(String str) {
        // 결과 변수 선언
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for(char x : str.toCharArray()){
            // 숫자면 스택에 저장
            if(Character.isDigit(x)){
                stack.push(x-48); // ascii code 기 떄문에 실제숫자는 48을 빼줘야함
            }else{ // 연산자면 앞의 두 숫자를 가져와서 연산
                // 후위 연산자의 우측 숫자
                int rt = stack.pop();
                // 좌측 숫자
                int lt = stack.pop();

                // 사칙연산에 따른 분기점
                if(x=='+') stack.push(lt+rt);
                else if (x=='-') stack.push(lt-rt);
                else if (x=='*') stack.push(lt*rt);
                else if (x=='/') stack.push(lt/rt);
            }
        }
        // 하나남아있는 요소가 답
        answer = stack.get(0);
        return answer;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 연산식
        String str = sc.next();

        System.out.print(solution(str));
    }
}
