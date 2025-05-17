package 완전탐색.수식최대화;

import java.util.*;
class solution {

    // 연산자의 우선순위 경우의수는 6가지 밖에 없음
    private final String[][] precedences = {
            {"+","-","*"},
            {"+","*","-"},
            {"-","+","*"},
            {"-","*","+"},
            {"*","-","+"},
            {"*","+","-"}
    };

    public long solution(String expression) {

        // delimiter 포함해서 토큰 분리
        StringTokenizer tokenizer = new StringTokenizer(expression, "+-*" , true);
        List<String> tokens = new ArrayList();
        while(tokenizer.hasMoreTokens()) {
            tokens.add(tokenizer.nextToken());
        }

        long max = 0;
        // 절댓값, 값 수정이 일어나기 때문에 배열을 복사해서 사용
        for(String[] precedence : precedences){
            long value = Math.abs(calculate(new ArrayList<>(tokens), precedence));
            if(value > max){
                max = value;
            }
        }

        return max;
    }

    private long calculate(List<String> tokens, String[] precedence){
        // 우선 순위 먼제 계산
        for(String op : precedence){
            for(int i = 0; i <tokens.size() ; i++){
                if(tokens.get(i).equals(op)) {
                    long lhs = Long.parseLong(tokens.get(i-1));
                    long rhs = Long.parseLong(tokens.get(i+1));
                    long result = calculate(lhs,rhs,op);
                    // 3개 토큰 제거
                    tokens.remove(i-1);
                    tokens.remove(i-1);
                    tokens.remove(i-1);
                    // 결과값 올바른 위치에 저장
                    tokens.add(i-1,String.valueOf(result));
                    // i값 세팅(전체 길이가 2만큼 줄었으므로 재세팅) -> -2를 해야 해당반복문이 끝나고 +1이 되어 다음 연산자가 있는곳으로 i 가 위치됨
                    i -= 2;
                }

            }
        }
        // 하나의 값만 남아있게됨
        return Long.parseLong(tokens.get(0));
    }

    // 연산 계산
    private long calculate(long lhs, long rhs, String op){
        return switch(op){
            case "+" -> lhs + rhs;
            case "-" -> lhs - rhs;
            case "*" -> lhs * rhs;
            default -> 0;
        };
    }
}