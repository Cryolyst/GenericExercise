package GenericExercise;

public class Age1Test {
	
	static long startTime,endTime,totalTime;
	
	public static void main(String[] args) {
		
//		startTime = System.currentTimeMillis();
		
		System.out.println("Your age is");
		Age1 InefficientAge = new Age1();

		InefficientAge.set_age_String("Eighteen");
		System.out.println(InefficientAge.get_age_String());

		InefficientAge.set_age_int(18);
		System.out.println(InefficientAge.get_age_int());

		InefficientAge.set_age_double(18.0);
		System.out.println(InefficientAge.get_age_double());
		
//		endTime = System.currentTimeMillis();
//		totalTime = endTime - startTime;
//		System.out.println("Processing time is: " + totalTime + " millisecs");
	}
}
