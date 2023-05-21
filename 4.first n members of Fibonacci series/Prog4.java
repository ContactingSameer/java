import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci series up to " + n + " terms:");
        int num1 = 0, num2 = 1;
       for (int i = 1; i <= n; i++) {
            System.out.print(num1 + " ");

            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }
    }
}
