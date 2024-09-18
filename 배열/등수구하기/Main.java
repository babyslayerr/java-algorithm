package 배열.등수구하기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // 백준방식은 class 이름이 Main 이여야함
    // 프로그래머스는 solution 메소드를 사용
    public static int[] solution(int[] n){

        // 출력용 배열
        int[] answer = new int[n.length];

        // 2중 배열을 돌면서 값 비교
        for(int i = 0; i<n.length;i++){
            // 자기보다 큰 값 개수 = 순위
            int cnt = 1;
            for(int j = 0; j<n.length;j++){
                // 비교값이 더 클 경우( 등호를 사용하지 않으면서 순위 중복을 허용한다)
                if(n[j] > n[i]){
                    cnt++;
                }
            }
            // 등수 기입
            answer[i] = cnt;
        }


        return answer;
    }


    public static void main(String[] args){
        // 콘솔로 입력 받을 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 학생수 n
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // 배열에 입력
        for(int i = 0; i<n;i++){
            arr[i] = scanner.nextInt();
        }

        // 솔루션 메소드 호출 후  출력
        int[] answer = solution(arr);

        // 결과값 출력
        for(int x : answer){
            System.out.print(x + " ");
        }
    }
}
