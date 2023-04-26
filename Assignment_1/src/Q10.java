import java.util.Scanner;

public class Q10 {
	public static double sumColumn(double[][] m, int columnIndex) {
		int sum = 0;
		for(int i = 0; i < m.length; i++) {
			sum+=m[i][columnIndex];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double arr[][] = new double[3][4];
		System.out.println("Enter a 3-by-4 matrix row by row:");
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<4;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the index of the column : ");
		int cIndex = sc.nextInt();
		System.out.println("Sum of the elements at column " + cIndex + " is " + sumColumn(arr,cIndex));
		sc.close();
	}

}
