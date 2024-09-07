package 문자열.회문문자열;

import java.util.Scanner;

public class Main {
    // 백준방식은 class 가 문자열찾기.Main 이여야함
    // 프로그래머스는 solution 메소드를 사용
    public static String solution(String str){

        // gooG -> Yes 출력

        // 대소문자 구분 x
        str = str.toUpperCase();

        // 왼쪽 오른쪽 포인터 선언
        int lt = 0;
        int rt = str.length()-1;

        // lt가 rt 보다 작을때는 계속 반복
        while(lt<rt){

            // 왼쪽 오른쪽값이 다르면 회문 문자열이 아니므로 반복문 종료 후, NO출력
            if(str.charAt(lt) != str.charAt(rt)){
                return "NO";
            }

            lt++;
            rt--;
        }
        return "YES";
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
