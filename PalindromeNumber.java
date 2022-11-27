// check palindrome number or not
// palindrome number is number which is same after reverse of that number
// e.g number= 121 and reverse= 121;

public class PalindromeNumber {
    
    public static void main(String[] args) {
        
        int number = 143;
        int temp = number;
        int reverse=0,rem;

        while(temp > 0)
        {
            rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp / 10;
        }

        if(number == reverse)
        {
            System.out.println(number+" is palindrome number");
        }
        else
        {
            System.out.println(number+ " is not palindrome number");
        }
    }
}
