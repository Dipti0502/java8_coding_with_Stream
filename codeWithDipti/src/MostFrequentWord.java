
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
		 Map<String,Long> map = listOfStrings.stream()
				 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 Map<String,Long> mostFrequentWord = (Map<String, Long>) map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		 System.out.println("Most Frequent Word:" + ((Entry) mostFrequentWord).getValue());
	}

}
