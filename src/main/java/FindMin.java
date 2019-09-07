import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size;
        int numbers[];
        System.out.println("Enter size of array: ");
        size=scanner.nextInt();
        numbers=new int[size];
        for (int i=0; i<size;i++){
            System.out.println("Enter value of element "+i);
            numbers[i]=scanner.nextInt();
        }
        System.out.println("Min: " + findMin(numbers));
    }
    public static int findMin(int[] arr){
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
