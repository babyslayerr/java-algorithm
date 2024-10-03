package HashMapTreeSet.매출액의종류;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

// 백준에서 class 는 Main 이여야함
public class Main {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    private static List<Integer> solution(int n, int k, int[] arr) {

        List<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        // 미리 초기화 세팅
        for(int i = 0 ; i<k;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        // 값 삽입
        answer.add(map.keySet().size());

        for(int i = 1; i <= n-k;i++){
            // 0 보다 크면 존재한단 뜻이므로 감소
            if (map.get(arr[i - 1]) > 0) {
                map.put(arr[i - 1], map.get(arr[i - 1])-1);
                // 감소시 0이면 제거
                if(map.get(arr[i-1]) == 0) map.remove(arr[i-1]);
            } else { // 없으면 key 제거
                map.remove(arr[i - 1]);
            }
            // i+k-1번째 인덱스 추가
            map.put(arr[i+k-1],map.getOrDefault(arr[i+k-1],0)+1);

            // 그리고 key 갯수 저장
            answer.add(map.keySet().size());
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n의 매출 기록
        int n = sc.nextInt();
        // k일 동안의 매출 기록
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i <n; i++){
            arr[i] = sc.nextInt();
        }

        for(int x : solution(n,k,arr)){
            System.out.print(x + " ");
        }

    }
}
