import java.util.Scanner;
public class MathOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the radiud of your circle: ");
		double num = scan.nextDouble();
		
		
		
		System.out.println( "The parimeter of the cirle is: " + 2 * Math.PI * num);

	}

}
