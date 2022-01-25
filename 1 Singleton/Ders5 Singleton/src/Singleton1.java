public class Singleton1 {

    private static Singleton1 nesne1;
    
    private Singleton1() {
    }

    public static Singleton1 Nesne1(){
        
        if(nesne1 == null){
            nesne1 = new Singleton1();
        }

        return nesne1;
    }
}
