class Solution {
    int arraySum(int arr[]) {
        int sum = 0;
        int n = arr.length;
    
        for(int i=0;i<n;i++){
            sum = sum+arr[i];
        }
        return sum;
    }
}
