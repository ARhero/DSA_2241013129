// import java.util.Scanner;

// class Complex{
// 	int real,imag;
// 	void setData() {
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter the real part : ");
// 		real = sc.nextInt();
// 		System.out.print("Enter the imaginary part : ");
// 		imag = sc.nextInt();
// 	}
// 	void display() {
// 		System.out.println("The number is " + real + " + " + imag + "i.\n");
// 	}
// 	public Complex add(Complex c1,Complex c2) {
// 		System.out.println("After Sum :-");
// 		Complex c = new Complex();
// 		int realSum = c1.real + c2.real;
// 		int imagSum = c1.imag + c2.imag;
// 		c.real = realSum;
// 		c.imag = imagSum;
// 		return c;
// 	}
// }
// public class Q2 {

// 	public static void main(String[] args) {
// 		Complex c1 = new Complex();
// 		c1.setData();
// 		c1.display();
// 		Complex c2 = new Complex();
// 		c2.setData();
// 		c2.display();
// 		Complex c = new Complex();
// 		c.add(c1,c2).display();
// 	}

// }
import java.util.Scanner;
class Complex{
	int real, imag;
	
	 void setData() {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter a real and imaginary part");
		 real=sc.nextInt();
		 imag =sc.nextInt();
	 }
	 
	 void display() {
		 System.out.println(real+"+i"+imag);
	 }
	 public Complex add(Complex c1 ,Complex c2) {
		 Complex c= new Complex();
		 c.real=c1.real+c2.real;
		 c.imag=c1.imag+c2.imag;
	   return c;
		 
	 }
	
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Complex c1= new Complex();
			System.out.println("Enter first complex number ");
			c1.setData();
			c1.display();
			Complex c2= new Complex();
			System.out.println("Enter second  complex number ");
			c2.setData();
		    c2.display();
		    Complex c3= new Complex();
		    c3= c3.add(c1,c2);
		    c3.display();
		    
	}

}
 