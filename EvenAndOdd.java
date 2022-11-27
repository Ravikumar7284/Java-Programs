// check number is even or odd
// number is divisible by 2 is even 
// e.g 10%2 == 0 then 10 is even number

public class EvenAndOdd
{
    public static void main(String[] args) {
        int number = 15;

        if(number %2 == 0)
        {
            System.out.println(number+" is even number");
        }
        else
        {
            System.out.println(number+" is odd number");
        }

    }
}