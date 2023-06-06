package logic;

public class Diamond {
	public void diamondShape(int n) {
		System.out.println();
		final String star = "+ ";
		final String space = "  ";
		StringEdit str = new StringEdit();

		// top
		for (int i = n / 2; i >= 1; i--) {
			System.out.println(str.repeat(space, i) + str.repeat(star, n - 2 * i) + str.repeat(space, i));
		}
		// middle
		System.out.println(str.repeat(star, n));

		// bottom
		for (int i = 1; i < (n / 2) + 1; i++) {
			System.out.println(str.repeat(space, i) + str.repeat(star, n - 2 * i) + str.repeat(space, i));
		}
		System.out.println();
		System.out.println("This is diamond: " + n + "\n");
	}
}
