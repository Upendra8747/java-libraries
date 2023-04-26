package javaLibraries;

public class OverrideToStringMethod {
	@Override
	public String toString() {
		return "This is Overriden The toString Method!!..";
	}
	public static void main(String[] args) {
		OverrideToStringMethod  overrideToStringMethod= new OverrideToStringMethod ();
		System.out.println(overrideToStringMethod);
		System.out.println(overrideToStringMethod.toString());
		
	}
}
