class Solution {
    static long squaresDiff(int N){
        long sumOfSquares = 0, squareOfSum = 0;
        
        for (int i = 1; i <= N; i++) {
            sumOfSquares += i * i; 
            squareOfSum += i;      
        }
        
        squareOfSum = squareOfSum * squareOfSum; 
        
        return Math.abs(sumOfSquares - squareOfSum); 
    }
}
