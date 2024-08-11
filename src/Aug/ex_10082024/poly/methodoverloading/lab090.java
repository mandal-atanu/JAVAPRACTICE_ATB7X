package Aug.ex_10082024.poly.methodoverloading;

public class lab090 {

    public static void main(String[] args) {
        mathoperation math = new mathoperation();
        System.out.println(math.add(3,2));

        double result = math.add(2.4,3.6);
        System.out.println(result);

        String result2 = math.add("Atanu", "Mandal");
        System.out.println(result2);
    }
}
