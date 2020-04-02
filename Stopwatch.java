package uuuu;

public class Stopwatch {
	public static void main(String[] args) throws InterruptedException {

	long startTime = System.nanoTime();
	// enter code here
	long endTime = System.nanoTime();
	
	long duration = (endTime - startTime);
	double seconds = (double)duration / 1_000_000_000.0;
	System.out.println(seconds);
	
	
	
     
}
}