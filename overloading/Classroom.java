public class Classroom
{


	public static void room(String desk)
	{

		System.out.println("invoked room");
		System.out.println("arg desk: "+desk);

	}
	public static void room(String desk,String chair)
	{
		System.out.println("invoked room with two parameters ");
		System.out.println("String and String");
		System.out.println("arg1 desk "+desk);
		System.out.println("arg2 chair "+chair);

	}

	public static void room(String desk,int noOfbench)
	{

		System.out.println("invoked printing with two parameters ");
		System.out.println("String and int");
		System.out.println("arg1 desk "+desk);
		System.out.println("arg2 noOfbench "+noOfbench);
	}

	public static void room(int noOfbench,String desk)
	{
		System.out.println("invoked printing with two parameters ");
		System.out.println("int and String");
		System.out.println("arg1 noOfbench "+noOfbench);
		System.out.println("arg2 desk "+desk);

	}

	public static void room(int noOfbench,char A,String desk)
	{
		System.out.println("invoked printing with three parameters ");
		System.out.println("int and char and String");
		System.out.println("arg1 noOfbench "+noOfbench);
		System.out.println("arg2 A "+A);
		System.out.println("arg3 desk "+desk);

	}



} 