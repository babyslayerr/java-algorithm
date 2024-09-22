package twoPointersSlidingWindow.두배열합치기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 백준에서 class 는 Main 이여야함
public class Main {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    public static List<Integer>  solution(int n,int m, int[] a, int[] b){

        // 출력값을 저장할 list
        List<Integer> answer = new ArrayList<>();

        // 포인터 역할을 할 변수
        int p1=0,p2 = 0;

        while(p1 < n && p2 <m){
            // 작은값이 먼저 삽입
            if(a[p1] < b[p2]){
                answer.add(a[p1++]); // 후위 연산자
            }else{
                answer.add(b[p2++]);
            }
        }
        // 남은 값에 대해서는 추가로 일괄로 삽입
        while(p1<n) answer.add(a[p1++]);
        while(p2<m) answer.add(b[p2++]);

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 첫번째 배열 크기 n
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }

        // 두번째 배열 크기 m
        int m = sc.nextInt();
        int[] b = new int[m];

        for(int i = 0; i<m; i++){
            b[i] = sc.nextInt();
        }

        for(int x : solution(n,m,a,b)){
            System.out.print(x + " ");
        }
    }
}
