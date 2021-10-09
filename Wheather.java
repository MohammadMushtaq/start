class Wheather{
static String temp="cold";
String Cloudyness;
String visibility;
boolean winds;

static void temp()
{
System.out.println(" wheather "+temp);
}
void feel()
{
	String cloudyness =" good";
System.out.println(" wheather "+cloudyness);
}

Wheather (String visibility)
{
this.visibility=visibility;
System.out.println(" wheather "+visibility);
}
Wheather(boolean winds)
{
this.winds=winds;
System.out.println(" wheather "+this.winds);
}
}