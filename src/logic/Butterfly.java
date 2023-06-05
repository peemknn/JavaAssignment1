package logic;

public class Butterfly {
	public void butterflyShape(int n) {
		System.out.println("This is butterfly: "+n);
		int spaces = n*2-1;
		int stars = 2;
		int gap = n*2-1;
		
		for (int i = 0; i < n*2+1 ; i++) {
			//System.out.println(i);
			for (int j = 0; j < stars/2; j++) {
                System.out.print("+ ");
            }
			
			for (int k = 0; k < spaces; k++) {
                if(spaces == 1) {
    				System.out.print("- ");
    				break;
    			}
                System.out.print(" ");
            }
			for (int m = 0;m < gap; m++) {
				if(gap == 1) {
    				break;
    			}
				System.out.print(" ");
			}
			for (int l = 0; l < stars/2; l++) {
                System.out.print("+ ");
            }
			
			System.out.println();

            if (i < n - 1) {
                spaces = spaces - 2;
                gap = gap -2;
                stars += 2;
            } else {
            
                spaces = spaces +2;
                gap = gap + 2;
                stars -= 2;
            }
		}
		
	}

}

