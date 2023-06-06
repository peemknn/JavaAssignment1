package logic;

public class Butterfly {
	private final String star = "+ ";
	private final String space = "  ";
	public void butterflyShape(int n) {
		
		StringEdit str = new StringEdit();
		System.out.println();
		
		// top
		for (int i = 1; i < n; i++) {
			System.out.println(str.repeat(star, i) + str.repeat(space, 2 * (n - i) + 1) + str.repeat(star, i) + "\n");
		}

		// middle
		System.out.println(str.repeat(star, n) + "- " + str.repeat(star, n) + "\n");

		// bottom
		for (int i = n - 1; i >= 1; i--) {
			System.out.println(str.repeat(star, i) + str.repeat(space, 2 * (n - i) + 1) + str.repeat(star, i) + "\n");
		}
		System.out.println();
		System.out.println("This is butterfly: " + n + "\n");
	}

}
