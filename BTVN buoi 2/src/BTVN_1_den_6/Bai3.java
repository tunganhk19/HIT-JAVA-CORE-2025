package BTVN_1_den_6;
import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("Nhap so nguyen 1: ");
            int a = in.nextInt();
            System.out.println("Nhap so nguyen 2: ");
            int b = in.nextInt();
            int c = a - b;
            System.out.println(a + "+" + b + "=" + (a+b));
            System.out.println(a + "-" + b + "=" + c);
            System.out.println(a + "*" + b + "=" + (a*b));
            System.out.println(a + "/" + b + "=" + (a/b));
            System.out.println(a + "%" + b + "=" + (a%b));
            if(c == 0)
                System.out.println("2 so nay bang nhau");
            else
                System.out.println("2 so nay khong bang nhau");
        }

    }
}
