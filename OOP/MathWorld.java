import java.util.Scanner;
class MathWorld{

public static void main(String args []){
MathWorld mainMethod = new MathWorld();
mainMethod.menuMethod();
}

public void menuMethod(){
Scanner scanner = new Scanner(System.in);
System.out.println("Welcome to the Math World");
System.out.println("1- Check even odd");
System.out.println("2- Generate Table ");
System.out.println("3- Calculate Factorial");
System.out.println("4- Reverse the Number");
System.out.println("5- Check Perfect Number");
System.out.println("6- Check Amstrong Number");
System.out.println("7- Print all the Factors");
System.out.println("8- Generate Pascal triangle till the given number");
System.out.println("9- Check Palindrom Number");
System.out.println("10- Generate a diamond pattern till the given number");
System.out.println("11- Calculate Square of number");


Scanner sc = new Scanner(System.in);
System.out.print("Input your choice :");
int choice = sc.nextInt();


if(choice == 1){
 checkEvenOdd(scanner);

}else if(choice == 2){
 generateTable(scanner);
}else if(choice == 3){
 calculateFactorial(scanner);
}else if(choice == 11){
 calculateSquare(scanner);
}
}

public void checkEvenOdd(Scanner scanner){

Scanner ch = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = ch.nextInt();
 if(number%2==0){
 System.out.print(number+" "+"is even number");
}else{
 System.out.print(number+" "+"is odd number");
}
}
 public void generateTable(Scanner scanner){
 Scanner gen = new Scanner(System.in);
 System.out.print("Enter a number: ");
 int number = gen.nextInt();
 for(int i =1; i<=10; i++){
 System.out.println(number+"x"+i+"="+(number * i));
}
}

 public void calculateFactorial(Scanner scanner){
 Scanner cal = new Scanner(System.in);
 System.out.print("Enter a number: ");
 int number = cal.nextInt();
 int fact =1;
 for(int i =1; i<=number; i++){
  fact = fact * i;
 System.out.println("Factorial of"+" "+number+" "+"is"+fact);
}
}

public void calculateSquare(Scanner scanner){
Scanner squ = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = squ.nextInt();
System.out.println("Square of"+" "+number+" "+"is"+" "+(number * number));
}
}

