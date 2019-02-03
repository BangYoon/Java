package bangyoon.java.eclipse;

public class Compare_Boolean {

	public static void main(java.lang.String[] args) {
		System.out.println("one"=="two");   //false
		System.out.println("one"=="one");   //true

		System.out.println(1!=2);           //true
		System.out.println(1!=1);           //false

		System.out.println(10>20);       	//false
		System.out.println(10>2);           //true


		java.lang.String a = "Hello world";
		java.lang.String b = new java.lang.String("Hello world");
		System.out.println(a == b); //false 이유???
		System.out.println(a.equals(b)); //true
	}

}
