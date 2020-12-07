public class WordsReversal {

	public static String reverseWords(String str) {
		
	
		StringBuilder sb = new StringBuilder(str);
		String revStr = sb.reverse().toString();//contains "uoy era woH"

		String[] words = revStr.split(" ");
		StringBuilder reverse = new StringBuilder();
		for (String temp : words) {
			sb = new StringBuilder(temp);
			reverse.append(sb.reverse()+" ");
		}
		
		
		reverse.deleteCharAt(reverse.length()-1);
		
		return reverse.toString();
	}

	public static void main(String[] args) {

		String str = "How are you";

		System.out.println("Original String : "+str);
		System.out.println("Words reversed : "+reverseWords(str));

	}
}
