import java.util.Scanner;

public class BinaryGapDemo {

	public static void main(String[] args) {

		int number, quot, i = 1;
		int bin_num[] = new int[100];
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a Decimal Number : ");
		number = scan.nextInt();
		quot = number;
		while (quot != 0) {
			bin_num[i++] = quot % 2;
			quot = quot / 2;

		}
		String binary_str = "";
		System.out.print("Binary number is: ");
		for (int j = i - 1; j > 0; j--) {
			binary_str = binary_str + bin_num[j];
		}
		System.out.println(binary_str);
		int b = binary_str.length();
		System.out.println(b);
		i = binary_str.length() - 1;
		while (binary_str.charAt(i) == '0') {
			i--;
		}
		int length = 0;
		int ctr = 0;
		for (; i >= 0; i--) {
			if (binary_str.charAt(i) == '1') {
				length = Math.max(length, ctr);
				ctr = 0;
			} else {
				ctr++;
			}
		}
		// length = Math.max(length, ctr);
		System.out.println("\nLength of the longest sequence: " + length);

	}

}
