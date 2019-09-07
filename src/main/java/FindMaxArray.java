import java.util.Scanner;

public class FindMaxArray {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][] numbers;
        System.out.println("Enter sizeX for array: ");
        int sizeX=scanner.nextInt();
        System.out.println("Enter sizeY for array: ");
        int sizeY=scanner.nextInt();
        numbers=new int[sizeX][sizeY];
        for (int i=0;i<sizeX;i++) {
            for (int j = 0; j < sizeY; j++) {
                System.out.println("Enter value of element" + i + " " + j);
                numbers[i][j] = scanner.nextInt();

            }
        }
        System.out.println("Max of array: " + findMax(numbers));


    }
    public static int findMax(int[][] arr){
        int max=arr[0][0];
        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }

        return max;
    }
}
