package 문자열.단어뒤집기;

import java.util.Scanner;

public class Main {
    // 백준방식은 class 가 문자열찾기.Main 이여야함
    // 프로그래머스는 solution 메소드를 사용
    public static void solution(String[] sArray){

        // ex) ["good", "Time", "Big"]
        for(int i = 0; i < sArray.length; i++){
            // "good"
            String s = ""; // 역순으로 삽입
            for(int j = sArray[i].length() -1; j >= 0; j--){
                s += sArray[i].charAt(j);
            }
            // 바뀐 문자열로 삽입
            sArray[i] = s;
        }



    }


    public static void main(String[] args){
        // 콘솔로 입력 받을 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 첫번째로 입력받을 단어수 // keyboard
        int number = scanner.nextInt();

        // 입력받을 String 단어 배열
        String[] sArray = new String[number];

        // 배열 안 요소에 대해 입력
        for(int i = 0 ; i < number; i++){
            sArray[i] = scanner.next();
        }
        // 솔루션 메소드 호출 후 , 문자 출력
        solution(sArray);

        for(String s : sArray){
            System.out.println(s);
        }

    }
}
