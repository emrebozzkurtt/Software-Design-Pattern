public class Mail implements Iletisim, BildirimService {
    public void mailGonder(KullaniciService kullanici,String mesaj){
    System.out.println("Kullaniciya\n" + mesaj + " \nmail yoluyla gonderildi.");
    }

    public void bilgiGonder(KullaniciService kullanici,String mesaj){
        mailGonder(kullanici, mesaj);
    }

    @Override
    public void bildirimGonder() {
        
        System.out.println("Bildirim Gönderildi..");        
    }

    public void sendBildirim(){
        bildirimGonder();
    }
}
