import java.util.Scanner;

class Student{
	int Roll;
	String Name;
	double DSA_Mark;
	void setdata() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Roll Number : ");
		Roll = sc.nextInt();
		System.out.print("Enter your Name : ");
		sc.nextLine();
		Name = sc.nextLine();
		System.out.print("Enter your DSA Marks : ");
		DSA_Mark = sc.nextDouble();
		System.out.println();
	}
	void showdata() {
		System.out.println("\nStudent Details :\nName : " + Name + "\nRoll Number : " + Roll + "\nMarks in DSA : " + DSA_Mark);
	}

}
public class Q3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students you want to enter : ");
		int n = sc.nextInt();
		Student arr[] = new Student[n];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = new Student();
			arr[i].setdata();
		}
		double max = arr[0].DSA_Mark;
		int maxIndex = 0;
		for(int i = 0;i<n;i++) {
			if (arr[i].DSA_Mark>max){
				max = arr[i].DSA_Mark;
				maxIndex = i;
			}
			if (arr[i].DSA_Mark == max) {
				maxIndex = i;
			}
		}
		arr[maxIndex].showdata();
		
		}
	

}
