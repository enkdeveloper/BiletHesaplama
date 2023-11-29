import java.util.Scanner;

public class biletHesaplama {
    public static void main(String[] args) {
        int mesafe, yas;
        Scanner input = new Scanner(System.in);
        System.out.print("Gideceğiniz mesafe KM cinsinden nedir: ");
        mesafe = input.nextInt();

        System.out.print("Yaşınız nedir: ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1: Gidiş-dönüş, 2: Tek yön): ");
        int yolculukTipi = input.nextInt();

        double fiyat = mesafe * 0.10;
        double indirimliTutar;
        double gidisDonus;
        double hesapla;


        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {

            if (yolculukTipi == 1) {
                if (yas < 12) {
                    indirimliTutar = (fiyat*0.5);
                    gidisDonus = (indirimliTutar*0.8)*2;
                    hesapla = gidisDonus;
                    System.out.println(hesapla);
                } else if (12 <= yas && yas < 24) {
                    indirimliTutar = (fiyat*0.9);
                    gidisDonus = (indirimliTutar*0.8)*2;
                    hesapla = gidisDonus;
                    System.out.println(hesapla);
                } else if (24 <= yas && yas < 65) {
                    gidisDonus = (fiyat*0.8)*2;
                    hesapla = gidisDonus;
                    System.out.println(hesapla);
                } else if (65 <= yas) {
                    indirimliTutar = (fiyat*0.7);
                    gidisDonus = (indirimliTutar*0.8)*2;
                    hesapla = gidisDonus;
                    System.out.println(hesapla);
                }
            } else {
                if (yas < 12) {
                    hesapla = fiyat * 0.5;
                    System.out.println(hesapla);
                } else if (12 <= yas && yas < 24) {
                    hesapla = fiyat * 0.1;
                    System.out.println(hesapla);
                } else if (24 <= yas && yas < 65) {
                    hesapla = fiyat;
                    System.out.println(hesapla);
                } else if (65 <= yas) {
                    hesapla = fiyat * 0.3;
                    System.out.println(hesapla);
                }
            }
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}
