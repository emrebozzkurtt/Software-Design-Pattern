public class Soket {
    public int port;
    public ISoketState State;
    
    public Soket(int port) {
        this.port = port;
        State = new SoketStateAc();
    }
    public int getPort() {
        return port;
    }
    public void setPort(int port) {
        this.port = port;
    }
    public ISoketState getState() {
        return State;
    }
    public void setState(ISoketState state) {
        State = state;
    }
    public void yap(){
        State.islem(this);
    }
}
