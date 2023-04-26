import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int number = sc.nextInt();
		int sum = 0;
		int product = 1;
		int r=1;
		while(number!=0) {
			r=number%10;
			number=number/10;
			
			sum=sum+r;
			product = product*r;
		}
		if(sum==product) {
			System.out.println("It is a spy number.");
		}
		else {
			System.out.println("It is not a spy number.");
		}
		sc.close();
	}

}
