class IceCream{
String flavour="vinella";//literal
Color color=Color.BLUE;//literal
String type;	//constructor
float temp;		//ref
Brand brand;	//ref

IceCream(float temp)
{
	this.temp=temp;
}
IceCream(float temp,String flavor, Color color)
{
this(temp);
this.flavour=flavour;
this.color=color;
}
}