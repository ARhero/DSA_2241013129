import java.util.Scanner;

class Complex{
	int real,imag;
	void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the real part : ");
		real = sc.nextInt();
		System.out.print("Enter the imaginary part : ");
		imag = sc.nextInt();
	}
	void display() {
		System.out.println("The number is " + real + " + " + imag + "i.\n");
	}
	public Complex add(Complex c1,Complex c2) {
		System.out.println("After Sum :-");
		Complex c = new Complex();
		int realSum = c1.real + c2.real;
		int imagSum = c1.imag + c2.imag;
		c.real = realSum;
		c.imag = imagSum;
		return c;
	}
}
public class Q2 {

	public static void main(String[] args) {
		Complex c1 = new Complex();
		c1.setData();
		c1.display();
		Complex c2 = new Complex();
		c2.setData();
		c2.display();
		Complex c = new Complex();
		c.add(c1,c2).display();
	}

}
