import java.util.Scanner;

public class MultiplesOfX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        
        for (int i = x; i <= 1000; i += x) {
            System.out.println(i);
        }
    }
}
