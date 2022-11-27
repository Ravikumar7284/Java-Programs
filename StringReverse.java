// reverse of string without using reverse() method

public class StringReverse {
    public static void main(String[] args) {
        String string1 = "World";
        String reverse = " ";
        char ch;
        for(int i=0; i<string1.length();i++)
        {
            ch = string1.charAt(i);
            reverse = ch+reverse;
        }
        System.out.println("Reverse of String is: "+reverse);
    }
}
