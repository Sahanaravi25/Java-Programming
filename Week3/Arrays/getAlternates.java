class Solution {
    
    public ArrayList<Integer> getAlternates(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i += 2) { // Picking alternate elements
            result.add(arr[i]);
        }

        return result; 
    }
}
