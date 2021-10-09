class ProductRunner{

public static void main (String[] args)
{
Product product =new Product("venkatesh","setwet",50f,"lmt",5);
product.displayDetail();
product.printTotalCost();

Product product1 =new Product("venky","ec",10f,"pvt",20);
product1.displayDetail();

Product.printTotalProductsPrice();
}
}