package HashMapTreeSet.학급회장해쉬;

import java.util.HashMap;
import java.util.Scanner;

// 백준에서 class 는 Main 이여야함
public class Main {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    private static char solution(int n, String str) {

        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();

        // 반복문을 돌면서 키 삽입
        for(char x : str.toCharArray()){
            // 기존 키가 있으면 가져와서 +1 아니면 1로 삽입
            map.put(x,map.getOrDefault(x,0)+1);
        }
        // max 비교를 위한 변수
        int max = 0;
        //
        for(char key : map.keySet()){
            if(map.get(key)>max){
                max = map.get(key);
                answer=key;
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 반학생수 n
        int n = sc.nextInt();
        String str = sc.next();

        System.out.print(solution(n,str));

    }
}
