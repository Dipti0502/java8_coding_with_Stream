import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Integer> numbers = Arrays.asList(12,34,56,78,99,56,1,2,3,2,1,3);
      List<Integer> dupRem = numbers.stream().distinct().collect(Collectors.toList());
      dupRem.stream().forEach(System.out::println);
 	}

}
