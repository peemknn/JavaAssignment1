package logic;

public class StringEdit {
	//function for repeat a string
	public String repeat(String input, int n) {
		String res = "";
		for (int i = 0; i < n; i++) {
			res += input;
		}
		return res;

	}

}
