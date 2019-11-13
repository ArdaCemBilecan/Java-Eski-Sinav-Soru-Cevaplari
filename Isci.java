import java.util.Scanner;

public class Isci {
    private String isim;
    private String soyad;
    private int calismaSaati;
    private int saatlikUcret;

   public Isci(String a,String b, int c , int d){
       this.isim = a;
       this.soyad = b;
       this.calismaSaati = c;
       this.saatlikUcret = d;
    }

    public String isim(){
       return isim;
    }
    public String soyad(){
        return soyad;
    }


    public int hesapla(int calismaSaati,int saatlikUcret){
       if (calismaSaati>100){
           int toplamPara;
           int ext;
           ext = ((calismaSaati-100)/2)*50;
             toplamPara = 100*saatlikUcret+ext;
             return toplamPara;
       } else{
           return saatlikUcret*calismaSaati;

       }

    }

}

class AnaClass{
    public static void main(String[]ags){
     int CalismaSaati;
     int SaatlikUcret;
     String Ad;
     String Soyad;
        Scanner input = new Scanner(System.in);
        System.out.println("Çalışma Saatini Giriniz: ");
        CalismaSaati = input.nextInt();
        System.out.println("\nÇalışma Ücretini Giriniz: ");
        SaatlikUcret = input.nextInt();
        System.out.println("\nAD Giriniz: ");
        Ad = input.nextLine();
        System.out.println("\nSoyad Giriniz: ");
        Soyad = input.nextLine();
     Isci s1 = new Isci(Ad,Soyad,CalismaSaati,SaatlikUcret);
     Isci s2 = new Isci("Mehmet","Yılmaz",50,100);
        System.out.println(s1.isim()+" "+s1.soyad()+" "+s1.hesapla(CalismaSaati,SaatlikUcret));
        System.out.println(s2.isim()+" "+s2.soyad()+" "+s2.hesapla(50,100));

    }

}
