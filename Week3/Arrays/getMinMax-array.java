class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null; 
        }

        int min=arr[0];
        int max=arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return new Pair <> (min,max);
        
    }
}
