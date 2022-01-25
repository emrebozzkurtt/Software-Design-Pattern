import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Settings ayar = Settings.SettingsGetir();
        Settings ayar1 = Settings.SettingsGetir();
        Settings ayar2 = Settings.SettingsGetir();
        Settings ayar3 = Settings.SettingsGetir();

        Scanner type = new Scanner(System.in);
       
        System.out.print("Ayar Numarasını Giriniz = ");
        ayar.SelectSettings(type.nextInt());
       
        System.out.println();
        System.out.println("Ayarlarınız Aşağıdaki Gibidir..");
        ayar.getMySetting();
        ayar1.getMySetting();

        if( (ayar==ayar1) && (ayar1 == ayar2) && (ayar2 == ayar3) ){
            System.out.println("Aynıdır");
        }
    }
}
