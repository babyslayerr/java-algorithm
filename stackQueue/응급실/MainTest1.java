package stackQueue.응급실;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 백준에서 class 는 Main 이여야함
public class MainTest1 {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    private static int solution(int n, int m, int[] arr) {
        // 결과 변수 선언
        int answer = 0;
        // Queue 객체 이용
        Queue<Patient> q = new LinkedList<>();

        // 값 삽입
        for(int i =0; i<n;i++){
            q.offer(new Patient(i,arr[i]));
        }

        while(!q.isEmpty()){
            // 맨 앞 가져온다
            Patient tmp = q.poll();
            for(Patient x : q){
                if(x.priority> tmp.priority){
                    q.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            // null이 아니면 맨 앞이라는 뜻
            if(tmp!=null){
                answer++;
                if(tmp.id == m) return answer;
            }

        }
        return  answer;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // n명의 환자 대기 목록
        int n = sc.nextInt();
        // m번째 환자
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n,m,arr));

    }
}
