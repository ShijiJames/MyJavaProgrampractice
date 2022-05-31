
public class ArmStrongTillK {

	public static void main(String[] args) {
		int i = 100, arm;
		while (i < 1000) {
			arm = isArmSt(i);
			if (arm == i)
				System.out.println(i);
			i++;
		}

	}

	public static int isArmSt(int n) {
		int temp, rem, res = 0;
		while (n != 0) {
			rem = n % 10;
			res = res + (rem * rem * rem);
			n = n / 10;
		}

		return res;
	}

}
