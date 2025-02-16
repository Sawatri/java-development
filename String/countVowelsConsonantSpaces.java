import java.util.*;

class countVowelsConsonantSpaces{
    public static void main(String args[]){

        System.out.print("Enter your sentence: ");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int vowels = 0;
        int consonant = 0;
        int space =0;
    

        for(int i=0; i<input.length(); i++){

         if(input.charAt(i) ==' '){
            space++;
         }else if(input.charAt(i) =='a' || input.charAt(i) =='e'|| input.charAt(i) =='i' || input.charAt(i) =='o' || input.charAt(i) =='u'){    
            vowels++;
         }else{
            consonant++;
         }
        }
        System.out.println("Number of spaces: " +space);
        System.out.println("Number of vowels: "+vowels);
        System.out.println("Number of consonants: "+consonant);
    }

    }
