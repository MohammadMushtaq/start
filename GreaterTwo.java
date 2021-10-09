/*class GreaterTwo
{
public static void main(String args[])
{
int a = 5,b= 10;
	if (a>b)
	{
		System.out.println("A is grester");
	}
	else
	{
		System.out.println("B is greater");
	}
}
}*/

/*class GreaterTwo
{
	public static void main (String args[])
	{
		int a= 10,b=20,c=30;
		if (a>b)
		{
			if (a>c)
		{
			System.out.println("a is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
	}	
		else if(b>c)
		{		
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
	}
}*/	

/*class GreaterTwo
{
	public static void main(String args[])
	{
		int a=10,b=20,c=30;
		if (a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		} 
}
}*/
/*class GreaterTwo
{
	public static void main (String args[])
	{
		int no= 90;
		if (no%2==0)
		{
			System.out.println("no is even");
		}
		else
		{
			System.out.println("no is odd");
		}
	}	
	}*/

/*class GreaterTwo
{
	public static void main (String args[])
	{
		int year =2017;
		if(year%4==0)
		{
			if(year%100==0)
			{
				if (year%400==0)
				{
					System.out.println(" a leap year");
				}
				else
				{
					System.out.println("not a leap year");
				}
			}
			else
			{
				System.out.println("a leap year");
			}
		}
		else 
		{
			System.out.println("not a leap year");
		}	
	}
}*/
//"&"-->the bitwise & operator always checks both 
//conditions whether first condition is true or false.
//"&&"-->The logical && operator doesn't check the second condition 
//if the first condition is false. It checks the second condition only if the first one is true.
//"|"-->The bitwise | operator always checks both conditions whether first condition is true or false.
//"||"-->The logical || operator doesn't check the second condition if the first condition is true. 
//It checks the second condition only if the first one is false.
					
class GreaterTwo
{
	public static void main (String args[])
	{
		int year =1700;
		if((year%400==0)||(year%4==0 && year%100!=0))
		{
			System.out.println("a leap year");
		}
		else
		{
			System.out.println("not a leap year");
		}
	}
	
	
}
	


