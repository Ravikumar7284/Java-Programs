// check number is prime or not
// prime number is number which is divisible by 1 and iteself
// e.g 7 is divsible by 1 and 7 only

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 7;
        boolean prime = true;
        for(int i=2; i< number; i++)
        {
            if(number%i == 0)
            {
               prime=false;
                break;
            }
        }

        if(prime)
        {
            System.out.println(number+" is prime number");
        }
        else
        {
            System.out.println(number+" is not prime number");
        }
    }
}
