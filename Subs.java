class Subs
{
static int a = 10;
static int b = 10;
static int sum;

static int add()
{
int sum = a+b;
return   sum;
}
static  int sub()
{
int sum = a-b;
return  sum;
}

public static void main(String args[])
{
add();
sub();
System.out.println("adding number"+sum);
System.out.println("substracting"+sum);
}}