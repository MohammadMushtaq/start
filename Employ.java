class Employ
{
	String name;
	int emp_id;
	
	Employ (String name, int emp_id)
	{
		//this.name=name;				// paramertic constructer
		//this.emp_id = emp_id;
	}
	public static void main(String args[])
	{
		Employ e1=new Employ("mush",10);
		Employ e2=new Employ("ravi", 20);
		System.out.println("Employee 1"+e1.name+" "+e1.emp_id);
		System.out.println("Employee 2"+e2.name+" "+e2.emp_id);
	}	
}	