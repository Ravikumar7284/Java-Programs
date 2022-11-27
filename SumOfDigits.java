// count sum of digits in number
// e.g number=234 output=9

public class SumOfDigits{
    public static void main(String[] args) {
        int number=234, sum=0;
        while(number>0)
        {
            int last = number % 10;
            sum = sum+last;
            number= number/10;
        }
        System.out.println("Sum of Digits of number: "+sum);;
    }
}