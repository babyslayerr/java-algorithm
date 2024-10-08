package stackQueue.크레인인형뽑기;

import java.util.Scanner;
import java.util.Stack;

// 백준에서 class 는 Main 이여야함
public class Main {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    private static int solution(int[][] board, int[] moves) {
        // 결과 변수 선언
        int answer = 0;

        // 스택 변수 선언
        Stack<Integer> stack = new Stack<>();

        for(int pos : moves){
            for(int i =0 ; i<board.length;i++){
                // moves 값(열값) 중에 하나씩 0이 아닌것을 찾음(최 상단을 찾음)
                // 최상단이면
                if(board[i][pos-1] != 0){
                    // 값 뽑은후 해당 위치 0으로 변환
                    int temp = board[i][pos-1];
                    board[i][pos-1] = 0;
                    // stack의 최상단 값이랑 꺼낸 값이랑 동일하면 펑
                    if(!stack.isEmpty() && stack.peek() == temp){
                        answer += 2;
                        stack.pop();
                    }
                    else stack.push(temp);
                    // 해당 부분 종료(다음 행까지 넘어가면 안됨)
                    break;
                }
            }
        }


        return answer;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 격자 크기 n
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for(int i = 0 ; i<n; i++){
            for(int j = 0; j<n; j++){
                board[i][j] = sc.nextInt();
            }
        }
        // moves 배열의 길이
        int m = sc.nextInt();
        int[] moves = new int[m];
        for(int i = 0; i<m;i++){
             moves[i] = sc.nextInt();
        }

        System.out.print(solution(board,moves));
    }
}
