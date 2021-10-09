class Login{
static int pass =456;
int password ;   
String username;
boolean submit;

public void userinfo(){
password =1234;
username="mush@786";
submit=true;
System.out.println(pass);
System.out.println(password+" "+username+" "+submit);
}
public static void main(String args[])
{
Login obj=new Login();
obj.userinfo();
System.out.println(obj.password);
System.out.println(pass);
}
}