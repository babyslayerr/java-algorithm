package 배열.소수에라토스테네스체;

import java.util.Scanner;

public class Main {
    // 백준방식은 class 이름이 Main 이여야함
    // 프로그래머스는 solution 메소드를 사용
    public static int solution(int n){

        // 출력용 변수 생성
        int answer = 0;
        // 체크할 배열 생성(index 번호가 n까지 생겨야 하기 때문에 때문에 크기는 n+1)
        int[] arr = new int[n+1];

        //2~n까지 반복
        for(int i = 2; i <=n ; i++){
            // 해당 인덱스의값이 0이면 해당 인덱스에 배수들 다 1(false)로 초기화
            if(arr[i]==0){
                answer++;
                for(int j = i; j<=n; j=j+i) arr[j] = 1; // i의 배수는 다 1로 초기화
            }
        }
        return answer;
    }
    // 시간초과
    public static int solution2(int n){

        // 출력용 변수 생성
        // 2는 그냥 포함
        int answer = 1;

        // 2~n까지 반복
        for(int i = 3; i <= n; i++){
            boolean isPrime = true;
            // i = 2
            // 2부터 주어진소수-1까지
            for(int j = 2; j < i; j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                answer++;
            }
        }


        return answer;
    }

    public static void main(String[] args){
        // 콘솔로 입력 받을 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 1~n까지 소수 개수를 구하기위한 n
        int n = scanner.nextInt();

        // 솔루션 메소드 호출 후  출력
        int i = solution(n);

        // 결과값 출력
        System.out.println(i);

    }
}
