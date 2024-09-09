package 문자열.가장짧은문자거리;

import java.util.Scanner;

public class Main {
    // 백준방식은 class 이름이 Main 이여야함
    // 프로그래머스는 solution 메소드를 사용
    public static int[] solution(String str, char t){

        // 예시 입력 teachermode e // 예시 출력 1 0 1 2 1 0 1 2 2 1 0

        // 값을 반환할 int 배열 생성
        int[] answer = new int[str.length()];
        // 왼쪽 index 부터 반복문 실행
        // index 기준으로 왼쪽으로부터 t 랑 떨어진 거리를 p라고 한다
        int p = 1000; // 처음 초깃값은 입력값 보다 큰수 -> 후에 오른쪽 부터 배열을 돌 떄 변경
        for(int i = 0; i<answer.length; i++){
            // e를 찾는경우
            if (str.charAt(i) == t){
                // p를 0으로 초기화
                p = 0;
                // 해당 위치에 e와의 거리 p 삽입
                answer[i] = p;
            } else{
                // 같은 값이 아니면 거리가 1 늘어난것이므로 증가
                p++;
                // 해당 위치에 e와의 거리 p 삽입
                answer[i] = p;
            }
        }
        // 여기까지 실행하고 출력시 1001 0 1 2 3 0 1 2 3 4 0
        // 오른쪽에서 부터 순회 -> 오른쪽에 있는 e 로부터의 거리 p를 계산 p의 초깃값은 입력문자열 보다 큰 수로
        p = 1000;
        for(int i = str.length()-1; i >= 0; i--){
            // target 이랑 같으면
            if(str.charAt(i) == t){
                // p 를 0 으로 초기화
                // 0은 배열에서 나올 수 있는 가장 작은값
                p = 0;
            }
            else{
                // 거리를 1 증가 시킴
                p++;
                // 역시 마찬가지로 더 작은 값 삽입
                answer[i] = Math.min(answer[i],p);
            }
        }


        return answer;
    }


    public static void main(String[] args){
        // 콘솔로 입력 받을 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 첫번째로 입력받을 단어 // keyboard
        String kb = scanner.next();
        // 두번쨰로 입력받을 target 값
        String target = scanner.next();

        // 솔루션 메소드 호출 후 , int배열 출력
        int[] solution = solution(kb,target.charAt(0));

        // 배열을 돌아가며 출력
        for(int ch : solution){
            System.out.print(ch + " ");
        }
    }
}
