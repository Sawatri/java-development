import java.util.Scanner;
class Pattern8{

public static void main(String args[]){

System.out.print("Enter number");
Scanner sc = new Scanner(System.in);
int rows = sc.nextInt();

for(int i=1; i<=rows; i++){
 for(int k=rows; k>=i; k--){
  System.out.print(" ");
}
 for(int j=1; j<=i; j++){
  System.out.print("* ");
}
 System.out.println(" ");
}
for(int l=rows; l>=1; l--){
 for(int m=rows; m>=l; m--){
  System.out.print(" ");
}
 for(int n=1; n<=l; n++){
  System.out.print("* ");
}
 System.out.println(" ");
}

}
}