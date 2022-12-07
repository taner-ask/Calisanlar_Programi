
public class Yazilimci extends Calisanlar {
    
    private String diller;
    
    public Yazilimci(String ad, String soyad, int id, String diller) {
        super(ad, soyad, id);
        this.diller = diller;
    }
    
    public void formatAt(String isletimSistemi)
    {
        System.out.println(getAd() + isletimSistemi + "sistemine format atıyor..");
        
    }

   
    @Override
    public void bilgileriGöster() {
        super.bilgileriGöster();
        System.out.println("Bildiği Diller: " + diller);
    }
    
    
}
