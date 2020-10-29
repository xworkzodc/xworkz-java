public class ClassroomTester{


public static void main(String[] student)
{
	System.out.println("JVM invoked main");	
	System.out.println("main method args length"+student.length);	

		String desk="quality";
		Classroom.room(desk);

		Classroom.room(desk,6);

		Classroom.room(desk,"home");

		Classroom.room(10,'B',desk);


	System.out.println("EXIT :: main");	
}

} 