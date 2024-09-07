package 문자열.대소문자변환;

import java.util.Scanner;

public class Main {
    // 백준방식은 class 가 문자열찾기.Main 이여야함
    // 프로그래머스는 solution 메소드를 사용
    public static String solution(String str){

        // 새로운 리턴 객체 생성을 위한 String Builder 생성
        StringBuilder sb = new StringBuilder();


        for(int i = 0; i < str.length() ; i++){
            // ascii 코드 표 기준 41~90 까지 영어 대문자 97부터 영어 소문자
            // 영어 소문자면 대문자로 교환
            if(str.charAt(i) >= 97){
                sb.append(String.valueOf(str.charAt(i)).toUpperCase());
            } else{
                // 대문자면 소문자로 교환
                sb.append(String.valueOf(str.charAt(i)).toLowerCase());
            }
        }

        return sb.toString();

    }


    public static void main(String[] args){
        // 콘솔로 입력 받을 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 첫번째로 입력받을 문자열(단어)
        String string = scanner.next();

        // 솔루션 메소드 호출 후 , 문자 출력
        String solution = solution(string);
        System.out.println(solution);
    }
}
