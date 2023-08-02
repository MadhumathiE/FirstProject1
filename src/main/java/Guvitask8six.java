
import java.util.Scanner;
public class Guvitask8six {

	public static void main(String[] args) {
		
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number to calculate its factorial: ");
	        int number = scanner.nextInt();

	        long factorial = calculateFactorial(number);

	        System.out.println(number + "! = " + factorial);
	    }

	    private static long calculateFactorial(int number) {
	        if (number == 0 || number == 1) {
	            return 1;
	        }

	        long factorial = 1;
	        for (int i = 2; i <= number; i++) {
	            factorial *= i;
	        }

	        return factorial;
	    }
	}

	


