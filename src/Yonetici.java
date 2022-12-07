
public class Yonetici extends Calisanlar {
    
    private int sorumluKisiSayisi;

    public Yonetici(String ad, String soyad, int id, int sorumluKisiSayisi) {
        super(ad, soyad, id);
        this.sorumluKisiSayisi = sorumluKisiSayisi;
    }
    
    public void zamYap(int zamMiktari)
    {
        System.out.println(getAd() + " kişisi çalışanlara" + zamMiktari + "kadar zam yapıyor..");
    }

    @Override
    public void bilgileriGöster() {
        super.bilgileriGöster(); 
        System.out.println("Sorumlu Kişi Sayısı: " + sorumluKisiSayisi);
    }
    
    
    
    
}
