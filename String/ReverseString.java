import java .util.*;
class ReverseString {
    public static void main(String[] args) {
        System.out.print("Enter what you want: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String reverse = " ";

        for (int i = 0; i<input.length(); i++) {
             char ch = input.charAt(i);
          
            reverse = ch + reverse; 
        }
      
        System.out.println(input+" Reverse: "+reverse);
    }
    
}
