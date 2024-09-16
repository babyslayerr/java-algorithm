package 배열.뒤집은소수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // 백준방식은 class 이름이 Main 이여야함
    // 프로그래머스는 solution 메소드를 사용
    public static List<Integer> solution2(int[] n){

        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i<n.length;i++){
            Integer reverseInt = Integer.valueOf(new StringBuilder(String.valueOf(n[i])).reverse().toString());
            if(isPrime(reverseInt)){
                answer.add(reverseInt);
            }
        }
        return answer;
    }


    // 리팩토링
    public static List<Integer> solution(int[] n){

        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i<n.length;i++){
            int temp = n[i];
            int reverseInt = 0;
            while (temp>0){
                // 끝 자릿수 가져오기
                int t = temp % 10;
                // 자릿수 가져오면서 이전 자릿수 자리변경
                reverseInt = reverseInt * 10 + t;
                // 넣은 자릿수에 대하여 삭제
                temp = temp/10;
            }
            if(isPrime(reverseInt)){
                answer.add(reverseInt);
            }
        }
        return answer;
    }

    private static boolean isPrime(int n) {

        boolean isPrime = true;

        // 1의 경우에는 false return
        if(n==1){
            return false;
        }

        for(int i = 2; i < n;i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args){
        // 콘솔로 입력 받을 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 소수 개수를 구하기위한 n
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // 배열에 입력
        for(int i = 0; i<n;i++){
            arr[i] = scanner.nextInt();
        }

        // 솔루션 메소드 호출 후  출력
        List<Integer> answer = solution(arr);

        // 결과값 출력
        for(int x : answer){
            System.out.print(x + " ");
        }
    }
}
