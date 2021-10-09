class GrinderRunner
{
public static void main (String[] args)
{
Grinder mot1=new Grinder(120,"bajaj");
System.out.println(mot1.capacity);
System.out.println(mot1.company);

Motor mot =mot1.mot;
String model="vane";
int rpm=4000;
System.out.println(mot.model);
System.out.println(mot.rpm);
}
}