class IcecreamStarter
{
public static void main (String []args)
{
IceCream cream;
cream =new IceCream(-20,"choco",Color.YELLOW);
System.out.println(cream);
System.out.println(cream.temp);
System.out.println(cream.flavour);
System.out.println(cream.color);
System.out.println(cream.brand);
System.out.println(cream.type);
cream.type = "cone";
System.out.println(cream.type);

cream.brand=new Brand();
System.out.println(cream.brand);
System.out.println(cream);

String fla=cream.flavour;
System.out.println(fla);

float temp=cream.temp;
Brand brand = cream.brand;
String name = brand.name;
String location = brand.location;
String oname=brand.ownername;
int since= brand.since;
System.out.println(name);
System.out.println(location);
System.out.println(since);
System.out.println(oname);
brand.name ="naturals";
brand.ownername="cool";
brand.since=1948;
System.out.println(name);
System.out.println(location);
System.out.println(oname);
System.out.println(since);
cream.brand.name=null;
System.out.println(brand.name);
cream.brand=null;
//System.out.println(cream.brand.location);
System.out.println(brand.location);
}
}
