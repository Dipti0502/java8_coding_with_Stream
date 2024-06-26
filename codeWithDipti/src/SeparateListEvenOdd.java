import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SeparateListEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(2,73,34,12,3,6,90,88);
		Map<Boolean,List<Integer>> map = numbers.stream().
				collect(Collectors.partitioningBy(i->i%2==0));
		
		for(Entry<Boolean, List<Integer>> entry: map.entrySet()) {
			if(entry.getKey()) {
				System.out.println("Even");
			}else {
				System.out.println("Odd");
			}
			List<Integer> list = entry.getValue();
			list.stream().forEach(System.out::println);;
	}
}
}
