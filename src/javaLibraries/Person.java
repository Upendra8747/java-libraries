package javaLibraries;

public class Person {
	String name;
	
	Person(String name){
		this.name= name;
	}
	public String toString() {
		return name;
	}
	public static void main(String[] args) {
		Person person= new Person("Upendra!!!!!");
		System.out.println(person);
		
	}
}
