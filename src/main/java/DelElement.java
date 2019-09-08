import java.util.Scanner;

public class DelElement {
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
        System.out.println("Nhap gia tri can xoa");
        int value=scanner.nextInt();
        int index=size;
        for (int i=0;i<size;i++){
            if (numbers[i]==value){
                index=i;
                break;
            }else {
                System.out.println("Not found element");
            }
        }
        if (index!=size) {
            for (int i = index; i < size - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            numbers[size-1]=0;
        }
        for (int a:numbers){
            System.out.print(a + " ");
        }
    }
}
