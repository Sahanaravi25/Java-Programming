class Solution {
    static long sumOfTheSeries(long n){
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            sum += (i * (i + 1)) / 2;
        }
        return sum;
    }
}
