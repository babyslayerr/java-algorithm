package 배열.임시반장정하기;

import java.util.Scanner;

public class Main {

    // 백준방식은 class 이름이 Main 이여야함
    // 프로그래머스는 solution 메소드를 사용
    public static int solution(int[][] n){

        // 학생 번호
        int answer = 0;
        // 최대로 만난 학생
        int max = 0;
        // 학생을 학생끼리 비교(k는 학년)
        for(int i = 1; i<n.length; i++){
            int cnt = 0;
            for(int j = 1; j<n.length;j++){
                for(int k = 1; k<6;k++){
                    // 기준 학생의 반과 비교학생의 반이 같으면
                    if(n[i][k] == n[j][k]){
                        cnt++;
                        // 같은 학생에 대해서 동일한 반이 여러번 되도 1번만 카운트
                        break;
                    }
                }
            }
            if(cnt > max){
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }

    // 리팩토링
    public static void main(String[] args){
        // 콘솔로 입력 받을 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 학생수 n
        int n = scanner.nextInt();
        // 실제 학생 번호 및 학년을 사용하기 때문에 +1, 6
        int[][] arr = new int[n+1][6];

        // 배열에 입력
        for(int i = 1; i<n+1;i++){
            for(int j =1; j<6;j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        // 솔루션 메소드 호출 후  출력
        int answer = solution(arr);

        // 결과값 출력
        System.out.println(answer);
    }
}
