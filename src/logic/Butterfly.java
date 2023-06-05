package logic;

public class Butterfly {
	public void butterflyShape(int n) {
		System.out.println("Display Butterfly: " + n);
		final String star = "+ ";
		final String space = "  ";
		StringEdit edit = new StringEdit();
		
		//top
		for (int i = 1; i < n; i++) {
			System.out.println(edit.repeat(star, i) + edit.repeat(space, 2 * (n - i) + 1) + edit.repeat(star, i));
		}
		//middle
		System.out.println(edit.repeat(star, n) + "- " + edit.repeat(star, n));
		
		//bottom
		for (int i = n - 1; i >= 1; i--) {
			System.out.println(edit.repeat(star, i) + edit.repeat(space, 2 * (n - i) + 1) + edit.repeat(star, i));
		}
	}
}

