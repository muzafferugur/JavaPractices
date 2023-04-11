package Practice02;

import java.util.Scanner;

public class Q02Scanner02 {
    public static void main(String[] args) {
        // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
        // ve yasadiklari yeri seviyorlarsa
        // bu bilgiyi yazdirin

        // next() only can read the first word
        // nextLine() can read the whole line

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen adınızı girin");
        String ad = scan.nextLine();

        System.out.println("lütfen memleketinizi girin");
        String mem = scan.nextLine();

        System.out.println("lütfen suanki konumu girin");
        String konum = scan.nextLine();

        System.out.println("lütfen yaşınızı giriniz");
        int yas = scan.nextInt();

        System.out.println("lütfen boyunuzu cm olarak girin");
        int boy = scan.nextInt();

        System.out.println("yasadığınız" + konum + "yı seviyor musunuz");
        boolean yasadiklariYerSeviyorMu = scan.hasNextBoolean();

        System.out.println("ad = " + ad);

        System.out.println("mem = " + mem);

        System.out.println("konum = " + konum);

        System.out.println("yas = " + yas);

        System.out.println("boy = " + boy);

        System.out.println("yasadiklariYerSeviyorMu = " + yasadiklariYerSeviyorMu);


    }
}
