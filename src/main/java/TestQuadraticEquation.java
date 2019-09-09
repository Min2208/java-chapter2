import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a=scanner.nextDouble();
        System.out.println("Nhap b: ");
        double b=scanner.nextDouble();
        System.out.println("Nhap c: ");
        double c=scanner.nextDouble();

        QuadraticEquation account=new QuadraticEquation(a,b,c);

        System.out.println(account.getDiscriminant());
        System.out.println(account.getRoot1());
        System.out.println(account.getRoot2());
    }
}

class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = this.b * this.b - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        double result = 0;
        if (getDiscriminant() >= 0) {
            result = (-this.b + Math.pow(getDiscriminant(),0.5)) / 2*this.a;
        }
        return result;
    }

    public double getRoot2() {
        double result = 0;
        if (getDiscriminant() >= 0) {
            result = (-this.b - Math.pow(getDiscriminant(),0.5)) / 2*this.a;
        }
        return result;
    }

}
