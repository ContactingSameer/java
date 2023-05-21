import java.util.Scanner;

public class Date2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day: ");
        int dd = scanner.nextInt();
        System.out.print("Enter month: ");
        int mm = scanner.nextInt();
        System.out.print("Enter year: ");
        int yy = scanner.nextInt();

        if (yy >= 1900 && yy <= 9999) {
            // check month
            if (mm >= 1 && mm <= 12) {
                // check days
                if ((dd >= 1 && dd <= 31)
                        && (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12))
                    System.out.println("Date is valid.\n");
                else if ((dd >= 1 && dd <= 30) && (mm == 4 || mm == 6 || mm == 9 || mm == 11))
                    System.out.println("Date is valid.\n");
                else if ((dd >= 1 && dd <= 28) && (mm == 2))
                    System.out.println("Date is valid.\n");
                else if (dd == 29 && mm == 2 && (yy % 400 == 0 || (yy % 4 == 0 && yy % 100 != 0)))
                    System.out.println("Date is valid.\n");
                else
                    System.out.println("Day is invalid.\n");
            } else {
                System.out.println("Month is not valid.\n");
            }
        } else {
            System.out.println("Year is not valid.\n");
}
}
}
