class Main {
    public static void main(String[] args) {
        int n = 325345;
        int sum = 0;
        
        while(n>0){
            int ld = n%10;
            sum = sum * 10 +(ld);
            n=n/10;
        }
        System.out.println(sum);
    }
}
