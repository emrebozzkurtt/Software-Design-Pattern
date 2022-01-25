public class SoketStateAc implements ISoketState{
    @Override
    public void islem(Soket soket) {
        System.out.println(soket.port + " Portu Açıldı.");
        soket.State = new SoketStateDinle();
    }
}
