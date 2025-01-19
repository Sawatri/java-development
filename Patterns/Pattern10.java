class Pattern10{

public static void main(String args[]){

for(int i=65; i<=70; i++){
 for(int j=69; j>=i; j--){
  System.out.print(" ");
  }
 for(int k=65; k<=i; k++){
  System.out.print((char)k+" ");
  }
 System.out.println(" ");
}
 for(int l=69; l>=65; l--){
 for(int m=69; m>=l; m--){
  System.out.print(" ");
  }
 for(int n=65; n<=l; n++){
  System.out.print((char)n+" ");
  }
 System.out.println(" ");
}

}
}