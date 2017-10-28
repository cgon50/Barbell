
import java.util.Arrays;

public class LiftTester {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		PrimaryLift[] liftz = new PrimaryLift[4];
		liftz[0] = new PrimaryLift("Squat", 45);
		liftz[1] = new PrimaryLift("Bench", 50);
		liftz[2] = new PrimaryLift("Deadlift", 60);
		liftz[3] = new PrimaryLift("Press", 60);
		
		for(int i = 0; i < 4; i ++)
			System.out.println(liftz[i].getTMax());
		
		int[] expectedSquatWeight = {5, 3, 1, 3, 3, 3, 5, 5, 5};
		int[] expectedBenchWeight = {5, 3, 1, 3, 5, 3, 5, 3, 5};
		int[] expectedDeadLiftWeight = {5, 3, 1, 3, 3, 3, 3, 3, 3};
		int[] expectedPressWeight = {5, 3, 1, 3, 3, 3, 5, 5, 5};
		
		test(1, Arrays.toString(expectedSquatWeight), Arrays.toString(liftz[0].getPrimaryDay()));
		test(2, Arrays.toString(expectedBenchWeight), Arrays.toString(liftz[1].getPrimaryDay()));
		test(3, Arrays.toString(expectedDeadLiftWeight), Arrays.toString(liftz[2].getPrimaryDay()));
		test(4, Arrays.toString(expectedPressWeight), Arrays.toString(liftz[3].getPrimaryDay()));
		
	}
	
	public static void test(int testNum, String expected, String actual){
		System.out.println("Test Number " + testNum + ": ");
		System.out.println("Expected: " + expected);
		System.out.println("Actual: " + actual);
		
		if(expected.equals(actual))
			System.out.println("Passed!!!");
		else
			System.out.println("FailedXXX");
	}

}
