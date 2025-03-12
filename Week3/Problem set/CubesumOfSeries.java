class Solution {
    static long sumOfSeries(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (long) i * i * i;  
        }
        return sum;
    }
}
