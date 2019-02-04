package bangyoon.java.eclipse;

public class Array {

	public static void main(java.lang.String[] args) {
		// array 입력방법 1
		java.lang.String[] classGroup = { "최진혁", "최유빈", "한이람", "이고잉" };
		System.out.println(classGroup[0]);
		System.out.println(classGroup[1]);
		System.out.println(classGroup[2]);
		System.out.println(classGroup[3]);
		// 오류 : System.out.println(classGroup[4]);

		
		// array 입력방법 2
		classGroup = new java.lang.String[4];
		classGroup[0] = "방   윤";
		System.out.println(classGroup.length);
		classGroup[1] = "이나연";
		System.out.println(classGroup.length);
		classGroup[2] = "박수진";
		System.out.println(classGroup.length);
		classGroup[3] = "하민주";
		System.out.println(classGroup.length);

		
		// for 문
		for (int i = 0; i < classGroup.length; i++) {
		    java.lang.String member = classGroup[i];
		    System.out.println(member + "이 예쁘다.");
		}

		
		// for-each 문
		for (java.lang.String member2 : classGroup) {
		    System.out.println(member2 + "이 천사다.");
		}
	}

}
