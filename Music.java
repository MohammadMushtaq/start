class Music{
String texture="sharp";
float duration;
boolean melody;
String pitch;

void melody ()
{
	boolean melo = true;
System.out.println(" melody "+melo);
}

Music (float duration)
{
	this.duration =duration;
System.out.println("time "+duration);
}

Music (String pitch)
{
this.pitch=pitch;
System.out.println("like its "+this.pitch);
}
}
