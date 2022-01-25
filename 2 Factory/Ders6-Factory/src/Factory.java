public class Factory {
    
    public DosyaSikistirmaService dosyaService(String tip){
        switch (tip) {
            case "zip":
                return new Zip(".zip");
            
            case "rar":
                return new Rar("RAR/", null);

            default:
                return null;
        }
    }
    
    public DosyaSikistirmaService zipGetir(){
        return new Zip(".zip");
    }
    public DosyaSikistirmaService rarGetir(){
        return new Rar("RAR/", null);
    }
}
