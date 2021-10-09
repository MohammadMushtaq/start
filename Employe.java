/*class Employe
{
	String name = "deepak";
	int emp_id = 101;
										// 1st reference variable
	public static void main(String args[])
	{
		Employ e1=new Employ();
		Employ e2=new Employ();
		//System.out.println("Employee 1"+e1.name+" "+e1.emp_id);
		//System.out.println("Employee 2"+e2.name+" "+e2.emp_id);
	}	
}	*/
class Employe
{
	String name;
	int emp_id;					// method type
	
	
	
	public static void main(String args[])
	{
		Employe e1= new Employe();
		e1.name="mush";
		e1.emp_id =101;
		Employe e2= new Employe();
		e2.name="ravi";
		e2.emp_id =102;
		System.out.println("Employee 1"+e1.name+" "+e1.emp_id);
		System.out.println("Employee 2"+e2.name+" "+e2.emp_id);
	}	
}	