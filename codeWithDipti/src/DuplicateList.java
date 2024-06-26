import java.util.*;
import java.util.stream.Collectors;

public class DuplicateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> original = Arrays.asList(1,2,2,5,5,7,7,16,16,3,4,5,6,7,8,9,10);
		List<Integer> duplicates = original.stream().filter(n->Collections.frequency(original, n)>1).collect(Collectors.toList());
		duplicates.stream().forEach(System.out::println);
//To find duplicates list to apply filter to check condition that frequency of a number in list >1 
	}

}
