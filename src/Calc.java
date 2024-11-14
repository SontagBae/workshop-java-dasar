import java.util.*;

public class Calc {

    public static void calop(int a, int b, String op){
        if (op.equals("+")) {
            System.out.println("Maka, a + b = " + (a+b));
        }
        else if (op.equals("-")) {
            System.out.println("Maka, a - b = " + (a-b));
        }
        else if (op.equals("x")) {
            System.out.println("Maka, a x b = " + (a*b));
        }
        else if (op.equals(":")) {
            System.out.println("Maka, a : b = " + (a/b));
        }
        else {
            System.out.println("input tidak valid");
        }

    }

    public static void main(String[] args) {
        /*
        *buatkan kalkulator yang bisa menerima input
        * int a
        * int b
        * char operator
        * while
        * lanjut? y t
        * terima kasih
        */


//        Scanner ia = new Scanner(System.in);
//            System.out.println("silahkan masukkan nilai a: ");
//        double a = ia.nextFloat();
//
//        Scanner ib = new Scanner(System.in);
//            System.out.println("silahkan masukkan nilai b: ");
//        double b = ib.nextFloat();
//
//        System.out.println("maka a + b = " + (a+b));
//        System.out.println("maka a - b = " + (a-b));
//        System.out.println("maka a x b = " + (a*b));
//        System.out.println("maka a : b = " + (a/b));

        Scanner scanner = new Scanner(System.in);
        boolean kondisi = true;
        while (kondisi) {
            System.out.println("silahkan masukkan nilai a: ");
            int a = Integer.parseInt(scanner.nextLine());

            System.out.println("silahkan masukkan nilai b: ");
            int b = Integer.parseInt(scanner.nextLine());

            System.out.println("masukkan operator: ");
            String op = scanner.nextLine();

            calop(a, b, op);

            System.out.println("lanjut ?");
            String tanya = scanner.nextLine();
            if(tanya.equals("ya")){
                kondisi = true;
            } else {
                kondisi = false;
            }
        }

        scanner.close();

    }
}
