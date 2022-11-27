import java.util.*;
public class LinearSearch
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements: ");
        for(int i=0; i<size; i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the element to find: ");
        int find = sc.nextInt();

        linear(array,find);
        sc.close();
    }

    static void linear(int array[],int find)
    {
        for(int i=0; i<array.length;i++)
        {
            if(array[i]==find)
            {
                System.out.println("Element found at position: "+i);
            }
        }
            
    }
}