import java.util.Scanner;

public class ChangeArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] numbers={10,2,8,7,5,0,0,0,0,0,0,0,0};
        System.out.println("Enter a value: ");
        int x=scanner.nextInt();
        System.out.println("Enter index of array");
        int index=scanner.nextInt();
        for (int i=numbers.length-1;i>index;i--){
            numbers[i]=numbers[i-1];
        }
        numbers[index]=x;
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }

}
