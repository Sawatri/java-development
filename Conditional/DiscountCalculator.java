import java.util.Scanner;

class DiscountCalculator{
 public static void main(String args []){

 Scanner sc = new Scanner(System.in);
 
 System.out.print("Enter orignal price :");
 float price = sc.nextFloat();

 System.out.print("Enter discount percentage :");
 float discountPercentage = sc.nextFloat();

 float discountAmount = (price*discountPercentage)/100;
 float actualPrice = price - discountAmount;
 
 System.out.println("Discount Amount is :"+discountAmount);
 System.out.print("After the disocunt actual price is:"+actualPrice);

 
 
 
 
 
}
}