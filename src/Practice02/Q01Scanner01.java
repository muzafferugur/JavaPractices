package Practice02;

import java.util.Scanner;

public class Q01Scanner01 {

    public static void main(String[] args) {
        // kullanicidan 2 tam sayi alin
        // bu tam sayilari toplayin ve sonucu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen birinci sayıyı giriniz");
        int a = scan.nextInt();
        System.out.println("lütfen ikinci sayıyı giriniz");
        int b = scan.nextInt();
        System.out.println(a + b);
    }
}
