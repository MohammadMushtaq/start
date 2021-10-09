class Product 
{
String name;
String type;
float price;
String vendor;
int quantity;
static float totalProductsPrice;

Product(String name, String type,float price,String vendor,int quantity)
{
	this.name=name;
	this.type=type;
	this.price=price;
	this.vendor=vendor;
	this.quantity=quantity;
	System.out.println("invoke 5 parameter");
}
Product(String name,float price, int quantity)
{
	this.name=name;
	this.price=price;
	this.quantity=quantity;
	System.out.println("invoke 3 const");
}
void displayDetail()
{
	System.out.print("display involked");	
	System.out.println(this.name);
	System.out.println(this.type);
	System.out.println(this.price);
	System.out.println(this.vendor);
	System.out.println(this.quantity);
}
void printTotalCost() 
{
	float total=this.price*this.quantity;
	System.out.println("TOtal cost"+total);
	totalProductsPrice=totalProductsPrice+total;
	System.out.println("total product price"+totalProductsPrice);
}
static void printTotalProductsPrice()
{
	System.out.println("total product price"+totalProductsPrice);
}
}
