package HashMapTreeSet.K번째큰수;

import java.util.*;

// 백준에서 class 는 Main 이여야함
public class Main {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    private static int solution(int n, int k, int[] arr) {

        // k번째 수가 존재하지 않으면-1 출력
        int answer = -1;
        // 중복값을 배제해야되고, 정렬해야되기 때문에 이진트리로 되어있는 TreeSet 사용
        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());


        for(int i = 0; i<n;i++){
            for(int j = i+1; j<n;j++){
                for(int l = j+1; l<n; l++){
                    set.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }

        //순위를 판별할 cnt선언
        int cnt = 0;
        for(int x : set){
            // 1번째 순위부터 시작
            cnt++;
            // 순위가 k와 같으면 해당값 반환
            if(cnt==k){
                return x;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n장의 카드
        int n = sc.nextInt();
        // k 번째로 큰수
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(solution(n,k,arr));
    }
}
