class FruitItems
{
String name;
float price;
String hotelname;
int quantity;
Type type;
int rating;
OrderType ordertype; 
static float totalFoodItemPrice;

FruitItems(String name,float price,String hotelname,int quantity,Type type,int rating,OrderType ordertype)
{
	this.name=name;
	this.price=price;
	this.hotelname=hotelname;
	this.quantity=quantity;
	this.type=type;
	this.rating =rating;
	this.ordertype=ordertype;
}

void Displaydetail()
{
	System.out.println("invoke det");
	System.out.println(this.name);
	System.out.println(this.price);
	System.out.println(this.hotelname);
	System.out.println(this.quantity);
	System.out.println(this.type);
	System.out.println(this.rating);
	System.out.println(this.ordertype);
}
void printTotalPrice()
{
	float total= this.price*this.quantity;
	System.out.println("TOtal cost"+total);
	//totalFoodItemPrice=totalFoodItemPrice+total;
	//System.out.println("total items prices"+totalFoodItemPrice);

}
static void printTotalFoodItemsprice()
{
System.out.println("total items price"+totalFoodItemPrice);
}
void printHotelName()
{
	System.out.println(this.name);
	System.out.println(this.price);
}
}