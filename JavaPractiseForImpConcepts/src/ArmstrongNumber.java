
public class ArmstrongNumber {

	public static void main(String[] args) {
		int n1 = 153, temp, rem, result = 0;

		temp = n1;

		while (temp != 0) {
			rem = temp % 10;
			result += Math.pow(rem, 3);
			// result = result + (rem * rem * rem);
			temp = temp / 10;
		}

		if (result == n1)
			System.out.println(n1 + " is an Armstrong number.");
		else
			System.out.println(n1 + " is not an Armstrong number.");
	}
}
