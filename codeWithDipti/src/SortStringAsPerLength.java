import java.util.*;
import java.util.stream.Collectors;
public class SortStringAsPerLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
		
		listOfStrings.stream().sorted(Comparator.comparing(String::length))
		.collect(Collectors.toList()).forEach(System.out::println);
		
		
		
	}

}
