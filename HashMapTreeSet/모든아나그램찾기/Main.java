package HashMapTreeSet.모든아나그램찾기;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

// 백준에서 class 는 Main 이여야함
public class Main {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    private static int solution(String a, String b) {

        int answer = 0, lt = 0;

        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        // bm에 값 삽입
        for(char ch : b.toCharArray()){
            bm.put(ch, bm.getOrDefault(ch,0)+1);
        }

        // 그리고 b의 길이의 -1까지만 am에 삽입
        for(int i = 0; i < b.length()-1;i++){
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i),0)+1);
        }

        // two 포인터 로 추가 및 삭제를 반복 : 추가, 비교, 삭제 순
        for(int rt = b.length()-1; rt<a.length(); rt++){
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt),0)+1);
            if(am.equals(bm)) answer++;
            // count 감소 시킴
            am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
            // 0이면 key 삭제
            if(am.get(a.charAt(lt)) ==0) am.remove(a.charAt(lt));
            lt++;
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열 a
        String a = sc.next();
        // 아나그램 문자열 b
        String b = sc.next();

        System.out.print(solution(a,b));
    }
}
