package examples;

public class ArraysExamplesOne {
	
	final static int NUMBER=1;
	
	@SuppressWarnings("null")
	public static void run () {
		System.out.println("EXAMPLE " +
				 NUMBER + " start");
	
		int[] integers = {10,-20,30,-40,0,110,-34,-50,-5,9,45,-67};
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
	 
				
		int j = 0;
		int k = 0;
	for (int i = 0; i < integers.length; i++) {
		//for (int j : integers) {
			if (integers[i] > 0) {
				
				pozitiveMasInt [j] = integers[i];
				// System.out.println(pozitiveMasInt [j]);
				 j++;
			} else if (integers[i] <= 0) {
					negativeMasInt [k] = integers[i];
				//	System.out.println(negativeMasInt [k]);
					k ++;
			}
		
	}
	
	System.out.println( "negative >> " + negative + " elements:");	
				for (int i = 0; i < negative; i++) {
					
					System.out.println( negativeMasInt[i] );
					
				}
				System.out.println("");
		System.out.println( "pozitive >> " + positive + " elements:" );		
				for (int i = 0; i < positive; i++) {
					System.out.println( pozitiveMasInt[i] );
					
				}
				System.out.println("");
				
		System.out.println("EXAMPLE " +
				NUMBER + " end");
	}
}

		
					
	
		

