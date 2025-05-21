package 완전탐색.소수찾기;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public int solution(String numbers) {

        List<Integer> list = numbers.chars()
                .map(c -> c - '0')
                .boxed()
                .collect(Collectors.toList());

        return getPrime(0, list).size();
    }

    private Set<Integer> getPrime(int acc, List<Integer> numbers) {
        // 종료 조건
        if(numbers.isEmpty()){
            // acc의 소수 여부에 따라 적절한 값 반환
            if(isPrime(acc)) {
                return Set.of(acc);
            }
            return Set.of();
        }

        // 점화식 구현
        Set<Integer> primes = new HashSet<>();
        if(isPrime(acc)) {
            primes.add(acc);
        }
        // 상태 전이 구현
        for(int i =0 ; i < numbers.size() ; i++) {
            int nextAcc = acc * 10 + numbers.get(i);
            // 배열의 동일 참조를 막기 위휘 새로 선언
            List<Integer> nextNumbers = new ArrayList<>(numbers);
            // 사용한 숫자 제거
            nextNumbers.remove(i);
            primes.addAll(getPrime(nextAcc, nextNumbers));
        }

        return primes;
    }
    private boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i = 2; i*i <= n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}