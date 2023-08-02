import java.util.Scanner;
public class GuviTask8ten {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an integer number: ");
	        int number = scanner.nextInt();

	        int count = countDigits(number);

	        System.out.println("Number of digits in the entered integer: " + count);
	    }

	    private static int countDigits(int number) {
	        // Handling negative numbers by taking the absolute value
	        number = Math.abs(number);
	        int count = 0;

	        while (number != 0) {
	            number /= 10;
	            count++;
	        }

	        return count;
	    }
		
	}

