package bangyoon.java.eclipse;

public class 반복문 {

	public static void main(java.lang.String[] args) {
		int i = 0; // i가 10보다 작으면 true, 크면 false
		while(i<10){         
		    System.out.println("while "+i);
		    i++;
		}
		
		for (i = 0; i < 10; i++) {
            if(i == 4)
            	continue;
            if(i == 6)
            	break;
            
            System.out.println("for " + i);
        }
	}
}
