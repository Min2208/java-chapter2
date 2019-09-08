import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        System.out.println("Nhap ky tu muon tim kiem");
//        String index = scanner.next();
        char a='a';
        String name="vuongdaicaaaaa";
        int count=0;
        for (int i=0;i<name.length();i++){
            char result=name.charAt(i);
            if (a==result){
                count++;
            }
        }
        System.out.println("Result: " + count);
    }
}
