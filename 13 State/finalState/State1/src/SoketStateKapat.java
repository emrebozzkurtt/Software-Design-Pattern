public class SoketStateKapat implements ISoketState {
    @Override
    public void islem(Soket soket) {
        System.out.println(soket.port + " Portu Kapandı!");
        soket.State = new SoketStateAc();  
    }
}
