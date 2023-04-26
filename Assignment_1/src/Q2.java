import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Height of the person (in cms) = ");
		double height = sc.nextDouble();
		height = height/100;
		System.out.print("Enter the Weight of the person (in kgs) = ");
		double weight = sc.nextDouble();
		double bmi = weight/(height*height);
		
		System.out.println("Your BMI is = " + bmi + ". You are ");
		if(bmi<18.5)
			System.out.println("Underweight");
		else if(18.5<=bmi && bmi<=24.9)
			System.out.println("Normal");
		else if(25.0<=bmi && bmi<=29.9)
			System.out.println("Overweight");
		else if(30.0<=bmi)
			System.out.println("Obese");
		sc.close();

	}

}
