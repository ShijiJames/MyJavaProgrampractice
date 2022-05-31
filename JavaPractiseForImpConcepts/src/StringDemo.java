
public class StringDemo {

	public static void main(String[] args) {
		String s1 = "abcabfaa";
		char s;
		int count = 0;
		for (int i = 0; i <= s1.length() - 1; i++) {
			s = s1.charAt(i);
			if (s == 'a') {
				count++;
			}

		}
		System.out.println(count);

	}

}
