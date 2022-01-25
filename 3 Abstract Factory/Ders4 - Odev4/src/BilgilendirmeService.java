public class BilgilendirmeService {
    
    private Sms sms;
    private Mail mail;

    public BilgilendirmeService(){
        sms = new Sms();
        mail = new Mail();
    }

    public void bilgilendir(KullaniciService kullanici, String mesaj){
        // Soyut bilgi gönderme
        sms.bilgiGonder(kullanici, mesaj);
        mail.bilgiGonder(kullanici, mesaj);

        /* Somut bilgi gönderme
        sms.smsGonder(kullanici, mesaj);
        mail.mailGonder(kullanici, mesaj);
        */
    }

}

interface Iletisim {
    
    void bilgiGonder(KullaniciService Kullanici, String mesaj);
}
