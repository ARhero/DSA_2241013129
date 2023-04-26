public class Q1 {

	public static void main(String[] args) {
		double number = Integer.parseInt(args[0]);
		double initialnum = number;
		if(number>2) {
			int counter = 0;
			while(number>=2) {
				number=number/2;
				counter++;
			}
			System.out.println(initialnum + " must be divided " + counter + " times to get a number less than 2");
		}
		else {
			System.out.println("The number you entered is already less than 2.");
		}
	}

}
