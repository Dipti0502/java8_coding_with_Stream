import java.util.*;
import java.util.stream.Collectors;

public class SortedReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<Integer> numbers = Arrays.asList(1,23,45,2,4,67,89,11);
		 List<Integer> sortedList = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		 sortedList.stream().forEach(System.out::println);
		 
		

	}

}
