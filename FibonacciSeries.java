// count fibonacci series till given number
// it is series which has third item is addition of first two integers 
// e.g a=0, b=1 and c=a+b=0+1=1 and so on..

public class FibonacciSeries {
   public static void main(String[] args) {
    FibonacciSeries fs = new FibonacciSeries();
    int number = 10;
    fs.fibonacci(number);
   } 

   private void fibonacci(int number)
   {
    int first = 0; 
    int second = 1;
    int third;
    System.out.print(first+" "+second);
    for(int i = 2; i < number ;i++)
    {
        third = first + second;
        System.out.print(" "+third);
        first = second;
        second = third;
        
    }
   }
}
