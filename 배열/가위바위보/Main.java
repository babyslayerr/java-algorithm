package 배열.가위바위보;

import java.util.Scanner;

public class Main {
    // 백준방식은 class 이름이 Main 이여야함
    // 프로그래머스는 solution 메소드를 사용
    public static char[] solution(int[] aArr, int[] bArr){

        // 출력용 배열 선언
        char[] answer = new char[aArr.length];
        // 1 : 가위, 2 : 바위, 3 : 보

        for(int i = 0; i<answer.length;i++){
            // 가위바위보를 실행한다음 결과값을 받아온다
            answer[i] = excuteRSP(aArr[i], bArr[i]);
        }

        return answer;
    }

    private static char excuteRSP(int a, int b) {

        // 1 : 가위 , 2 : 바위, 3 : 보

        // 만약 a가 가위일 때 이기고 짐을 정함
        if(a==1 && b == 3){
            return 'A';
        } else if (a==1 && b == 2) {
            return 'B';
        }
        // a가 바위일 때
        if(a==2 && b == 1){
            return 'A';
        } else if (a==2 && b == 3) {
            return 'B';
        }

        // a가 보일 때
        if(a==3 && b == 2){
            return 'A';
        } else if (a==3 && b == 1) {
            return 'B';
        }

        // 만약 비길경우 D 출력
        return 'D';
    }


    public static void main(String[] args){
        // 콘솔로 입력 받을 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 게임의 갯수
        int n = scanner.nextInt();
        // 입력받을 int 배열
        int[] aArr = new int[n];
        int[] bArr = new int[n];

        // a 입력
        for(int i = 0;i< aArr.length; i++){
            aArr[i] = scanner.nextInt();
        }
        // b 입력
        for(int i = 0;i< bArr.length; i++){
            bArr[i] = scanner.nextInt();
        }

        // 솔루션 메소드 호출 후  출력
        char[] answer = solution(aArr,bArr);

        for(char c : answer){
            System.out.println(c);
        }


    }
}
