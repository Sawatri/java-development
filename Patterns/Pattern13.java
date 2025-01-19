import java.util.Scanner;
class Pattern13{

   public static void main(String args[]){

    System.out.print("Enter a number: ");
    Scanner pat = new Scanner(System.in);
    int rows = pat.nextInt();

      for(int i=1; i<=rows; i++){
         for(int k=2*(rows -i); k>=1; k--){
            System.out.print(" ");
         }
       for(int k=1; k<=i; k++){
         System.out.print("* ");
       }
     System.out.println(" ");
   }
   
   for(int l=rows; l>=1; l--){
      for(int m=2*(rows-l); m>=1; m--){
            System.out.print(" ");
        }
    for(int n=1; n<=l; n++){
      System.out.print("* ");
   }
     System.out.println(" ");
  }
}
}