import java.util.Scanner;

public class GuviTask8 {
 
	public static void main(String[] args) {
		
		int a,b,c,d;
		Scanner scanner =new Scanner (System.in);
		
		System.out.println("Enter the value of a : ");
		a=scanner.nextInt();
		System.out.println("Enter the value of b: ");
		b=scanner.nextInt();
		System.out.println("Enter the value of c : ");
		c=scanner.nextInt();
		System.out.println("Enter the value of d : ");
		d=scanner.nextInt();
		if(a+b > c+d) {
			System.out.println("The sum of a and b is grater than the sum of c and d.");
		}
		else
		{
			System.out.println("The sum of a and b is not grater than the sum of c and d.");
		}
			
	
      scanner.close();
      
      
	}
}
	

