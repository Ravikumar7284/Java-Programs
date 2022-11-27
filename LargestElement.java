import java.util.Scanner;

public class LargestElement {
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
        largest(array);
        sc.close();
    }

    static void largest(int[] array)
    {
        int largest = array[0];
        for(int i=0; i<array.length;i++)
        {
            if(array[i]>largest){
                largest = array[i];
            }
        }

        System.out.println("largest element in array: "+largest);
    }
}
