import java.util.*;

public class Dunyali{
 String tip;
int savunma;
 int silah;
 int urun;
 public Dunyali(String tip, int savunma,int silah,int urun){
     this.tip = tip;
     this.savunma=savunma;
     this.silah = silah;
     this.urun = urun;
 }

 public int DGuc(){
     if (tip=="Ciftci") return urun;
     else return silah*savunma;
 }
}

class Uzayli{
    String tip;
    int savunma;
    int lazer;
    int maden;
    public Uzayli(String tip , int savunma , int lazer , int maden){
        this.tip = tip;
        this.lazer = lazer;
        this.maden = maden;
        this.savunma = savunma;
    }

    public int UGuc(){
        if(tip=="Madenci") return maden;
        else return lazer*savunma;
    }
}

class Savas{
    static int toplam;
    public static int savas(){
        String dunyaliTip[]={"Asker","Ciftci"};
        String uzayliTip[] = {"Cyborg","Madenci"};
         Uzayli[]uzayli= new Uzayli[500];
         Dunyali[]dunyali = new Dunyali[500];
        Random rand = new Random();

        // Dünyalı için:
        int i,j;
        for(i=0;i<500;i++){
           int tipSec = rand.nextInt(2);
           dunyali[i] = new Dunyali(dunyaliTip[tipSec],rand.nextInt(11),rand.nextInt(11),rand.nextInt(11));
        }

        //Uzayli İçin:

        for(j=0;j<500;j++){
            int tipSec = rand.nextInt(2);
            uzayli[i] = new Uzayli(uzayliTip[tipSec],rand.nextInt(11),rand.nextInt(11),rand.nextInt(11));

        }

        // Gucler:
        int uzayliGuc = 0;
        int dunyaliGuc = 0;
        for(i=0;i<dunyali.length-1;i++) {
            dunyaliGuc += dunyali[i].DGuc();
            uzayliGuc += uzayli[i].UGuc();
        }
        toplam = dunyaliGuc-uzayliGuc;
        return toplam;
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int Durum=0;
        while(Durum!=-1){
            System.out.println("-1  1 ");
            Durum=input.nextInt();
            if(Durum==-1) break;
            System.out.println(" Puan : " + savas());
        }

        System.out.println("Toplam Puan : " + toplam);

    }


}


