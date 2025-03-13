import java.util.*;
class Main {
    public static void main(String[] args){
        int arr [] = {2,67,89,56,45,67};
        int n = 6;
        int large = arr[0];
        for(int i=0;i<n;i++){
            if(large<arr[i]){
                large = arr[i];
            }
        }
        
        System.out.println(large);
    }
}
