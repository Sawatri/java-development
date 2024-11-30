import java.util.Scanner;
class TriangleType{
 public static void main(String args []){

 int length1, 
     length2, 
     length3;
 Scanner s = new Scanner(System.in);
 System.out.println("Enter three sided length of a triangle");
 System.out.println("Enter length");
 length1 = s.nextInt();
 length2 = s.nextInt();
 length3 = s.nextInt();

 if(length1 == length2 && length2 == length3){
   System.out.println("Equilateral Triangle");
}else if(length1 == length2 && length2 != length3){
   System.out.println("Isosceles Triangle");
}else{
   System.out.println("Scalene Triangle");
}

}
}