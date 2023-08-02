import java.util.Scanner;
public class Guvitask8nine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 60) {
            System.out.println("Congratulations! You are a senior citizen.");
        } else {
            System.out.println("You are not yet a senior citizen.");
        }
    }


	}

