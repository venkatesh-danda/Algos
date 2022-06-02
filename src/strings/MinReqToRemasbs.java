package strings;

public class MinReqToRemasbs {
	public static void main(String args[]) {
		String str = "aaaaaaaaaaaaaa"; // aba
		System.out.print(find(str));
	}

	static int indexi(String str, int i) {

		int j = 0;
		for (j = i + 1; j < str.length(); j++) {
			if (str.charAt(j) != str.charAt(i)) {
				break;
			}
		}
		return j - 1;
	}

	static int indexj(String str, int i) {
		int j = 0;
		for (j = i - 1; j > -1; j--) {
			if (str.charAt(j) != str.charAt(i)) {
				break;
			}
		}
		return j + 1;
	}

	static int find(String str) {

		int i = 0;
		int j = str.length() - 1;
		int count = 0;

		while (i <= j) {

			i = indexi(str, i);
			j = indexj(str, j);
			if (str.charAt(i) == str.charAt(j)) {

				i++;
				j--;
				count++;
			} else {
				j--;
				count++;
			}
		}
		return count;
	}
}
