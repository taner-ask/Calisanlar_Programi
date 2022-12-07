
public class Calisanlar {
    
    private String ad;
    private String soyad;
    private int id;

    public Calisanlar(String ad, String soyad, int id) {
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void bilgileriGöster()
    {
        System.out.println("Çalışanların Bilgisi...");
        System.out.println("ad: " + getAd());
        System.out.println("soyad: " + getSoyad());
        System.out.println("id: " + getId());
    }
    
}
