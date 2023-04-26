import java.util.Scanner;

public class Q9 {
	public static double sumMajorDiagonal(double[][] m) {
		int sum = 0;
		for(int i = 0; i < m.length; i++) 
			sum += m[i][i];
		return sum;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Row and Columns of 2D-Array:");
		int a = sc.nextInt();
		double arr[][] = new double[a][a];
		System.out.print("Enter elements of 2D-Array: ");
		for(int i = 0;i<a;i++) {
			for(int j = 0;j<a;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Sum of diagonal = " + sumMajorDiagonal(arr));
		sc.close();
	}

}
