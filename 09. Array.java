package bangyoon.java.eclipse;

public class Array {

	public static void main(java.lang.String[] args) {
		java.lang.String[] classGroup = { "최진혁", "최유빈", "한이람", "이고잉" };
        System.out.println(classGroup[0]);
        System.out.println(classGroup[1]);
        System.out.println(classGroup[2]);
        System.out.println(classGroup[3]);
        
        classGroup = new java.lang.String[4];
        classGroup[0] = "방윤";
        System.out.println(classGroup.length);
        classGroup[1] = "이나연";
        System.out.println(classGroup.length);
        classGroup[2] = "박수진";
        System.out.println(classGroup.length);
        classGroup[3] = "하민주";
        System.out.println(classGroup.length);
	}

}
