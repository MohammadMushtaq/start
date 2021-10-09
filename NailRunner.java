class NailRunner{

public static void main(String[] args)
{
NailCutter n1=new NailCutter();
n1.cutterName ="vega";
n1.price = 10;
n1.size=CutterSize.BIG;
n1.nailcut();
n1.cleanNail();

}
}