import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int broj1;
        int broj2;
        int zbroj;
        int razlika;
        int umnozak;
        double kolicnik;
        int znak;

        System.out.println("Unesite prvi broj: ");
        broj1 = sc.nextInt();

        System.out.println("Unesite drugi broj: ");
        broj2 = sc.nextInt();

        System.out.println("*** Unesite broj za racunsku operaciju ***");
        System.out.println("(za zbrajanje unesite 1");
        System.out.println(" za oduzimaje unesite 2");
        System.out.println(" za mnozenje  unesite 3");
        System.out.println(" za dijeljenje unesite 4)");
        znak = sc.nextInt();


        if (znak == 1) {
            zbroj = broj1+broj2;
            System.out.println("Rezultat je: " + zbroj);
        }

        else if (znak == 2) {
            razlika = broj1-broj2;
            System.out.println("Rezultat je: " + razlika);
        }

        else if (znak == 3) {
            umnozak = broj1*broj2;
            System.out.println("Rezultat je: " + umnozak);
        }

        else if (znak == 4) {
            kolicnik = (double)broj1/broj2;
            System.out.println("Rezultat je: " + kolicnik);
        }

        else {
            System.out.println("Niste unijeli dobar broj za racunsku operaciju.");

        }
    }
}