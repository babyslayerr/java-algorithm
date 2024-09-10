package 문자열.암호;

import java.util.Scanner;

public class Main {
    // 백준방식은 class 이름이 Main 이여야함
    // 프로그래머스는 solution 메소드를 사용
    public static String solution(int number, String str){

        String answer = "";

        // 예시 입력
        // 4
        // #****###**#####**#####**##** -> ascii code
        // 예시 출력 COOL
        // 입력받은 문자갯수만큼 반복
        for(int i = 0; i < number; i++){
            // 앞에서 부터 0~6인덱스까지 뽑아낸 문자, 암호 -> 문자 변형 후 추출(replace사용)
            String temp = str.substring(0, 7).replace("#", "1").replace("*","0");
            // String -> 2진수로 숫자 변경 후 문자형으로 casting
            answer += (char)Integer.parseInt(temp,2);
            // 앞에서 사용한 문자는 사용하지 않기 때문에 str 재정의
            str = str.substring(7);
        }



        return answer;
    }


    public static void main(String[] args){
        // 콘솔로 입력 받을 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 문자의 갯수
        int number = scanner.nextInt();
        // 입력받을 단어 // keyboard
        String kb = scanner.next();

        // 솔루션 메소드 호출 후 , 문자열 출력
        String solution = solution(number,kb);

        System.out.print(solution);

    }
}
