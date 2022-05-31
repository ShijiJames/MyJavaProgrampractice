import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int n1 = input.nextInt();
		int n = n1 % 2;
		if (n == 0) {
			System.out.println(n1 + " is a even number");
		} else {
			System.out.println(n1 + " is a odd number");
		}
		input.close();

	}

}
