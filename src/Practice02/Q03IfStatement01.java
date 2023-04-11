package Practice02;

public class Q03IfStatement01 {

    public static void main(String[] args) {
        /*
         * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */
        String input="Y";

        if(input.equals("Y")){
            System.out.println("YES");

        }else if(input.equals("N")){
            System.out.println("NO");

        }else {
            System.out.println("Invalid input");
        }
    }
}






