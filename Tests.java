class Tests
{
int i=10;
String s= "name";
Tests()
{
	System.out.println("no arg constructor");
}
Tests (int ab)
{
	System.out.println(ab);
}
public static void main(String[] arga)
{
Tests t = new Tests();
Tests ab = new Tests(65);
//Tests();
System.out.println(t.i+""+ t.s);
}
}