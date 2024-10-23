package stackQueue.응급실;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 백준에서 class 는 Main 이여야함
public class Main {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    private static int solution(int n, int m, int[] arr) {
        // 결과 변수 선언
        int answer = 0;
        // Queue 객체 이용
        Queue<Person> q = new LinkedList<>();

        // 값 삽입
        for(int i =0; i<n;i++){
            q.offer(new Person(i,arr[i]));
        }
        // 큐가 빌때까지 반복
        while(!q.isEmpty()){
            // 맨 앞 대기인원
            Person tmp = q.poll();
            // 맨앞의 사람이 우선순위가 젤 높은지 체크
            for(Person x : q){
                // 뒤에 대기 인원의 우선순위가 높으면
                if(x.priority > tmp.priority){
                    // 다시 뒤로
                    q.offer(tmp);
                    // 맨 앞 값 초기화
                    tmp = null;
                    break;
                }
            }
            // null이 아니라면 맨앞이라는 뜻
            if(tmp!=null){
                // 출력값의 수를 매겨야 함
                answer++;
                // 만약 m과 id 가 같다면 이때까지 count한 값 출력
                if(tmp.id==m) return answer;
            }
        }


        return  answer;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // n명의 환자 대기 목록
        int n = sc.nextInt();
        // 수업설계
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n,m,arr));

    }
}
// queue에 넣을 객체 정의
class Person{
    // index 위치
    int id;
    // 우선순위
    int priority;

    public Person(int id, int priority){
        this.id = id;
        this.priority = priority;
    }
}
