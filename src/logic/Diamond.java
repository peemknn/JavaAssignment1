package logic;

public class Diamond {
	public void diamondShape(int n) {
		System.out.println("Display Diamond: "+ n);
		final String star = "+ ";
		final String space = "  ";
		StringEdit edit = new StringEdit();
		
		for(int i = n/2; i >= 1;i--) {
		System.out.println(edit.repeat(space, i) + edit.repeat(star, n - 2*i) + edit.repeat(space, i));
		}
		System.out.println(edit.repeat(star, n));
		for(int i = 1; i<(n/2)+1;i++) {
			System.out.println(edit.repeat(space, i) + edit.repeat(star, n - 2*i) + edit.repeat(space, i));
		}
	}
}
