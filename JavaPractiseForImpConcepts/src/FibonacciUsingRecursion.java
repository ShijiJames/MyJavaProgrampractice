public class FibonacciUsingRecursion {
	static int a = 0, b = 0, c = 1;

	static void printFibonacci(int count) {
		if (count > 0) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(a + " ");
			printFibonacci(count - 1);
		}
	}

	public static void main(String args[]) {
		int count = 10;
		printFibonacci(count);
	}

}
