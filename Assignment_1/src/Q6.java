import java.util.Scanner;

public class Q6 {
	
	public static boolean isOdd(int n) {
		if((n&1)==1) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int number = sc.nextInt();
		System.out.print(number + " is Odd = ");
		if(isOdd(number))
			System.out.println("True");
		else
			System.out.println("False");
		sc.close();
	}

}
