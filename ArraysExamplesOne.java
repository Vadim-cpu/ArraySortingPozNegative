package examples;

public class ArraysExamplesOne {
	
	final static int NUMBER=1;
	
	@SuppressWarnings("null")
	public static void run () {
		System.out.println("EXAMPLE " +
				 NUMBER + " start");
	
		int[] integers = {10,-20,30,-40,-50};
		//integers [2] +=10;
	 int negative = 0;
	 int positive = 0;
		
		for (int i:integers) {
				if (i>0) {
					
					System.out.println(i);
					positive ++;
				}
				else {
					System.out.println(i);
					negative ++;
				}
				
					
			
		}	
		System.out.println("number of pozitive  >>  " + positive);		
		System.out.println("number of negative  >>  " + negative);	
		
		int negativeMasInt [] = new int [negative]; 
		int pozitiveMasInt [] = new int [positive]; 
	 
		
		for (int i:integers) {
			if (i > 0) {
				for (int j = 0; j < positive; j++) {
				pozitiveMasInt[j] = i;
				System.out.println(pozitiveMasInt[j]);
				}
			}
			else if (i <= 0) {
				for (int j = 0; j < negative; j++) {
					negativeMasInt[j] = i;
					System.out.println(negativeMasInt[j]);
					}
			}	
					
		}
							
					
		
		
			

	
				for (int i = 0; i < negative; i++) {
					System.out.print( negativeMasInt[i] );
					
				}
				System.out.println("");
		System.out.println( "pozitive >> " );		
				for (int i = 0; i < positive; i++) {
					System.out.print( pozitiveMasInt[i] );
					
				}
				System.out.println("");
				
		System.out.println("EXAMPLE " +
				NUMBER + " end");
	}
}

		
					
	
		

