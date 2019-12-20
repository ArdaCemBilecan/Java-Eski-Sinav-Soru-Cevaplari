import java.util.Scanner;

public class Zaman{
    private int ay;
    private int yil;
    public Zaman(int ay, int yil){
        if (ay < 0 || ay > 12 || yil < 0 || yil > 10) {
            throw new IllegalArgumentException("Yanlış Değerler Girdiniz");
        }else{
            this.ay = ay;
            this.yil = yil;
        }

    }

    public int getAy() {
        return ay;
    }

    public int getYil() {
        return yil;
    }
}

class urun{
   private String urunAdi;
   private String urunTuru;
   private Zaman SKT;


   public urun(String urunAdi,String urunTuru,Zaman SKT){
       this.urunAdi=urunAdi;
       this.urunTuru = urunTuru;
       this.SKT = SKT;
   }
    public int ay(){
       return SKT.getAy();
    }
    public int yil(){
        return SKT.getYil();
    }


}

class mainClass{
    public static void main(String[]args){
        urun [] urunler = new urun[10];
        Scanner input = new Scanner(System.in);
        int ay,yil;
        for(int i=0;i<10;i++){
            System.out.println("Ay Giriniz ");
            ay = input.nextInt();
            System.out.println("Yıl Giriniz ");
            yil = input.nextInt();
            Zaman z1 = new Zaman(ay,yil);
            urun u1 = new urun("Arda","Cem",z1);
            urunler[i]=u1;
        }
       sirala(urunler);

        for(int i =0;i<10;i++){
            System.out.println(i+" .Siradaki urun tarihi: "+urunler[i].yil()+" "+urunler[i].ay());
        }
    }

    public static urun [] sirala(urun [] urunler){
        int i,j;
        for(i=0;i<9;i++){
            for(j=0;j<9;j++){
               if(urunler[j].yil()< urunler[j+1].yil()){
                   urun temp = urunler[j];
                   urunler[j] = urunler[j+1];
                   urunler[j+1] = temp;
               }
               if(urunler[j].yil() == urunler[j+1].yil()){
                   if(urunler[j].yil() == urunler[j+1].yil()){
                       urun temp = urunler[j];
                       urunler[j] = urunler[j+1];
                       urunler[j+1] = temp;
                   }
               }
            }
        }

        return urunler;
    }

}
