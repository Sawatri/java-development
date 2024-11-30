import java.util.Scanner;
class PositiveNegative{
 public static void main(String args []){
 
 Scanner s = new Scanner(System.in);
 System.out.println("Enter number");

 int number = s.nextInt();

 if(number>0){
  System.out.println(number+" "+"Positive Number");
}else if(number<0){
  System.out.println(number+" "+"Negative Number");
}else{
  System.out.println(number+" "+"Zero");
}

}
}