// check perfect number or not
//perfect number is which sum of all divisors equal to number
// 28 = 1+2+4+7+14=28 so it is perfect number

public class PerfectNumber {
    public static void main(String[] args) {
        int number = 6;
        int sum= 0;
        for(int i=1;i<number;i++)
        {
            if(number%i == 0)
            {
                sum = sum+i;
            }
        }

        if(sum == number)
        {
            System.out.println(number+" is perfect number");
        }
        else
        {
            System.out.println(number+" is not perfect number");
        }
    }
}
