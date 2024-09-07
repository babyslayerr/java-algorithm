package 문자열.문장속단어;

import java.util.Scanner;

public class Main {
    // 백준방식은 class 가 문자열찾기.Main 이여야함
    // 프로그래머스는 solution 메소드를 사용
    public static String solution(String str){

        // 단어길이를 체크할 정수
        int length = 0;
        // 단어의 첫번 째
        String answer = null;

        // 공백 기준으로 배열 나누기
        String[] sArray = str.split(" ");
        for(String s : sArray){
            // 기존 길이보다 길다면
            if(length < s.length()){
                length = s.length();
                answer = s;
            }
        }

        return answer;

    }


    public static void main(String[] args){
        // 콘솔로 입력 받을 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 첫번째로 입력받을 *문장* // keyboard
        String kb = scanner.nextLine();

        // 솔루션 메소드 호출 후 , 문자 출력
        String solution = solution(kb);
        System.out.println(solution);
    }
}
