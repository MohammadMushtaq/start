class Grinder
{
int capacity;
String company;
Motor mot =new Motor(); 

Grinder(int capacity, String company)
{
this.capacity=capacity;
this.company=company;
System.out.println("invoke");

}
}