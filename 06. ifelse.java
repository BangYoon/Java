package bangyoon.java.eclipse;

public class ifelse {

	public static void main(java.lang.String[] args) {
		/*
		 if (false) {
	            System.out.println(1);
	        } else if (true) {
	            System.out.println(2);
	        } else if (true) {
	            System.out.println(3);
	        } else {
	            System.out.println(4);
	        }
		 */ // result : 2
		
		 java.lang.String id = args[0];
	        if(id.equals("bangyoon")){ // equal true면 출력
	            System.out.println("right");
	        } else {
	            System.out.println("wrong");
	        }
	}
}
