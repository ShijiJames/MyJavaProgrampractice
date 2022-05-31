import java.util.Scanner;

public class AllPrimeNum {

	public static void main(String[] args) {

		int s1, s2, s3, flag, i, j;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the upper limit :");
		s2 = s.nextInt();
		System.out.println("The prime numbers in between the entered limits are :");
		for (i = 2; i < s2; i++) {
			flag = 1;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				} else {
					flag = 1;
				}
			}
			if (flag == 1) {
				System.out.println(i);
			}
		}

	}
}
