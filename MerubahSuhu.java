package UTS;

import java.util.Scanner;

public class MerubahSuhu {
    public static void main ( String [] args)
    {
        double r,k;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nilai Konversi = ");
        k = input.nextInt();//suhu kelvin
        r= (k-273)*4/5;

        System.out.println(" ");
        System.out.println("kelvin = " +k);
        System.out.println(" Hasil Konversi kelvin to reamur ");
        System.out.println("reamur = " +r);
    }
}
