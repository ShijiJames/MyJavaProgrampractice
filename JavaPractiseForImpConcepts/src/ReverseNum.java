class ReverseNum {
	public static void main(String agrs[]) {
		int n1 = 234;
		int rev = 0;

		while (n1 != 0) {
			int rem = n1 % 10;
			n1 = n1 / 10;
			rev = rev * 10 + rem;
		}
		System.out.println(rev);
	}
}