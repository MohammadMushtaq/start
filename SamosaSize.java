enum SamosaSize
{
	SMALL,MEDIUM,BIG;
}

/*enum Color			//outside class
						//enum keyword instead of class
    RED, GREEN, BLUE;
}
 
public class Test
{
    // Driver method
    public static void main(String[] args)
    {
        Color c1 = Color.RED;
        System.out.println(c1);
    }
}*/
// enum declaration inside a class.
/*public class Test
{
	enum Color
	{
		RED, GREEN, BLUE;
	}

	// Driver method
	public static void main(String[] args)
	{
		Color c1 = Color.RED;
		System.out.println(c1);
	}
}*/

enum Day
{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY;
}
 
// Driver class that contains an object of "day" and
// main().
/*public class Test
{
    Day day;
 
    // Constructor
    public Test(Day day)
    {
        this.day = day;
    }
 
    // Prints a line about Day using switch
   
  public void dayIsLike()
    {
        switch (day)
        {
        case MONDAY:
            System.out.println("Mondays are bad.");
            break;
        case FRIDAY:
            System.out.println("Fridays are better.");
            break;
        case SATURDAY:
        case SUNDAY:
            System.out.println("Weekends are best.");
            break;
        default:
            System.out.println("Midweek days are so-so.");
            break;
        }
    }
 
    // Driver method
    public static void main(String[] args)
    {
        String str = "MONDAY";
        Test t1 = new Test(Day.valueOf(str));
        t1.dayIsLike();
    }
}*/









