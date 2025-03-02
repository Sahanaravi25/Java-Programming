import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        int count = 0;
        int temp = n;
        
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        
        System.out.println(count);
    }
}
