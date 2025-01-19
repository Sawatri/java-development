import java.util.Scanner;
class Pattern14{
  public static void main(String args[]){

  System.out.print("Enter number: ");
  Scanner sc = new Scanner(System.in);
  int rows = sc.nextInt();

  for(int i=rows; i>=2; i--){
    for(int j=2*(rows-i); j>=1; j--){
        System.out.print(" ");
      }
  for(int k=1; k<=i; k++){
   System.out.print("* ");
  }
   System.out.println(" ");
   }
  for(int l=1; l<=rows; l++){
   for(int m=2*(5-l); m>=1; m--){
     System.out.print(" ");
   } 
  for(int n=1; n<=l; n++){
    System.out.print("* ");
    }
  System.out.println(" ");
  }

 }
}