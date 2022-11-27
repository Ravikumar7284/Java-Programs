// check string palindrome or not
// find  reverse string
// e.g input: racecar output: racecar

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        String reverse = "";
        char ch;
        for(int i=0; i<str.length();i++)
        {
            ch = str.charAt(i);
            reverse = ch+reverse;
        }

        if(str.equals(reverse))
        {
            System.out.println(str+" is palindrome");
        }
        else
        {
            System.out.println(str+" is not palindrome");
        }
        sc.close();


    }
}
