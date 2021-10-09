class SocialMediaAppStarter
{
public static void main (String[] args)
{
SocialMediaApp media=new SocialMediaApp();
media.setName("insta");
media.setSize(25);
media.setPlateform("206.23450.5");
System.out.println(media.name);  
System.out.println(media.size);
System.out.println(media.plateform);

Company company=new Company();
company.setName("fb");
company.setNoOfEmployee(25);    
System.out.println(company.name); 
 System.out.println(company.noOfEmployee);    
}
}