//Thant Zarni Nay (Connor) 203007421
/*
 * Explanation here
 */

package GenericExercise;

public class Age2Test {
	
	static long startTime,endTime,totalTime;
	
	public static void main(String[] args) {
		
//		startTime = System.currentTimeMillis();
		
		System.out.println("Your age is");

		Age2<Object> EfficientAge = new Age2<>();
		EfficientAge.setAge("Eighteen");
		System.out.println(EfficientAge.getAge());

		EfficientAge.setAge(18);
		System.out.println(EfficientAge.getAge());

		EfficientAge.setAge(18.0);
		System.out.println(EfficientAge.getAge());
		
//		endTime = System.currentTimeMillis();
//		totalTime = endTime - startTime;
//		System.out.println("Processing time is: " + totalTime + " millisecs");
	}
}
