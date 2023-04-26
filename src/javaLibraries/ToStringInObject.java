package javaLibraries;

public class ToStringInObject {
	public static void main(String[] args) {
		ToStringInObject toStringInObject=new ToStringInObject();
		
		System.out.println(toStringInObject);// Implicitly calling the toString method--> Gives fully Qualified class name @hexadecimalvalue of hash code
		System.out.println(toStringInObject.toString());
	}
}
