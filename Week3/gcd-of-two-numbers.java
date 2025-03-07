\\ link https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1

class Solution {
    public static int gcd(int a, int b) {
        int gcdv = 1;
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0){
                gcdv = i;
            }
        }
        return gcdv;
}
    public static void main(int a,int b){
        
        if(a<b){
            gcd(a,b);
        }
        else{
            gcd(b,a);
        }
    }
}
