public class Singleton2 {

    private static Singleton2 nesne2 = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 Nesne2() {
        return nesne2;
    }

}
