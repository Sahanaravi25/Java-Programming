class Solution {
    public static boolean isPalindrome(int n) {
        int original = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;  
            reverse = reverse * 10 + digit;  
            n /= 10;  
        }

        return original == reverse;  
    }

    public static void main(String[] args) {
        int n = 555;
        System.out.println(isPalindrome(n));
    }
}
