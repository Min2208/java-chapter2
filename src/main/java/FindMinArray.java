import java.util.Scanner;

public class FindMinArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] numbers;
        System.out.println("Nhap do dai cua mang");
        int size=scanner.nextInt();
        numbers=new int[size];
        for (int i=0;i<size;i++){
            System.out.println("Enter value of element " + i);
            numbers[i]=scanner.nextInt();
        }
        int min=numbers[0];
        for (int i=1;i<size;i++){

            if (min>numbers[i]){
                min=numbers[i];
            }
        }
        System.out.println("Min: " + min);
    }
}
