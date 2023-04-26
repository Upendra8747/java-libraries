package learningStringClass;

public class ConstructorInStringClass {
	public static void main(String[] args) {
		//String with no parameter.
		String s1 = new String();
		System.out.println(s1);// nothing we will get
		
		//String with String parameter.
		String s2 = new String("Java");
		System.out.println(s2); 
		
		char[] s3 = {'j','a','v','a'};
		
		//Convert char[] into a string Object.
		String s4 = new String(s3);
		System.out.println(s4);
		
	}
}
