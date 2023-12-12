import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b;
        double c;

        Scanner inp = new  Scanner(System.in);

        System.out.print("Ilk kenari giriniz : ");
        a = inp.nextInt();

        System.out.print("Ikinci kenari giriniz : ");
        b = inp.nextInt();

        c = Math.sqrt((a*a) + (b*b));

        double  area = (a*b)/2;

        System.out.println("Hipotenus : " + c + "'dir");
        System.out.println("Alan " + area + "'dir");
    }
}