class Pattern17{
  public static void main(String args[]){

  for(int i=1; i<=5; i++){
    System.out.println(i+" "+((i*i)));
  }
System.out.println(" ");
 for(int j=1; j<=5; j++){
   System.out.println(j+" "+((j*5)-2));
  }
System.out.println(" ");
 for(int k=1; k<=5; k++){
  System.out.println(k+" "+(k*5));
 }
System.out.println(" ");
 for(int l=1; l<=5; l++){
  System.out.println((l*l)+" "+((l*l)*l*l));
 }
System.out.println(" ");
 for(int m=10; m>=2; m-=2){
  System.out.println(m+" "+(m/2));
}
System.out.println(" ");
 for(int n=5; n>=1; n--){
  System.out.println(n+" "+((n%2)+2));
}
}
}