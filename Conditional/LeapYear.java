import java.util.Scanner;
class LeapYear{
public static void main(String args []){
 
 Scanner s = new Scanner(System.in);
 System.out.println("Enter Year");

 int year = s.nextInt();
 
 if(year%4 ==0){
  System.out.println(year+" "+"Leap Year");
}
else{
  System.out.println(year+" "+"not Leap Year");
}

}
}