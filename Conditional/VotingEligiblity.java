import java.util.Scanner;

class VotingEligiblity{
 public static void main(String args []){

 Scanner eligible = new Scanner(System.in);
 
 System.out.println("Enter your age:");
 int age = eligible.nextInt();

 if(age>=18){
  System.out.println("You are eligible for voting");
}else{
  System.out.println("Sorry! You are not eligible for voting");
}
}
}