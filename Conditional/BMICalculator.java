import java.util.Scanner;
class BMICalculator{
 public static void main(String args []){

 Scanner s = new Scanner(System.in);
  
 System.out.println("Enter your body weight:");
 float weight = s.nextFloat();

 System.out.println("Enter your height in meters");
 float height = s.nextFloat();
 float BMI = weight/(height*height);
 
 if(BMI<18.5){
  System.out.println(BMI+":Underweight"); 
}else if(BMI>=18.5 && BMI<=24.9){
  System.out.println(BMI+":Normal");
}else{
  System.out.println(BMI+":Overweight");
}

}
}