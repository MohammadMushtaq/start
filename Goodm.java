class Goodm{
static int a=2, b=5, sum;

static int add(){
sum = a+b;
return sum;
}
static int sub(){
sum = a-b;
return sum;
}
public static void main(String args[])
{
add(); 
System.out.println(sum);
sub();
System.out.println(sum);
}
}