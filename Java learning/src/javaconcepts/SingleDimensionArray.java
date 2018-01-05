package javaconcepts;

public class SingleDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int i[] = new int[5];
		i[0] =10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;
		
		for(int j=0;j<i.length;j++) {
		
			System.out.println(i[j]);
			
		}
		
		
		
		System.out.println(i.length);
		System.out.println(i[4]);
		
		char c[]=new char[3];
		c[0]='1';
		c[1]='s';
		c[2]='@';
		
		
		System.out.println(c.length);
		System.out.println(c[0]);
		
		
		Object ob[]= new Object[5];
		ob[0]="kalpana";
		ob[1]=30;
		ob[2]="Dallals";
		ob[3]="69%";
		ob[4]="153.2";
		
		System.out.println(ob[1]);
		System.out.println(ob.length);
		
		}
		
	
		
				
		
		
		
	}


