package storingObjectsInarray;

public class Student {
	int age;
	String name;
	Student(int age , String name){
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return "Name: "+name+" Age: "+age;
	}
	public static void main(String[] args) {
		Student s1 = new Student(23, "Uppi");
		Student s2 = new Student(24, "Suni");
		
		
		Student[] arr = new Student[2];
		arr[0]=s1;
		arr[1]=s2;
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
			
		}
	}
}
