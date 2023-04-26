import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements of Array:");
		int arr[] = new int[sc.nextInt()];
		int arrcopy[] = new int[arr.length];
		System.out.print("Enter elements of the array:");
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			arrcopy[i] = arr[i];
		}
		
		int maxnum = arr[0];
		int minnum = arr[0];
		int countermax=0;
		int countermin=0;
		int maxpos = 1;
		int minpos = 1;
		for(int i = 0;i<arr.length;i++) {
			if(maxnum<arr[i]) {
				maxnum = arr[i];
				countermax=1;
				maxpos = i+1;
			}
			else if(maxnum==arr[i]) {
				countermax++;
			}
			
			if(minnum>arr[i]) {
				minnum = arr[i];
				countermin=1;
			}
			else if(minnum==arr[i]) {
				countermin++;
				minpos = i+1;

			}
		}
		System.out.println("Maximum element of Array is " + maxnum + " and occurs " + countermax + " times.");
		System.out.println("Minimum element of Array is " + minnum + " and occurs " + countermin + " times.");
		System.out.println("First occurrence of maximum element is at position " + maxpos + ".");
		System.out.println("Last occurrence of minimum element is at position " + minpos + ".");
		sc.close();
	}

}
