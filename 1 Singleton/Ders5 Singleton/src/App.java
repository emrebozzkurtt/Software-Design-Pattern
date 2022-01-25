import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
       YukDengeleyici yd1=YukDengeleyici.YukDengeleyiciGetir();
       YukDengeleyici yd2=YukDengeleyici.YukDengeleyiciGetir();
       YukDengeleyici yd3=YukDengeleyici.YukDengeleyiciGetir();
       YukDengeleyici yd4=YukDengeleyici.YukDengeleyiciGetir();
        
        if( yd1 == yd2 && yd2 == yd3 && yd3 == yd4){
            System.out.println("Yuk Dengeleyiciler Aynıdır..");
        }

            
        
    }
}
