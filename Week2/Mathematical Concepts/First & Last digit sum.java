class Solution
{
    public int corner_digitSum(int N){
        if (N < 10) {
            return N;
        }
        int fd = N; 
        int ld = N%10; 
        
        while (fd >= 10) {
            fd/= 10; 
        }

        return ld+fd;
    }
}
