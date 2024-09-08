package 문자열.숫자만추출;

import java.util.Scanner;

public class Main {
    // 백준방식은 class 이름이 Main 이여야함
    // 프로그래머스는 solution 메소드를 사용
    public static String solution(String str){

        String answer = "";
        // g0en2T0s8eSoft -> 208 출력

        // 반복을 통해서 숫자인지 확인
        for(char c : str.toCharArray()){
            // 숫자면 -> ascii code 48~57이 0~9까지의 숫자인걸 이용해도 가능 c>=48 && c <= 57
            if(Character.isDigit(c)){
                // 답에 더함
                // 추가로 answer 를 int 형 변수로 정의하고,
                // 자릿수 덧셈의 경우에도 answer = answer * 10 + c-48 로 정의할 수 있음
                answer += c;
            }
        }
        // 만든값을 자연수로 만들어야함 - 정수형으로 형 변환하면 자연수로 바꾸고 다시 str으로 캐스팅
        answer = String.valueOf(Integer.valueOf(answer));

        return answer;
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
