class FruitItemsStarter
{
public static void main (String[] args)
{
FruitItems fruit=new FruitItems("Apple",20f,"juicecenter",2,Type.TROPICAL,4,OrderType.ONLINE);
fruit.Displaydetail();
fruit.printTotalPrice();
fruit.printHotelName();

FruitItems fruit01 = new FruitItems("orange",30f,"juicecenter1",3,Type.BERRIES,5,OrderType.OFFLINE);
fruit01.Displaydetail();
fruit01.printTotalPrice();

FruitItems.printTotalFoodItemsprice();

}
}
