package javaLibraries;

public class Student {
	int age;
	String name;
	Student(int age ,String name){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "Name: "+name+" Age: "+age;
	}
	public static void main(String[] args) {
		Student student= new Student(23, "uppi");
		System.out.println(student);
	}

}
