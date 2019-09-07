import java.util.Scanner;

public class RotationArray {
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
        rotation(numbers);

    }
    static void rotation(int[] numbers){
        for (int i=0;i<numbers.length/2;i++){
            int temp=numbers[i];
            numbers[i]=numbers[numbers.length-1-i];
            numbers[numbers.length-1-i]=temp;
        }
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

    }
}
