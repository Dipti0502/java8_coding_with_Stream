import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordNumberFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//For String 
		String str = "This is my first product based company, This is one of dream company, like company ";
		List<String> words = Arrays.asList(str.split("[, ]"));
		Map<String,Long> map = words.stream().
				collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		//For Intergers
		List<Integer> nos =  Arrays.asList(12,34,56,78,99,56,1,2,3,2,1,3);
		Map<Integer,Integer> collect = nos.stream()
			     .collect( Collectors.groupingBy( Function.identity(), Collectors.summingInt(e -> 1) ));
		System.out.println(collect);
		
		//For Character counting
		String sample = "Hello world concept of the world";
		Map<Character,Long> charMap = sample.chars().mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(charMap);
		

	}

}
