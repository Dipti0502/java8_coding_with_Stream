
public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str =  "katak";
		char[] charArr = str.toCharArray();
		StringBuilder result = new StringBuilder();
		for(int i=charArr.length-1;i>=0;i--) {
			result.append(charArr[i]);
		}
		System.out.print(result);
		System.out.println(str.toLowerCase().matches(".*[aeiou].*"));
	}

}
