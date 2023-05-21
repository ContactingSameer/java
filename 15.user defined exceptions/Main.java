import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class User {
    private String name;
    private int age;

    public User(String name, int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Invalid age!");
        }
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter user name: ");
        String name = scanner.nextLine();

        System.out.print("Enter user age: ");
        int age = scanner.nextInt();

        try {
            User user = new User(name, age);
            user.displayInfo();
        } catch (InvalidAgeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
