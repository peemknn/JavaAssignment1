package logic;

public class Diamond {
	String result = "";
	public void diamondShape(int n) {
		int spaces = n / 2;
        int stars = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < stars; k++) {
                System.out.print("+");
            }

            System.out.println();

            if (i < n / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
        }

        System.out.println("n"); 
		
		
	}
	public void printDiamond() {
		System.out.println(result);
	}

}
