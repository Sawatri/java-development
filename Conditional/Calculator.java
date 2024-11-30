import java.util.Scanner;
class Calculator{
 public static void main(String args []){

 System.out.println("1. Addition");
 System.out.println("2. Subtraction");
 System.out.println("3. Multiplication");
 System.out.println("4. Division");

 Scanner s = new Scanner(System.in);

 System.out.println("Enter Your Choice"); 
 int choice = s.nextInt();

 System.out.print("Enter first number:");
 int num1 = s.nextInt();

 System.out.print("Enter Second number:");
 int num2 = s.nextInt();

 if(choice==1){
  System.out.println("Your answer is:"+(num1+num2));
} else if(choice==2){
  System.out.println("Your answer is:"+(num1-num2));
}else if(choice==3){
  System.out.println("Your answer is:"+(num1*num2));
}else if(choice==4){
  System.out.println("Your answer is:"+(num1/num2));
}else {
  System.out.println("Wrong choice");
}
}
}
