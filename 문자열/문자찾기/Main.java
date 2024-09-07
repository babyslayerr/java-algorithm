package 문자열.문자찾기;

import java.util.Scanner;

public class Main {
    // 백준방식은 class 가 문자열찾기.Main 이여야함
    // 프로그래머스는 solution 메소드를 사용
    public static int solution(String str, char t){

        int number = 0;

        // 대소문자 구분 안함
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for(int i = 0; i < str.length() ; i++){

            // 문자열에 문자형이 포함되면
            if(str.charAt(i) == t){
                // 개수에 추가
                number++;
            }
        }
        return number;

    }


    public static void main(String[] args){
        // 콘솔로 입력 받을 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 첫번째로 입력받을 문자열
        String string = scanner.next();
        // 두번째로 입력받을 문자형
        String chr = scanner.next();

        // 솔루션 메소드 호출 후 , 문자 출력
        int solution = solution(string, chr.charAt(0));
        System.out.println(solution);
    }
}
