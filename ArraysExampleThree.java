package examples;

public class ArraysExampleThree {
	
	
	
	public static void run (){
		int[] data = {10,20,30,40,50};
		int indexToAdd = 2;
		int newValue = -10;
		for (int i : data) {
			System.out.println(i);
		}
		
		int [] newData = new int [data.length -1];
		for(int oi = 0, ci = 0; oi < data.length ; oi++ )
	    {
	        if( oi != indexToAdd ){
	            newData[ ci ] = data[ oi ];
	            ci = newValue;
	        }
	    }
		data = newData;
		for (int j : newData) {
			System.out.println();
			System.out.println(j);
		}
	}

}
