package logic;

public class StringEdit {
	private String res = "";
	
	//function for repeat a string
	//example : repeat("aa",3) will be equal to "aaaaaa"
	public String repeat(String input, int n) {
		setRes("");
		for (int i = 0; i < n; i++) {
			res += input;
		}
		return res;

	}
	public void setRes(String res) {
		this.res = res;
	}
}

