package 문자열.특정문자뒤집기;

import java.util.Scanner;

public class Main {
    // 백준방식은 class 가 문자열찾기.Main 이여야함
    // 프로그래머스는 solution 메소드를 사용
    public static String solution(String str){

        // indexing 을 위한 포인터 값
        int lt = 0;
        // zero-based index
        int rt = str.toCharArray().length-1;
        // str : a#b!GE*T@S
        char[] charArray = str.toCharArray();
        // lt 가 rt 보다 크거나 같으면 반복문 탈출
        while(lt<rt)
        {
            // 왼쪽 포인터가 알파벳이 아니면
            if(!Character.isAlphabetic(charArray[lt])){
                // 왼쪽 포인터 증가
                lt++;
            } // 오른쪽 포인터가 알파벳이 아니면
            else if (!Character.isAlphabetic(charArray[rt])) {
                // 오른쪽 포인터 감소
                rt--;
            }
            // 둘다 알파벳이면
            else {
                // 교환
                char tmp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = tmp;
                // 각각 왼쪽 포인터는 증가, 오른쪽 포인터는 감소
                lt++;
                rt--;
            }

        }
        return String.valueOf(charArray);


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
