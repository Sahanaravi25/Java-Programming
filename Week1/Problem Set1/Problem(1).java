import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine();
        String b = scanner.nextLine();
        char c = scanner.next().charAt(0);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
