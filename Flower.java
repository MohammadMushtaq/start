class Flower
{
String name;
int type;
public static void main(String args[])
{
Flower f1=new Flower ("rose",2);
Flower f2=new Flower ("lilly",5);
System.out.println(f1.name+" "+f1.type); 
System.out.println(f2.name+" "+f2.type);
}
Flower (String name,int type)
{
this.name=name;
this.type=type; 
}
}
