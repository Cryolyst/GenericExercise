//Thant Zarni Nay (Connor) 203007421
/*
 * In the Age1 there are a lot of inefficiencies such as a memory inefficiency which might not be too noticible for now
 * but if the program had a larger purpose, having that much methods that do the same thing 
 * but the types would be super inefficient. That's why Age2 is so much more efficient as it uses generic
 * so no type needs to be specified, saving up on a lot of space for memory. 
 * Using generic also reduces human error as the developer don't really need to think about what kind of type it needs to be.
 * This is also efficient in an another way that by using this method developers can code faster than writing down individual methods 
 * for each data type. 
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
