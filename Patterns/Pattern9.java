class Pattern9{

public static void main(String args[]){

for(int i=7; i>=2; i-=2){
 for(int j=7; j>=i; j--){
  System.out.print(" ");
}
 for(int k=1; k<=i; k++){
  System.out.print("* ");
}
 System.out.println(" ");
}
for(int l=1; l<=7; l+=2){
 for(int m=7; m>=l; m--){
  System.out.print(" ");
}
 for(int n=1; n<=l; n++){
  System.out.print("* ");
}
 System.out.println(" ");
}
}
}