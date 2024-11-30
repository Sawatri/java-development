import java.util.Scanner;
class LargestNumber{
 public static void main(String args []){

 Scanner s = new Scanner(System.in);
 
 System.out.print("Enter fisrt number");
 int num1  = s.nextInt();
 
 System.out.print("Enter second number");
 int num2 = s.nextInt();

 System.out.print("Enter third number");
 int num3 = s.nextInt();


 if(num1>num2 && num1>num3){
  System.out.println("Num1 Largest");
}else if(num2>num1 && num2>num3){
  System.out.println("Num2 Largest");
}else{
  System.out.println("Num3 Largest");
}
 
 
}
}