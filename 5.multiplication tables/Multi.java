import java.util.Scanner;

public class Multi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number (m): ");
        int m = scanner.nextInt();

        System.out.print("Enter the ending number (n): ");
        int n = scanner.nextInt();

        if (m >= n) {
            System.out.println("Invalid range! Please ensure m < n.");
            return;
        }

        for (int i = m; i <= n; i++) {
            System.out.println("Multiplication table of " + i + ":");

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println(); 
        }
    }
}
