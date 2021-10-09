class localVM{
static String name = "Globle";//global var access from anywhere
private String state="state";
public static void main(String args[])
{
	localVM a= new localVM();
	a.state="karnataka";
	a.first();
	a.second();
	System.out.println();
	localVM b= new localVM();
	b.state="Delhi";
	b.first();
	b.second();
}
 void first()
{
String gender = "male";
System.out.println(" ll"+ gender);
System.out.println(" instance vriable "+ state);
System.out.println(" this is globle variable we can access it"+name);
}

 void second ()
 {
String name2= "Second local";
System.out.println(" this is second method");
System.out.println(" instance vriable "+ state);
System.out.println(" this is another method global variable"+ name);
System.out.println(" calling localvariable"+name2);

}
} 