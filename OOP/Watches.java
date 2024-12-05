class Watches{

String brandName, color, price;

 public static void main(String args []){

 Watches rolex = new Watches();
 rolex.brandName = "Rolex";
 rolex.color = "Golden";
 rolex.price = "$70,000";

 Watches cartier = new Watches();
 cartier.brandName = "Cartier";
 cartier.color = "Silver";
 cartier.price = "$256,000";

 Watches omega = new Watches();
 omega.brandName = "Omega";
 omega.color = "Copper";
 omega.price = "$15,000";

 Watches panerai = new Watches();
 panerai.brandName = "Panerai";
 panerai.color = "Brown";
 panerai.price = "$26,000";
 
 Watches seveston = new Watches();
 seveston.brandName = "Seveston";
 seveston.color = "Silver";
 seveston.price = "25,000";

 System.out.println("Watches");
 System.out.println("Brand Name :"+" "+rolex.brandName);
 System.out.println("Color :"+""+rolex.color);
 System.out.println("Price Rs:"+" "+rolex.price);
 
 System.out.println(" ");
 System.out.println("Brand Name :"+" "+cartier.brandName);
 System.out.println("Color :"+""+cartier.color);
 System.out.println("Price Rs:"+" "+cartier.price);

 System.out.println(" ");
 System.out.println("Brand Name :"+" "+omega.brandName);
 System.out.println("Color :"+""+omega.color);
 System.out.println("Price Rs:"+" "+omega.price);

 System.out.println(" ");
 System.out.println("Brand Name :"+" "+panerai.brandName);
 System.out.println("Color :"+""+panerai.color);
 System.out.println("Price Rs:"+" "+panerai.price);

 System.out.println(" ");
 System.out.println("Brand Name :"+" "+seveston.brandName);
 System.out.println("Color :"+""+seveston.color);
 System.out.println("Price Rs:"+" "+seveston.price);




} 
}