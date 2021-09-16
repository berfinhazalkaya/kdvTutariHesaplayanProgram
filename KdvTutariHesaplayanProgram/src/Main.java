import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar , kdvliTutar , kdvTutari ;
        double kdv = 0.18;
        double kdv2 = 0.08;

        //Kullanıcıdan Fiyat İsteyeceğiz
        Scanner input = new Scanner(System.in);

        System.out.print("Ürünün fiyatı :");
        tutar=input.nextDouble();

        //Girilen fiyata göre KDV oranını belirleyeceğiz

        kdvTutari = tutar >= 1000 ? tutar * kdv2 : tutar * kdv;

        System.out.println("KDV'siz Tutar :" + tutar + " TL");

        //KDV'li fyatı hesaplıyoruz
        kdvliTutar = tutar + kdvTutari;
        System.out.println("KDV'li Tutar : " + kdvliTutar + " TL");

        //KDV tutarını hesaplıyoruz
        kdvTutari = kdvliTutar- tutar;
        System.out.print("KDV Tutarı : " + kdvTutari + " TL");


    }
}
