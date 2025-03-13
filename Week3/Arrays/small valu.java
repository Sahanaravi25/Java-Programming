import java.util.*;
class Main {
    public static void main(String[] args){
        int arr [] = {1,3,5,7,8};
        int n = 5;
        int small = arr[0];
        for(int i=0;i<n;i++){
            if(small>arr[i]){
                small = arr[i];
            }
        }
        
        System.out.println(small);
    }
}
