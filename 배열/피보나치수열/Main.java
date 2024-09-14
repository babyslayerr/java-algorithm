package 배열.피보나치수열;

import java.util.Scanner;

public class Main {
    // 백준방식은 class 이름이 Main 이여야함
    // 프로그래머스는 solution 메소드를 사용
    public static int[] solution(int n){

        // 출력용 배열 생성
        int[] answer = new int[n];

        // 항 첫번째와 두번째는 각각 1, 1이다.
        answer[0] = 1;
        answer[1] = 1;

        // 인덱스 2부터 길이전까지 반복
        for(int i = 2 ; i < answer.length ; i++){
            // 앞 두수를 합침
            answer[i] = answer[i-1] + answer[i-2];
        }

        return answer;
    }


    public static void main(String[] args){
        // 콘솔로 입력 받을 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 피보나치 총 항수 3 <= n <= 45
        int n = scanner.nextInt();

        // 솔루션 메소드 호출 후  출력
        int[] answer = solution(n);

        // 결과값 출력
        for(int i : answer){
            System.out.print(i + " ");
        }

    }
}
