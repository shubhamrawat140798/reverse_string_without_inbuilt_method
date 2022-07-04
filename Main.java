//Java Program to reverse a string without using String inbuilt function.

import java.util.Scanner;
public class Main {
    public static String reverseString(String str) {
        String res="";
        for(int i=str.length() -1; i>=0;i--){
            res+=str.charAt(i);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Compile by Shubham Singh Rawat");
        Scanner s = null;
       try{
            s = new Scanner(System.in);
            System.out.print("\nEnter a String: ");
            String str= s.nextLine();
            System.out.println("\nReverse String: "+reverseString(str));
       }
       finally{
            if(s!=null){
                s.close();
            }
            
       }
    }
}
