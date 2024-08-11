package Aug.ex_10082024.poly.methodoverriding;

public class lab091 {
    public static void main(String[] args) {
        hound h1 = new hound();

        h1.bark();
        h1.bike();

        dog d1 = new dog();

        d1.bark();

        dog d2 = new hound();

        d2.bark();
    }
}
