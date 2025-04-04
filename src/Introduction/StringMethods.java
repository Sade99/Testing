package Introduction;

public class StringMethods {

	public static void main(String[] args) {
		String str = "This is a test string";
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.contains("ring"));
		System.out.println(str.contains("y"));
	    System.out.println(str.substring(9));
	    System.out.println(str.substring(1, 9));
	    String str1 = "I love Java";
	    System.out.println(str1.substring(7));
	    System.out.println(str1.substring(7, 11));

	}

}
