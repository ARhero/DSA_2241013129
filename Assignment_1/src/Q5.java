import java.util.Scanner;

public class Q5 {
	
	public static int sum_Of_Digits(int n) {
		int sum = 0;
		int r=1;
		while(n!=0) {
			r=n%10;
			n=n/10;
			sum=sum+r;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int number = sc.nextInt();
		int temp = sum_Of_Digits(number);
		while(temp/10!=0) {
			temp = sum_Of_Digits(temp);
		}
		System.out.println(temp);
		sc.close();
	}

}
