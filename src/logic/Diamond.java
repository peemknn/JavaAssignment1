package logic;

public class Diamond {
	public void diamondShape(int n) {
		int spaces = n / 2;
        int stars = 1;
        int gap = n-1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < gap; k++) {
            	System.out.print(" ");
            }

            for (int l = 0; l < stars; l++) {
                System.out.print("+ ");
            }

            System.out.println();

            if (i < n / 2) {
                spaces--;
                gap--;
                stars += 2;
            } else {
                spaces++;
                gap++;
                stars -= 2;
            }
        
            
        } 
	}
}
