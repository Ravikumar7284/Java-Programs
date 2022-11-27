// basic arithmetic operaiton 
import java.util.Scanner;

public class BasicCalculator
{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int i=0;
       do
       {
       System.out.println("Enter First Number:");
       double first = sc.nextDouble(); 
       System.out.println("Enter Second Number:");
       double second = sc.nextDouble(); 
       double result;
       System.out.println("Select Operation: + , - , * , / , %");
       String operator = sc.next();
       switch(operator)
       {
         case "+":
            result = first + second;
            System.out.println("Result: "+result);
            break;
        case "-":
            result = first - second;
            System.out.println("Result: "+result);
            break;
        case "*":
            result = first * second;
            System.out.println("Result: "+result);
            break;
        case "/":
            result = first / second;
            System.out.println("Result: "+result);
            break;
        case "%":
            result = first % second;
            System.out.println("Result: "+result);
            break;
        default:
        System.out.println("Select Correct Operator!");
        i=1;
        break;
       }
      
    }while(i==0);
    sc.close();
    }
}