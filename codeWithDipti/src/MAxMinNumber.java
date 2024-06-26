import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MAxMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<Integer> numbers = Arrays.asList(1,23,45,2,4,67,89,11);
		 int max = numbers.stream().max(Comparator.naturalOrder()).get();
		 int min = numbers.stream().min(Comparator.naturalOrder()).get();
		 numbers.stream().max(Comparator.naturalOrder()).get();
		 System.out.println("Max : "+ max +" " + "Min : " +min );
		 
	}

}
