import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "RaceCar";
        String s2 = "CarRace";
        
        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        //Anagram 1. to split words, sorted, then join characters. same for s1,s2 then check s1 equals s2

        if(s1.equals(s2))
        	System.out.println("Anagram");
        else
        	System.out.println("Not Anagram");

	}

}
