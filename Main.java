package bangundatar;

public class Main {
    public static void main (String [] args ) {
        Polymorp poly = new Polymorp();
        poly.poly(new Persegi());
        poly.poly(new PersegiPanjang());
        poly.poly(new Segitiga());
    }
}
