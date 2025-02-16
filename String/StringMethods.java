 class StringMethods {
    public static void main(String args[]){

        String name = "Java";
        String name1 = "Development";
        //1. Equal Method
        boolean n = name.equals(name1);
        
        if(name == name1){
            System.out.println(name+" is equal "+name1);
        }else{
            System.out.println(name+" is not equal "+name1);
        }

        //2. Concatenate
        String cncate =name.concat(" "+name1);
        //Using ( + )to concatenate
        String st = name+" "+name1;
        System.out.println(cncate);
        System.out.println(st);

        //3. Contain Method
        System.out.println(name.contains("ment"));
        System.out.println(name1.contains("nt"));

        //4. CharAt Method
        char result = name.charAt(2);
        char result1 = name1.charAt(6);
        System.out.println(name+" at index 2 "+ result);
        System.out.println(name1+" at index 6 "+result1);

       
        //5. compareTo Method
        String str = "hello";
        String str1 = "Hello";
        System.out.println(str.compareTo(str1));
        int rslt = str.compareTo(str1);
        if(rslt>0){
            System.out.println(str+" is greater than "+str1);
        }else if(rslt<0){
            System.out.println(str+" is less than "+str1);
        }else{
            System.out.println(str+" is equal to "+str1);
        }

        //6. Split Method

        String sen = "This is our Java Development Course";
        String [] array = sen.split("our");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        String [] array1 = sen.split("av");
        for(int i=0; i<array1.length; i++){
            System.out.println(array1[i]);
        }

        //7. lowercase & UPPERCASE Method
    
        System.out.println("\n"+sen+" :lowercase: "+sen.toLowerCase());
        System.out.println("\n"+sen+" :UPPERCASE: "+sen.toUpperCase());

        //8. isEmpty Method
        String str2 = "";
        System.out.println(str.isEmpty());
        System.out.println(str2.isEmpty());

        //9.endsWith Method
        System.out.println(name1.endsWith("ment"));
        System.out.println(name.endsWith("ja"));
        System.out.println(str.endsWith("lo"));

        //10. replace Method
        str = "hello";
        System.out.println(str.replace('l', 'p'));
        System.out.println(name.replace('a', 'o'));
        System.out.println(name1.replace('e', 'o'));

        
         
    }
    
}
