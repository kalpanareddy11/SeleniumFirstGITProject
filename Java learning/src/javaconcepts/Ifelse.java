package javaconcepts;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*ifelse
		int i=10;
		int j=15;
		int k=20;
		
		if(i<=j) {
			System.out.println("print i is greater");
		}else {
				System.out.println("print j is greater");
	}	*/
			//nested if condition
				
				int i=10;
				int j=15;
				int k=20;
				
				if(i>j & j<k) {
					System.out.println("print i is good");
				}else if (j>=k) {
					System.out.println("print j is good");
				}else {
					System.out.println("print k is good");
				}
		}
	}



