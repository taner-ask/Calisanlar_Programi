
import java.util.Scanner;


public class Main {  

    public static void main(String[] args) {
        
        System.out.println("Çalışanlar Programına Hoş Geldiniz...");
        
        String islem = "1- Yazılımcı\n"+
                            "2- Yonetici\n"+
                            "q- çıkış\n"+
                            "*****************\n";
        System.out.println(islem + "\n İşlem seçiniz: ");
        
        String kontrol;
        
        Scanner scanner = new Scanner(System.in);
        kontrol = scanner.nextLine();
        
       switch(kontrol)
       {
           case "1":
               System.out.println("Yazılımcı Sayfasına Hoş Geldiniz..");
               Yazilimci yazilimci = new Yazilimci("Taner","ASKAR",2025,"C,C++,JAVA");
               String islem1 = "1- Yazılımcı Bilgilerini Göster\n"+
                              "2-Format At\n"+
                              "q- çıkış\n";
               System.out.println(islem1 + "\n İşlem seçiniz: ");
               String kontrol1 = scanner.nextLine();
                
                if(kontrol1.equals("1"))
                {
                    yazilimci.bilgileriGöster();
                }
                
                else if(kontrol1.equals("2"))
                {
                    System.out.println("Hangi İşletim Sistemine Format Atacaksınız?: ");
                    String isletim_sistemi = scanner.nextLine();
                    yazilimci.formatAt(isletim_sistemi);
                    
                }
                else if(kontrol1.equals("q"))
                    System.out.println("Programdan Çıkılıyor..");
               
                break;
           
           case "2":
               Yonetici yonetici = new Yonetici("Taner", "ASKAR", 795, 10);
               String islem2 = "1- Yönetici Bilgilerini Göster\n"+
                              "2-Zam Yap\n"+
                              "q- çıkış\n";
               System.out.println(islem2 + "\n İşlem seçiniz: ");
               String kontrol2 = scanner.nextLine();
               
                if(kontrol2.equals("1"))
                {
                    yonetici.bilgileriGöster();
                }
                
                else if(kontrol2.equals("2"))
                {
                    System.out.println("Ne Kadar Zam Yapmak İstiyorsunuz?: ");
                    int zam_miktari = scanner.nextInt();
                    yonetici.zamYap(zam_miktari);
                    
                }
                else if(kontrol2.equals("q"))
                    System.out.println("Programdan Çıkılıyor..");
               
                break;
                
           case "q":
               System.out.println("Programdan Çıkılıyor..");
           
           default: System.out.println("Geçersiz İşlem!!");
       }
        
        
    }
 
    
    
}
