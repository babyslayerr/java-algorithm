package 문자열.문자열압축;

import java.util.Scanner;

public class Main {
    // 백준방식은 class 이름이 Main 이여야함
    // 프로그래머스는 solution 메소드를 사용
//    public static String solution(String str){
//
//        String answer = "";
//
//        // 예제 입출력1 KKHSSSSSSSE K2HS7E
//        // 예제 입출력2 KSTTTSEEKFKKKDJJGG KST3SE2KFK3DJ2G2
//
//        // 임시로 값을 비교할
//        char temp = str.charAt(0);
//        int count = 1;
//        // 0번 인덱스는 비교값이므로 미리 초기화
//        for(int i = 1; i < str.length(); i++){
//            // 이전문자와 같으면 count 만 증가
//            if(temp == str.charAt(i)){
//                count++;
//            }
//            else{
//                // 다르면 이전값들 저장
//                // 숫자가 1이상이면 숫자까지 저장
//                if(count != 1){
//                    answer += temp;
//                    answer += count;
//                }else{
//                    answer += temp;
//                }
//
//                // temp와 count는 초기화
//                temp = str.charAt(i);
//                count = 1;
//            }
//
//            // 위 로직은 마지막 문자열 반복은 압축이 안되므로 마지막 인덱스 참조시 문자열을 추가적으로 더해준다
//            if(i == str.length()-1){
//                // 다르면 이전값들 저장
//                // 숫자가 1이상이면 숫자까지 저장
//                if(count != 1){
//                    answer += temp;
//                    answer += count;
//                }else{
//                    answer += temp;
//                }
//            }
//
//        }
//        return answer;
//    }


    public static void main(String[] args){
        // 콘솔로 입력 받을 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 첫번째로 입력받을 단어 // keyboard
        String kb = scanner.next();

        // 솔루션 메소드 호출 후 , 문자열 출력
        String solution = solution(kb);

        System.out.print(solution);

    }

    // 리팩토링
    public static String solution(String str){

        String answer = "";
        // out of index 를 피하기 위한 빈 문자열  문자열 끝에 삽입
        str = str + " ";

        // 예제 입출력1 KKHSSSSSSSE K2HS7E
        // 예제 입출력2 KSTTTSEEKFKKKDJJGG KST3SE2KFK3DJ2G2

        // 문자 갯수를 카운트할 count 선언
        int count = 1;
        // 끝에 빈 문자열이 있고 이것전까지 비교하기 때문에 종료조건에 길이 - 1
        for(int i = 0 ; i < str.length() - 1; i++){
            // 문자형이 같으면 count 만 증가
            if(str.charAt(i) == str.charAt(i+1)) {
                count++;
            }else{
                // 해당문자형이 앞인덱스와 다르면 해당문자형 더함
                answer += str.charAt(i);
                // count 가 1보다 크면 더함
                if(count > 1) answer += count;
                // 카운트 1로 초기화
                count = 1;
            }
        }



        return answer;
    }
}
