package examples;


public class ArraysExamplesTwo {
	
	final static int NUMBER=2;
	static float max = 0;
	
	public static void run () {
		System.out.println("EXAMPLE " + NUMBER + " start");
	
	//Temperature
		float [] TmpWeek = {-0.5f, 1.5f, 0.0f, 5.0f, 5.5f, 10f, -5.5f};
			
		String [] Wd = {"Mo", "Tu", "Wd", "Th", "Fr", "Sa", "So"};	
		//String [] Md = new String [] {"Mo"};	
		//System.out.println(Md.toString());
		max = TmpWeek [0];
				for (int i=0 ; i < 7 ; i++) {
					if (TmpWeek [i]>max) {          //finding maximum/>> < min
				max = TmpWeek [i] ;
			}
		}
 
		System.out.println("Temp max of the week = " + max);
				
		
		for (float Tw : TmpWeek) {
			//for (String string : Wd) {
						
				System.out.printf(Wd + "%6.2fC\n ", Tw);
								
		}
		System.out.println("Example" + NUMBER + "END");
		
	
	
	}
	public static float getMax() {
		return max;
	}
	public static void setMax(float max) {
		ArraysExamplesTwo.max = max;
	}
	public static int getNumber() {
		return NUMBER;
	}
	
	
	
			
}
