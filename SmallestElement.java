import java.util.Scanner;
public class SmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the elements in array: ");
        for(int i=0; i<size; i++)
        {
            array[i] = sc.nextInt();
        }
        smallest(array);
        sc.close();
    }
    
    static void smallest(int[] array)
    {
        int smallest = array[0];

        for(int i=0; i<array.length;i++)
        {
            if(array[i]<smallest)
            {
                smallest = array[i];
            }
        }

        System.out.println("smallest element in array: "+smallest);
    }
}
