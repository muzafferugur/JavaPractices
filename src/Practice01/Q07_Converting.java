package Practice01;

public class Q07_Converting {

     /*
      Soru 1 -) galonu litreye ceviren bir java programi yaziniz
                1 gallon = 3.785 litre

                litreyi galona ceviren bir java programi yaziniz
                1 litre = 1/3.785 gallon
      */

    public static void main(String[] args) {

        int gallon = 1000;
        double litre = gallon * 3.785;
        String sonuc1 = gallon + "gallon değeri " + litre + "litreye eşittir";
        System.out.println(sonuc1);

        int l = 1000;
        double g = l / 3.785;
        System.out.println(l + " litre degeri " + g + " gallona esittir ");

    }
}
