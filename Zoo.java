class Zoo
{
String mush = "word";
Zoo()
{
System.out.println("welcome to the Zoo");
}
void herbiviours()
{
String owner = "naveen";
String name="rabbit";
double weight = 2.5d;
String dob= "1-1-2000";
String dod= "1-1-2001";
System.out.println("owner name"+owner);
System.out.println("animal name"+name);
System.out.println("its weight"+weight);
System.out.println("birth"+dob);
System.out.println("death"+dod);
}
void carnivirious()
{
String owner = "ravi";
String name="lion";
double weight = 150d;
String dob= "1-1-1990";
String dod= "1-1-2000"; 
System.out.println("owner name"+mush);
System.out.println("owner name"+owner);
System.out.println("animal name"+name);
System.out.println("its weight"+weight);
System.out.println("birth"+dob);
System.out.println("death"+dod);
}
Zoo(String name)
{
System.out.println("byebye to the Zoo"+name);
}
public static void main(String args[])
{
Zoo obj123 =new Zoo();
obj123.herbiviours();
obj123.herbiviours();
obj123.carnivirious();
Zoo sis = new Zoo("End");
System.out.println("owner name"+obj123.mush);
}
}
