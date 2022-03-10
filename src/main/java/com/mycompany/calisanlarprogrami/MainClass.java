package com.mycompany.calisanlarprogrami;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        //Calisan sinifi seklinde bir ust sinif
        //Calisan sinifindan tureyen Yazilimci adinda bir alt sinif
        //Calisan sinifindan tureyen Yonetici adinda bir alt sinif
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Calisanlar Programi");
        String islemler = "Islemler...\n"
                + "1. Yazilimci Islemleri\n"
                + "2. Yonetici Islemleri\n"
                + "Cıkıs icin q'ya basin";
        System.out.println("*****************************");
        System.out.println(islemler);
        System.out.println("*****************************");*/

        while (true) {
            System.out.println("Calisanlar Programi");
            String islemler = "Islemler...\n"
                    + "1. Yazilimci Islemleri\n"
                    + "2. Yonetici Islemleri\n"
                    + "Cıkıs icin q'ya basin";
            System.out.println("*****************************");
            System.out.println(islemler);
            System.out.println("*****************************");
            System.out.println("Islem Seciniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan Cikiliyor...");
                break;
            } else if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci("Furkan", "Ekiz", 100, "C,Java");

                String yazilimciIslemler = "Yazilimci Islemleri;\n"
                        + "1. Format At\n"
                        + "2. Bilgileri Goster\n"
                        + "Yazilimci Islemlerinden Cikis icin q'ya basin";
                System.out.println(yazilimciIslemler);

                while (true) {
                    System.out.println("Islemi Seciniz: ");
                    String yIslem = scanner.nextLine();

                    if (yIslem.equals("q")) {
                        System.out.println("Yazilimci Islemlerinden Cikiliyor...");
                        break;
                    } else if (yIslem.equals("1")) {
                        System.out.println("Isletim Sistemi: ");
                        String isletimSistemi = scanner.nextLine();
                        yazilimci.formatAt(isletimSistemi);
                    } else if (yIslem.equals("2")) {
                        yazilimci.bilgileriGoster();
                    } else {
                        System.out.println("Gecersiz Yazilimci Islemi...");
                    }
                }

            } else if (islem.equals("2")) {
                Yonetici yonetici = new Yonetici("Serhat", "Say", 123, 10);

                String yoneticiIslemler = "Yonetici Islemleri;\n"
                        + "1. Zam Yap\n"
                        + "2. Bilgileri Goster\n"
                        + "Yonetici Islemlerinden Cikis icin q'ya basin";
                System.out.println(yoneticiIslemler);

                while (true) {
                    System.out.println("Islem Seciniz: ");
                    String yIslem = scanner.nextLine();

                    if (yIslem.equals("q")) {
                        System.out.println("Yonetici Islemlerinden Cikiliyor...");
                        break;
                    } else if (yIslem.equals("1")) {
                        System.out.println("Yoneticinin ne kadar zam yapmasini istiyorsunuz: ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktari);
                    } else if (yIslem.equals("2")) {
                        yonetici.bilgileriGoster();
                    } else {
                        System.out.println("Gecersiz Yonetici Islemi...");
                    }
                }
            } else {
                System.out.println("Gecersiz Islem...");
            }
        }
    }
}
