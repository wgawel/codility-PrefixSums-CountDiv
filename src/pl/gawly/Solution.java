package pl.gawly;

public class Solution {

    public int solution(int A, int B, int K) {
        int restA = A % K;
        int restB = B % K;
        if (restB < restA) {
            restB += K;
        }
        int addon = ((restA + (restB - restA)) >= K) || restA == 0 ? 1 : 0;
        return (B - A) / K + addon;
    }
}
