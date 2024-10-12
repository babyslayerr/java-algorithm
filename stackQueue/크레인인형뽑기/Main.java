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
            for(int i=0; i< board.length;i++){
                if(board[i][pos-1] != 0){
                    int tmp = board[i][pos-1];
                    board[i][pos-1] = 0;
                    if(!stack.isEmpty() && stack.peek() == tmp){
                        answer+=2;
                        stack.pop();
                    }
                    else stack.push(tmp);
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
