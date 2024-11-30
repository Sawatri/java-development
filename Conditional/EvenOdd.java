import java.util.Scanner;
class EvenOdd{
 public static void main(String args[]){

 Scanner s = new Scanner(System.in);
 System.out.println("Enter number");

 int num = s.nextInt();

 if(num%2 == 0){
   System.out.println(num+" "+"even number");
 
 }else{
  System.out.println(num+" "+"odd number");
}
}
}