import java.util.Scanner;

class NumberFallsRange{
 public static void main(String args []){

  Scanner range = new Scanner(System.in);
 
  System.out.println("Enter Number range 10 to 50");
  int number = range.nextInt();

  if(number>=10 && number<=50){
   System.out.println("Number in range");
} else{
   System.out.println("Number is out of range");
}
}
}