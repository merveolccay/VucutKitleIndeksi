package java101;

import java.util.Scanner;

public class VucutKitleİndeksi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu giriniz: ");
        double boy= input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        double kilo = input.nextDouble();
        double indeks = kilo / (boy * boy);
        System.out.println("Vücut kitle indeksiniz : "+ indeks);

        if (indeks < 18.5){
            System.out.println("Zayıf");
        }else if(indeks >=18.5 || indeks < 24.9){
            System.out.println("Normal");
        } else if (indeks>=24.9 || indeks< 29.9) {
            System.out.println("Fazla Kilolu");
        }else{
            System.out.println("Obez");
        }

    }
}
