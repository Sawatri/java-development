class AirConditioner{

String companyName, size;
double price;

 public static void main(String args []){
 
 AirConditioner gree = new AirConditioner();
 gree.companyName = "Gree Electric";
 gree.size = "1.5 Ton";
 gree.price = 176999;

 AirConditioner panasonic = new AirConditioner();
 panasonic.companyName = "Panasonic";
 panasonic.size = "2 Ton";
 panasonic.price = 255000;

 AirConditioner dawlance = new AirConditioner();
 dawlance.companyName = "Dawlance";
 dawlance.size = "1 Ton";
 dawlance.price = 135214;

 AirConditioner orient = new AirConditioner();
 orient.companyName = "Orient";
 orient.size = "2.5 Ton";
 orient.price = 354500;

 AirConditioner haier = new AirConditioner();
 haier.companyName = "Haier";
 haier.size = "1.5 Ton";
 haier.price = 176999;


 System.out.println(">>>>>AIR CONDITIONER COMPANIES<<<<<<");
 System.out.println("Company Name :"+" "+gree.companyName);
 System.out.println("Size :"+" "+gree.size);
 System.out.println("Price :"+" "+gree.price);

 System.out.println(" ");
 System.out.println("Company Name :"+" "+gree.companyName);
 System.out.println("Size :"+" "+gree.size);
 System.out.println("Price :"+" "+gree.price);

 System.out.println(" ");
 System.out.println("Company Name :"+" "+panasonic.companyName);
 System.out.println("Size :"+" "+panasonic.size);
 System.out.println("Price :"+" "+panasonic.price);

 System.out.println(" ");
 System.out.println("Company Name :"+" "+dawlance.companyName);
 System.out.println("Size :"+" "+dawlance.size);
 System.out.println("Price :"+" "+dawlance.price);

 System.out.println(" ");
 System.out.println("Company Name :"+" "+orient.companyName);
 System.out.println("Size :"+" "+orient.size);
 System.out.println("Price :"+" "+orient.price);

 System.out.println(" ");
 System.out.println("Company Name :"+" "+haier.companyName);
 System.out.println("Size :"+" "+haier.size);
 System.out.println("Price :"+" "+haier.price);





}
}