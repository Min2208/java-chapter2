import java.util.Scanner;

public class FindMax {
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
        System.out.println("Max: "+findArray(numbers));

    }
    static int findArray(int[] arr){
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
