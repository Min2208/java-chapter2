import java.util.Scanner;

public class DiemThiSV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] score;
        int size;
        int count=0;
        do {
            System.out.println("Enter total student");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Max student 30");
            }
        } while (size > 30);
        score = new int[size];
        for (int i = 0; i < size; i++) {
            int point;
            do {
                System.out.println("Enter value of element " + i);
                point=scanner.nextInt();
                if (point>10 || point<0){
                    System.out.println("Value of element about 0-10");
                }
            } while (point>10 || point<0);

            score[i] = point;
        }
        for (int i=0;i<size;i++){
            if (score[i]>=5) {
                count++;
            }
        }
        System.out.println("Total student pass: " + count);
    }
}
