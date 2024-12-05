class Car{

 String vehicleName, companyName, color, model, price;

 public static void main(String args []){;
 
 Car yaris = new Car();
 yaris.vehicleName = "Yaris";
 yaris.companyName = "Toyota";
 yaris.color = "Black";
 yaris.model = "2024";
 yaris.price = "4,479,000";

 Car audiA4 = new Car();
 audiA4.vehicleName = "Audi A4"; 
 audiA4.companyName = "Audi";
 audiA4.color = "White";
 audiA4.model = "2023";
 audiA4.price = "9,600,000";

 Car tesla = new Car();
 tesla.vehicleName = "Tesla Model Y";
 tesla.companyName = "Tesla";
 tesla.color = "Gray";
 tesla.model = "2025";
 tesla.price = "3.5 crore";

 Car civic = new Car();
 civic.vehicleName = "Civic";
 civic.companyName = "Honda";
 civic.color = "White";
 civic.model = "2024";
 civic.price = "86 lacs";

 Car bmwX7 = new Car();
 bmwX7.vehicleName = "BMWX7";
 bmwX7.companyName = "BMW";
 bmwX7.color = "Blue";
 bmwX7.model = "2024";
 bmwX7.price = "2.9 crore";



 System.out.println("Cars Company");
 System.out.println("Vehicle Name :"+""+yaris.vehicleName);
 System.out.println("Company Name :"+" "+yaris.companyName);
 System.out.println("Car Color :"+" "+yaris.color);
 System.out.println("Model :"+" "+yaris.model);
 System.out.println("Price Rs:"+" "+yaris.price);

 System.out.println(" ");
 System.out.println("Vehicle Name :"+" "+audiA4.vehicleName);
 System.out.println("Company Name :"+" "+audiA4.companyName);
 System.out.println("Car Color :"+" "+audiA4.color);
 System.out.println("Model :"+" "+audiA4.model);
 System.out.println("Price Rs:"+" "+audiA4.price);
 
 System.out.println(" ");
 System.out.println("Vehicle Name :"+" "+tesla.vehicleName);
 System.out.println("Company Name :"+" "+tesla.companyName);
 System.out.println("Car Color :"+" "+tesla.color);
 System.out.println("Model :"+" "+tesla.model);
 System.out.println("Price Rs:"+" "+tesla.price);

 System.out.println(" ");
 System.out.println("Vehicle Name :"+" "+civic.vehicleName);
 System.out.println("Company Name :"+" "+civic.companyName);
 System.out.println("Car Color :"+" "+civic.color);
 System.out.println("Model :"+" "+civic.model);
 System.out.println("Price Rs:"+" "+civic.price);
 
 System.out.println(" ");
 System.out.println("Vehicle Name :"+" "+bmwX7.vehicleName);
 System.out.println("Company Name :"+" "+bmwX7.companyName);
 System.out.println("Car Color :"+" "+bmwX7.color);
 System.out.println("Model :"+" "+bmwX7.model);
 System.out.println("Price Rs:"+" "+bmwX7.price);


}
}