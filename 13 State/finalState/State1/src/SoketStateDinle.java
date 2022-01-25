public class SoketStateDinle implements ISoketState {
    @Override
    public void islem(Soket soket) {
        System.out.println(soket.port + " Portu Dinliyor...");
        soket.State = new SoketStateKapat();        
    }
}
