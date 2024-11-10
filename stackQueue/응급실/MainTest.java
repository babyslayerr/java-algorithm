package stackQueue.응급실;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 백준에서 class 는 Main 이여야함
public class MainTest {

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
        // 큐에 내용이 들어있으면 반복
        while(!q.isEmpty()){

            // 맨 앞 환자를 꺼냄
            Patient tmp = q.poll();

            for(Patient x : q){
                if(x.priority>tmp.priority){
                    // 우선순위가 더 크면 뒤로
                    q.offer(tmp);
                    tmp =null;
                    break;
                }
            }
            // 자기가 최우선 진료 환자
            if(tmp!=null){
                // 순서 증가
                answer++;
                // 환자의 id랑 m번째 순서가 같으먼 출력
                if(tmp.id ==m) return answer;
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
// queue에 넣을 객체 정의
class Patient{

    int id;
    int priority;
    public Patient(int id, int priority) {
        this.id=id;
        this.priority=priority;
    }
}