import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 2516;
		int sum = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
		System.out.println("Sum: " + sum);
	}

}
