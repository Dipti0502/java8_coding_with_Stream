import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Min3Max3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(1,23,45,2,4,67,89,11);
		
		numbers.stream().sorted().limit(3).collect(Collectors.toList());
		
		System.out.println("Minimum 3 numbers:- ");
		
		numbers.stream().sorted().limit(3).forEach(System.out::println);
		
		System.out.println("Maximum 3 numbers");
		
		numbers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

	}

}
