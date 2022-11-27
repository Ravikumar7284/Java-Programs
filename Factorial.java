// factorial of given number
// product of all integers 
// e.g. 5! = 5*4*3*2*1 = 120

public class Factorial {
    public static void main(String[] args) {
        int number = 5,fact=1;

        for(int i=1; i<=number;i++)
        {
            fact = fact*i;
        }

        System.out.println("factorial of "+number+" is "+fact);
    }
}
