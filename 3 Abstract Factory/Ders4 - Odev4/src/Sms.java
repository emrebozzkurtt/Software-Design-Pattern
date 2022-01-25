public class Sms implements Iletisim, BildirimService{
    public void smsGonder(KullaniciService kullanici,String mesaj){
        System.out.println("Kullaniciya\n" + mesaj +"\nsms yoluyla gonderildi.");
    }

    @Override
    public void bilgiGonder(KullaniciService kullanici,String mesaj){
        smsGonder(kullanici, mesaj);
    }
    
    @Override
    public void bildirimGonder() {
        
        System.out.println("Bildirim Gönderildi..");        
    }

    public void sendBildirim(){
        bildirimGonder();
    }
}
