package HashMapTreeSet.아나그램해쉬;

import java.util.HashMap;
import java.util.Scanner;

// 백준에서 class 는 Main 이여야함
public class Main {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    private static String solution(String a, String b) {

        String answer = "NO";

        // map 변수 선언
        HashMap<Character, Integer> map = new HashMap<>();

        for(char x : a.toCharArray()){
            // 각 문자열의 개수 삽입
            map.put(x, map.getOrDefault(x,0)+1);
        }

        for(char y : b.toCharArray()){
            // key값이 없으면 아나그램이 아님
            if(map.get(y) == null){
                return answer;
            }
            // count한걸 1 감소시킨다.
            map.put(y, map.get(y)-1);
            // count가 0보다 작으면 아나그램이 아님
            if(map.get(y) <0){
                return answer;
            }
        }

        answer = "YES";

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열 a
        String a = sc.next();
        String b = sc.next();

        System.out.print(solution(a,b));

    }
}
