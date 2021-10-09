class MiPhonepayStarter{
public static void main(String [] args)
{
	MiPhone phone=new MiPhone();
	phone.setBrand("gionee");
	phone.setPrice(2500);
	phone.setColor("red");
	phone.setImei(21545445415f);
	System.out.println(phone.brand);
	System.out.println(phone.price);
	System.out.println(phone.color);
	System.out.println(phone.imei);
	
	Phoneepay num=new Phoneepay();
	num.setCompany("recharge");
	num.setVersion("20.3");
	num.setArchitect("naveen");
	num.setWorking(true);
	System.out.println(num.company);
	System.out.println(num.version);
	System.out.println(num.architect);
	System.out.println(num.working);
	
}
}