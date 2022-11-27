//check number is armstrong or not
// armstrong number is number which sum of cubes of it's digits is same as number
// eg. 153 = cube(1) + cube(5) + cube(3) = 153

public class ArmstrongNumber {
    
    public static void main(String[] args) {
        
        int number = 153;
        int temp = number;
        int rem,sum=0;

        while(temp > 0)
        {
            rem = temp % 10; // last digit
            temp = temp / 10; // second last digit
            sum = sum + (rem * rem * rem);
        }

        if(sum == number)
        {
            System.out.println(number+" is armstrong number");
        }
        else
        {
            System.out.println(number+" is not armstrong number");
        }
    }
}
