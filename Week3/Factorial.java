class Solution {
    static int factorial(int n) {
        int val = n;
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
    return fact;
    }
}
