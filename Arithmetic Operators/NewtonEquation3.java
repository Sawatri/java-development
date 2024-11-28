class NewtonEquation3{
 public static void main(String [] args){
 
 int u = 31;
 float t = 1.2f;
 int a = 2;
 float s = (float) u*t+1/2*a;
 s += t*t;
 System.out.println("Newton 3rd Eq"+" "+s);
}
}