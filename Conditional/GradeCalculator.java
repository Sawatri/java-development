import java.util.Scanner;

class GradeCalculator{
 public static void main(String args []){

 Scanner s = new Scanner(System.in);
 System.out.println("Enter your marks");
 
 int marks = s.nextInt();
 
 if(marks>=80 && marks<=100){
  System.out.println("A Grade");
}else if(marks>=70 && marks<=79){
  System.out.println("B Grade");
}else if(marks>=60 && marks<=69){
  System.out.println("C Grade");
}else if(marks>=50 && marks<=59){
  System.out.println("D Grade");
}else{
  System.out.println("Fail");
}
}
}