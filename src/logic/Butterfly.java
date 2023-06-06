package logic;

public class Butterfly {
	public void butterflyShape(int n) {
		System.out.println();
		final String star = "+ ";
		final String space = "  ";
		StringEdit str = new StringEdit();
		
		//top
		for (int i = 1; i < n; i++) {
			System.out.println(str.repeat(star, i) + str.repeat(space, 2 * (n - i) + 1) + str.repeat(star, i));
		}
		//middle
		System.out.println(str.repeat(star, n) + "- " + str.repeat(star, n));
		
		//bottom
		for (int i = n - 1; i >= 1; i--) {
			System.out.println(str.repeat(star, i) + str.repeat(space, 2 * (n - i) + 1) + str.repeat(star, i));
		}
		System.out.println();
		System.out.println("This is butterfly: " + n + "\n");
	}	
}
