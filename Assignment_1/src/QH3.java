import java.util.Scanner;

public class QH3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter no." + (i+1)+" element : ");
            a[i] = sc.nextInt();
        }
        int b[] = new int[n];
        for (int i = 0; i < b.length; i++) {
            System.out.print("Enter no." + (i+1)+" element : ");
            b[i] = sc.nextInt();
        }
        int c[] = new int[n];
        System.out.print("The dot product of array a and b are : [");
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i]*b[i];
            System.out.print(c[i] + ",");
        }
        System.out.println("]");
        sc.close();
    }
}
