import java.util.*;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1,23,45,2,4,67,89,11);
		int secondLarges = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.print(secondLarges);
	}

}
