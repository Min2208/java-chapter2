

import java.util.Scanner;


public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name, check;
        int count = 0;

        System.out.println("Enter string name: ");
        name = scanner.nextLine();
        System.out.println("Enter to check string name: ");
        check = scanner.nextLine();

//        for (int i = 0; i < name.length(); i++) {
            if (name.equals(check)) {
                count++;
            }
//        }
        System.out.println(count);
    }
}
class Demo1{

}