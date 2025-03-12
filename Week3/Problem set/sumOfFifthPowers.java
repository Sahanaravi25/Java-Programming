class Solution {
    long sumOfFifthPowers(long N) {
        long sum = 0;
        for (long i = 1; i <= N; i++) {
            sum += i * i * i * i * i;
        }
        return sum;
    }
}
