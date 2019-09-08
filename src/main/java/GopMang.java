import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] numbers1;
        int[] numbers2;
        int[] numbers3;
        System.out.println("Nhap do dai mang 1");
        int size1=scanner.nextInt();
        System.out.println("Nhap do dai mang 2");
        int size2=scanner.nextInt();
        numbers1=new int[size1];
        numbers2=new int[size2];
        numbers3=new int[size1+size2];
        for (int i=0;i<size1;i++){
            System.out.println("Enter value of element "+ i);
            int value=scanner.nextInt();
            numbers1[i]=value;
        }
        for (int i=0;i<size2;i++){
            System.out.println("Enter value of element "+ i);
            int value=scanner.nextInt();
            numbers2[i]=value;
        }

        for (int i=0;i<size1;i++){
            numbers3[i]=numbers1[i];
        }
        for (int i=0;i<size2;i++){
            numbers3[size1+i]=numbers2[i];
        }
        for (int i: numbers3){
            System.out.print(i + " ");
        }
    }
}
