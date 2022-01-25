public class Settings implements SelectSettingService {

    private static Settings settings;

    private String mailLocation;
    private String basliklarLocation;
    private String icerikLocation;

    public String getMailLocation() {
        return mailLocation;
    }

    public void setMailLocation(String mailLocation) {
        this.mailLocation = mailLocation;
    }

    public String getBasliklarLocation() {
        return basliklarLocation;
    }

    public void setBasliklarLocation(String basliklarLocation) {
        this.basliklarLocation = basliklarLocation;
    }

    public String getIcerikLocation() {
        return icerikLocation;
    }

    public void setIcerikLocation(String icerikLocation) {
        this.icerikLocation = icerikLocation;
    }

    @Override
    public void SelectSettings(int typeId) {
        // TODO Auto-generated method stub
        if ((typeId < 1) || (typeId > 3)) {
            System.out.println("Geçerli Bir Değer Giriniz.. (1-2-3)");
        } else {
            switch (typeId) {
            case 1:
                settings.setMailLocation("Konumu: Sol - Boyutu: 300");
                settings.setBasliklarLocation("Konumu: Sag Ust - Boyutu: 600");
                settings.setIcerikLocation("Konumu: Sag Alt - Boyutu: 600");
                break;

            case 2:
                settings.setMailLocation("Konumu: Sol - Boyutu: 300");
                settings.setBasliklarLocation("Konumu: Orta - Boyutu: 300");
                settings.setIcerikLocation("Konumu: Sag - Boyutu: 900");
                break;

            case 3:
                settings.setMailLocation("Konumu: Sol Ust - Boyutu: 200");
                settings.setBasliklarLocation("Konumu: Sag Ust - Boyutu: 600");
                settings.setIcerikLocation("Konumu: Alt - Boyutu: 600");
                break;
            default:
                break;

            }
        }
    }

    public static Settings SettingsGetir() {
        if (settings == null) {
            settings = new Settings();
        }
        return settings;
    }

    public void getMySetting() {
            System.out.println("\n" + settings.getMailLocation() + "\n" + settings.getBasliklarLocation() + "\n"
                + settings.getIcerikLocation());
    }

}
