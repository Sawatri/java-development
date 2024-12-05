class WashingMachine{

String companyName, capacity, color;
double price;

 public static void main(String args []){

 WashingMachine dawlance = new WashingMachine();
 dawlance.companyName = "Dawlance";
 dawlance.capacity = "20 kg";
 dawlance.color = "Black";
 dawlance.price = 98000;

 WashingMachine haier = new WashingMachine();
 haier.companyName = "Haier";
 haier.capacity = "12 kg";
 haier.color = "Green & White";
 haier.price = 55000;

 WashingMachine kenwood = new WashingMachine();
 kenwood.companyName = "Kenwood";
 kenwood.capacity = "15 kg";
 kenwood.color = "White";
 kenwood.price = 120000;

 WashingMachine lg = new WashingMachine();
 lg.companyName = "LG";
 lg.capacity = "18 kg";
 lg.color = "Gray";
 lg.price = 210000;

 WashingMachine samsung = new WashingMachine();
 samsung.companyName = "Samsung";
 samsung.capacity = "20 kg";
 samsung.color = "Black";
 samsung.price = 225000;

 System.out.println(">>>>>>>WASHING MACHINE COMPANIES<<<<<<");
 System.out.println("Company Name :"+" "+dawlance.companyName);
 System.out.println("Capacity"+" "+dawlance.capacity);
 System.out.println("Color :"+" "+dawlance.color);
 System.out.println("Price"+" "+dawlance.price);

 System.out.println(" ");
 System.out.println("Company Name :"+" "+haier.companyName);
 System.out.println("Capacity"+" "+haier.capacity);
 System.out.println("Color :"+" "+haier.color);
 System.out.println("Price"+" "+haier.price);

 System.out.println(" ");
 System.out.println("Company Name :"+" "+kenwood.companyName);
 System.out.println("Capacity"+" "+kenwood.capacity);
 System.out.println("Color :"+" "+kenwood.color);
 System.out.println("Price"+" "+kenwood.price);

 System.out.println(" ");
 System.out.println("Company Name :"+" "+lg.companyName);
 System.out.println("Capacity"+" "+lg.capacity);
 System.out.println("Color :"+" "+lg.color);
 System.out.println("Price"+" "+lg.price);

 System.out.println(" ");
 System.out.println("Company Name :"+" "+samsung.companyName);
 System.out.println("Capacity"+" "+samsung.capacity);
 System.out.println("Color :"+" "+samsung.color);
 System.out.println("Price"+" "+samsung.price);

}
}