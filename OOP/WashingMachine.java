class WashingMachine{

String companyName,color;
double price;
int capacity;

 public void totalPrice(double price){
 double tax = price*0.20;
 double afterTaxPrice = price + tax;
 System.out.println("Included tax price is : "+afterTaxPrice);
}

 public void largeCapacity(){
 if(capacity <=12){
  System.out.println("Buying"+" "+companyName+"Company Washing Machine");
}else{
  System.out.println("Not reuqire less capacity Washing Machine");
}
}

 public static void main(String args []){

 WashingMachine dawlance = new WashingMachine();
 dawlance.companyName = "Dawlance";
 dawlance.capacity = 19;
 dawlance.color = "Black";
 dawlance.price = 98000;

 WashingMachine haier = new WashingMachine();
 haier.companyName = "Haier";
 haier.capacity = 9;
 haier.color = "Green & White";
 haier.price = 55000;

 WashingMachine kenwood = new WashingMachine();
 kenwood.companyName = "Kenwood";
 kenwood.capacity = 18;
 kenwood.color = "White";
 kenwood.price = 120000;

 WashingMachine lg = new WashingMachine();
 lg.companyName = "LG";
 lg.capacity = 12;
 lg.color = "Gray";
 lg.price = 210000;

 WashingMachine samsung = new WashingMachine();
 samsung.companyName = "Samsung";
 samsung.capacity = 10;
 samsung.color = "Black";
 samsung.price = 225000;

 System.out.println(">>>>>>>WASHING MACHINE COMPANIES<<<<<<");
 System.out.println("Company Name :"+" "+dawlance.companyName);
 System.out.println("Capacity"+" "+dawlance.capacity);
 System.out.println("Color :"+" "+dawlance.color);
 System.out.println("Price"+" "+dawlance.price);
 dawlance.totalPrice(dawlance.price);
 dawlance.largeCapacity();

 System.out.println(" ");
 System.out.println("Company Name :"+" "+haier.companyName);
 System.out.println("Capacity"+" "+haier.capacity);
 System.out.println("Color :"+" "+haier.color);
 System.out.println("Price"+" "+haier.price);
 haier.totalPrice(haier.price);
 haier.largeCapacity();

 System.out.println(" ");
 System.out.println("Company Name :"+" "+kenwood.companyName);
 System.out.println("Capacity"+" "+kenwood.capacity);
 System.out.println("Color :"+" "+kenwood.color);
 System.out.println("Price"+" "+kenwood.price);
 kenwood.totalPrice(kenwood.price);
 kenwood.largeCapacity();

 System.out.println(" ");
 System.out.println("Company Name :"+" "+lg.companyName);
 System.out.println("Capacity"+" "+lg.capacity);
 System.out.println("Color :"+" "+lg.color);
 System.out.println("Price"+" "+lg.price);
 lg.totalPrice(lg.price);
 lg.largeCapacity();

 System.out.println(" ");
 System.out.println("Company Name :"+" "+samsung.companyName);
 System.out.println("Capacity"+" "+samsung.capacity);
 System.out.println("Color :"+" "+samsung.color);
 System.out.println("Price"+" "+samsung.price);
 samsung.totalPrice(samsung.price);
 samsung.largeCapacity();

}
}