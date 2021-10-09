class Games{
public static void main(String games[])
{
freefire("Ak47","pouchanki",5,4);
}
static void freefire(String a, String b,int c, int d)
{
String gun =a;
String location =b;
int players =c; 
int lives = d;
System.out.println(gun+" "+location+" "+players+" "+lives);
}
}