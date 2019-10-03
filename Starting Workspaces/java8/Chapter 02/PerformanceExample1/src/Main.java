import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws InterruptedException {
//		Arrays.stream(args).forEach(System.out::println);
        Thread.sleep(2000000);
		System.out.println("liberando ..");
		PrimeNumbers primeNumbers = new PrimeNumbers();
		Integer max = Integer.parseInt(args[0]);
		primeNumbers.generateNumbers(max);
	}

}
