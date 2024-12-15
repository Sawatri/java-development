class Laptop{

 String brand;
 int generation;
 String processorType;
 String specification;
 String color;
 double price;

 public void dutyFree(double price){
  System.out.println("This product is non taxable, subsidize by Govt");
}

 public void latestGeneration(){
 if(generation >=10 && generation <=14){
  System.out.println(generation+" "+"Generation Purchasing");
}else{
  System.out.println("Sorry!I Want to buy lastest generation laptop");
}
}

 public static void main(String args []){
 
 Laptop dell = new Laptop();
 dell.brand = "DELL";
 dell.generation = 9;
 dell.processorType = "Intel(R) Core(TM)i5-8400 CPU";
 dell.specification = "16 GB RAM , 500 GB SSD";
 dell.color = "Black";
 dell.price = 90000;
 
 
 Laptop hp = new Laptop();
 hp.brand = "Hp";
 hp.generation = 8;
 hp.processorType = "Intel Core (i3-N305)";
 hp.specification = "8 GB RAM , 256 GB SSD";
 hp.color = "Silver";
 hp.price = 108000;
 
 Laptop lenovo = new Laptop();
 lenovo.brand = "Lenovo";
 lenovo.generation = 13;
 lenovo.processorType = "Core i3 1305u Raptor Lake Processor";
 lenovo.specification = "8 GB RAM , 256 GB SSD";
 lenovo.color = "Grey";
 lenovo.price = 111500;

 Laptop apple = new Laptop();
 apple.brand = "Apple";
 apple.generation = 8;
 apple.processorType = "Apple M1 Chip";
 apple.specification = "08 GB Unified Memory, 256 GB SSD";
 apple.color = "Space Gray";
 apple.price = 210900;

 Laptop acer = new Laptop();
 acer.brand = "Acer";
 acer.generation = 10;
 acer.processorType = "Core i5 13420H Raptor Lake Processor";
 acer.specification = "8GB DDR5 SDRAM , 512 GB SSD";
 acer.color = "Black";
 acer.price = 247000;

 System.out.println("........Laptop........");
 System.out.println("Company Name :"+" "+dell.brand);
 System.out.println("Generation :"+" "+dell.generation);
 System.out.println("Processor Type :"+" "+dell.processorType);
 System.out.println("Specification :"+" "+dell.specification);
 System.out.println("Color :"+" "+dell.color);
 System.out.println("Price Rs:"+" "+dell.price);
 dell.dutyFree(dell.price);
 dell.latestGeneration();


 System.out.println(" ");
 System.out.println("Company Name :"+" "+hp.brand);
 System.out.println("Generation :"+" "+hp.generation);
 System.out.println("Processor Type :"+" "+hp.processorType);
 System.out.println("Specificaation :"+" "+hp.specification);
 System.out.println("Color :"+" "+hp.color);
 System.out.println("Price Rs:"+" "+hp.price);
 hp.dutyFree(hp.price);
 hp.latestGeneration();

 System.out.println(" ");
 System.out.println("Company Name :"+" "+lenovo.brand);
 System.out.println("Generation :"+" "+lenovo.generation);
 System.out.println("Processor Type :"+" "+lenovo.processorType);
 System.out.println("Specification :"+" "+lenovo.specification);
 System.out.println("Color :"+" "+lenovo.color);
 System.out.println("Price Rs:"+" "+lenovo.price);
 lenovo.dutyFree(lenovo.price);
 lenovo.latestGeneration();

 System.out.println(" ");
 System.out.println("Company Name :"+" "+apple.brand);
 System.out.println("Generation :"+" "+apple.generation);
 System.out.println("Processor Type :"+" "+apple.processorType);
 System.out.println("Specification :"+" "+apple.specification);
 System.out.println("Color :"+" "+apple.color);
 System.out.println("Price Rs:"+" "+apple.price);
 apple.dutyFree(apple.price);
 apple.latestGeneration();

 System.out.println(" ");
 System.out.println("Company Name :"+" "+acer.brand);
 System.out.println("Generation :"+" "+acer.generation);
 System.out.println("Processor Type :"+" "+acer.processorType); 
 System.out.println("Specification :"+" "+acer.specification);
 System.out.println("Color :"+" "+acer.color);
 System.out.println("Price Rs:"+""+acer.price);
 acer.dutyFree(acer.price);
 acer.latestGeneration();
}
}