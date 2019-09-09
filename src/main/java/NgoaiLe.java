import java.util.Random;
import java.util.Scanner;

public class NgoaiLe{
    public static void main(String[] args) {
        int[] numbers=random();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hay nhap vao chi so phan tu:");
        int index=scanner.nextInt();
        try {
            System.out.println("Value of element " + index +" la "+numbers[index]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Chi so vuot qua gioi han cua mang");
        }

    }

    public static int[] random(){
        int[] number=new int[100];
        Random rd= new Random();
        for (int i=0;i<100;i++){
            number[i]=rd.nextInt(100);
        }
        return number;
    }
}