import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class YukDengeleyici {
    
    private static YukDengeleyici dengeleyici;
    private List<String> sunucular = new ArrayList<String>();
    private Random rnd = new Random();

    //lock işlemi için gerekli
   // private static Object kilit = new Object();

    protected YukDengeleyici () {
        sunucular.add("SUNUCU_1");
        sunucular.add("SUNUCU_2");
        sunucular.add("SUNUCU_3");
        sunucular.add("SUNUCU_4");
        sunucular.add("SUNUCU_5");
    }

    public static YukDengeleyici YukDengeleyiciGetir() {

        //One thread
        if( dengeleyici == null )
        {
            dengeleyici = new YukDengeleyici();
        }
        return dengeleyici;
    }
/*
        // Multi-thread
        if( dengeleyici == null )
        {
            // synchronized (java) = lock (c#)
            synchronized(kilit)
            {
                if( dengeleyici == null )
                {
                    dengeleyici = new YukDengeleyici();
                }
            }
        }
        return dengeleyici;
*/
    

    public String Sunucu(){
        int r = rnd.nextInt(sunucular.size());
        return sunucular.get(r);
    }
    
}
