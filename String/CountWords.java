import java.util.*;
class CountWords {
    public static void main(String args[]){

        System.out.print("Enter sentence: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int total = 1;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' '){
                total++;
            }
        }
          System.out.println(total);
    }
    
}
