public class Zip implements DosyaSikistirmaService {

    String uzanti;
    public Zip(String _uzanti){
        this.uzanti = _uzanti;
    }

    @Override
    public void compString(String file) {
        // Dosya Sıkıştırma İşlemleri Yapıldı. (Zip)
        System.out.println(file+uzanti);
        //return file + uzanti;
    }

}
