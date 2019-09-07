import java.util.Scanner;

public class CToF {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Menu.");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.println("Enter your select");
        int select=scanner.nextInt();
        switch (select){
            case 1:
                System.out.println(fahrenheit());
                break;
            case 2:
                System.out.println(celsius());
                break;
            case 0:
                System.exit(0);
        }

    }
    public static double fahrenheit(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter fahrenheit: ");
        int f=scanner.nextInt();
        double c=(5.0 / 9) * (f - 32);
        return c;
    }
    public static double celsius(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter celsius: ");
        int c=scanner.nextInt();
        double f=(9.0 / 5) * c + 32;
        return f;
    }

}
