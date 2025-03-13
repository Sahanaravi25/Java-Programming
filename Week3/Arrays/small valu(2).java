import java.util.*;
class Main {
    public static void main(String[] args){
        int arr [] = {5,7,34,67,2,56,5,8};
        int n = 8;
        int small = arr[0];
        for(int i=0;i<n;i++){
            if(small>arr[i]){
                small = arr[i];
            }
        }
        
        System.out.println(small);
    }
}
