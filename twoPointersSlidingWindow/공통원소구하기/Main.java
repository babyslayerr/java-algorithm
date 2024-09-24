package twoPointersSlidingWindow.공통원소구하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 백준에서 class 는 Main 이여야함
public class Main {

    // 프로그래머스에서는 solution 메소드를 사용해야함
    public static List<Integer>  solution(int n,int m, int[] a, int[] b){

        // 출력값을 저장할 list
        List<Integer> answer = new ArrayList<>();

        // 각각 배열 정렬
        Arrays.sort(a);
        Arrays.sort(b);
        // 포인터 역할을 할 변수
        int p1=0,p2 = 0;

        while(p1 < n && p2 <m){
            // 같으면 중복값이므로 값에 저장
            if(a[p1] == b[p2]){
                answer.add(a[p1++]);
                p2++;
            } else if(a[p1] < b[p2]){ // 현재 오름차순 정렬이기때문에 작은값의 인덱스가 증가되어야함
                p1++;
            } else{
                p2++;
            }
        }

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
