import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Java Concept Of The Day";
		
		String reverse = Arrays.stream(str.split(" ")).map(word->new StringBuffer(word).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(reverse);

	}

}
