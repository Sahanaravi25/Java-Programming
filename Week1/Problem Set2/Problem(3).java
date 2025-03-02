import java.util.Scanner;

public class PrintFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int n = scanner.nextInt();
        
        String fullName = firstName + lastName;
        
        for (int i = 0; i < n; i++) {
            System.out.println(fullName);
        }
    }
}
