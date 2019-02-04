package bangyoon.java.eclipse;

public class Method {
	 public static java.lang.String numbering(int limit) {//메소드(함수) 정의
		 int i = 0;
		 java.lang.String output = "";
	     while (i < limit) {
	    	 System.out.println(i);
	    	 output += i;
	         i++;
	     }
	     return output;
	}
	 
	public static void main(java.lang.String[] args) {
		numbering(5);//메소드(함수) 호출
		
		java.lang.String result = numbering(10);
		System.out.println(result);
	}

}
