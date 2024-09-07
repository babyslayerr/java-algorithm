package 문자열.중복문자제거;

import java.util.Scanner;

public class Main {
    // 백준방식은 class 가 문자열찾기.Main 이여야함
    // 프로그래머스는 solution 메소드를 사용
    public static String solution(String str){

        // indexOf 를 통해 찾은 인덱스와 charAt과 다른 인덱스면 중복된 문자
        // ksekkset -> kset
        String s = "";
        for(int i = 0; i < str.length(); i++){
            // 인덱스에 해당하는 값과, 인덱스에 해당하는 값의 첫번째 위치가 있는 인덱스와 비교했을때 다르면 중복
            if(i == str.indexOf(str.charAt(i))){
                // 중복이 아닌 값이므로 추가
                s += String.valueOf(str.charAt(i));
            }
        }

        return s;


    }


    public static void main(String[] args){
        // 콘솔로 입력 받을 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 첫번째로 입력받을 단어 // keyboard
        String kb = scanner.next();


        // 솔루션 메소드 호출 후 , 문자 출력
        String solution = solution(kb);

        System.out.println(solution);

    }
}
