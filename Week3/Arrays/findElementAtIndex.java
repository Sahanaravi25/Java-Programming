class Solution {
    public static int findElementAtIndex(int key, int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(key >= 0 && key < n){
                return arr[key]; 
            }
            
        }
        return arr[key]; 
    }
}
