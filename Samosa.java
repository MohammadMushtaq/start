class Samosa
{
float cost;
boolean taste;
SamosaSize size;
String [] ingridents;

Samosa(float cost,boolean taste)
{
System.out.println("created by float,boolean ");
this.cost=cost;
this.taste=taste;						//chain constructor
}

Samosa(SamosaSize size,String[] ingridents)
{
System.out.println("created by samasaSize size,String ");
this.size=size;
this.ingridents=ingridents;
}

Samosa(float cost,boolean taste,SamosaSize size,String[] ingridents)
{
		this(cost,taste);
		 this.size=size;
		 this.ingridents=ingridents;
		System.out.println("created by float,boolean, samasaSize size,String[] ");
}
}