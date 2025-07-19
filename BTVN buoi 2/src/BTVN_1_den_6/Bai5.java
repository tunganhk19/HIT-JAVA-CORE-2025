package BTVN_1_den_6;
public class Bai5 {
    public static void main(String[] args) {

        System.out.println("Bang cuu chuong so 5 la: ");
        for(int i = 1; i <= 10; i++){
            System.out.println("5 x " + i + " = " + (5 * i));
        }
        System.out.println("");
        int i = 2;
        int sum = 0;
        while(true){
            if(i > 100)
                break;
            sum += i;
            i += 2;
        }
        System.out.println("Tong cac so chan tu 1 - 100 la: " + sum);
    }
}
