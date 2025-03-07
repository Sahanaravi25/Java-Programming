// link https://www.geeksforgeeks.org/problems/middle-of-three2926/1
class Solution {
    int middle(int a, int b, int c) {
        if(b>c && b<a || b>a && b<c ){
            return b ;
    }
        else if(a>b && a<c || a<b && a>c){
            return a;
        }
        
        else {
            return c;
        }
        }
}
