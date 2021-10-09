class Projectmech123{
private String state = "karnataka";
public static void main(String args[]){
Projectmech123 a= new Projectmech123();
//a.state = "Karanataka";
a.fsw();
}								//instance working
 void fsw()
{
System.out.println(" instance vriable "+ state);
System.out.println("friction stir welding");
aim();
}
 void aim(){
System.out.println("strong bond");
material();
}
 void material(){
System.out.println("alluminum alloy");
machine();
}
 void machine(){
System.out.println("FSW Machine");
reinenfrocement();
}
 void reinenfrocement(){
System.out.println("silicon powder");
}
}