package javaLibraries;

public class OverridingequalsMethod {
	int a;
	
	OverridingequalsMethod(int a){
		this.a=a;
		
	}
	
	public boolean equals(Object obj) {
		OverridingequalsMethod ov = (OverridingequalsMethod) obj;
		return this.a==ov.a;
	}
	
	public static void main(String[] args) {
		OverridingequalsMethod overridingequalsMethod= new OverridingequalsMethod(224);
		OverridingequalsMethod overridingequalsMethod1= new OverridingequalsMethod(22);
		
		System.out.println(new OverridingequalsMethod(22).equals(new OverridingequalsMethod(22)));

		System.out.println(overridingequalsMethod.equals(overridingequalsMethod1));
	}
}
