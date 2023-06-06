package logic;

public class Diamond {
	private final String star = "+ ";
	private final String space = "  ";

	public void diamondShape(int n) {

		StringEdit str = new StringEdit();
		System.out.println();

		// top
		for (int i = n / 2; i >= 1; i--) {
			System.out.println(str.repeat(space, i) + str.repeat(star, n - 2 * i) + str.repeat(space, i) + "\n");
		}
		// middle
		System.out.println(str.repeat(star, n) + "\n");

		// bottom
		for (int i = 1; i < (n / 2) + 1; i++) {
			System.out.println(str.repeat(space, i) + str.repeat(star, n - 2 * i) + str.repeat(space, i) + "\n");
		}
		System.out.println();
		System.out.println("This is diamond: " + n + "\n");
	}
}
