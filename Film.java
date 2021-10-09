class Film{
Film()
{
String mov= "bahu";
System.out.println("i like the movie"+mov);
}
void names()
{
String name= "monday";
System.out.println("film" +name);
}
void owner()
{
String owner= "naveen";
System.out.println("theater owner name" +owner);
}
void gst()
{
int gsts =1223454;
System.out.println("gst number" +gsts);
}
void values()
{
int numberOfshows= 2;
int numberofseats=25;
boolean parking= true;
double movierating= 5.4d;
String location ="btm";
int showtime=10;
int noofscreen=5;
System.out.println("no of show "+numberOfshows);
System.out.println("seat" +numberofseats);
System.out.println("parking"+parking);
System.out.println("mrating" +movierating);
System.out.println("loaction" +location);
System.out.println("shoetime"+showtime);
System.out.println("no ofsreen"+noofscreen);
}

public static void main(String args[])
{
Film sos =new Film();
sos.names();
sos.owner();
sos.gst();
sos.values();
}
}






