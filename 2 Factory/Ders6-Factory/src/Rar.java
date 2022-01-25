public class Rar implements DosyaSikistirmaService {

    String yol;
    public Rar(String _yol, String xxx){
        this.yol = _yol;
    }

    @Override
    public void compString(String file) {
        // Dosya Sıkıştırma İşlemleri Yapıldı. (Rar)
        System.out.println(yol + file);
        //return yol + file;
    }

}
