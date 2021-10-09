class Ghost{
void Ghost()
{
System.out.println("this is default constructor");
}
void Ghost(String name){
System.out.println("this is paramertise constructor"+ " "+name);
}
public static void main(String args[])
{
Ghost obj1=new Ghost();
obj1.Ghost();
obj1.Ghost("yakshini");
}
}
