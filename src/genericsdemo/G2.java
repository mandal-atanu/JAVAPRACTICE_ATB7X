package genericsdemo;

public class G2 {

    public static void main(String[] args) {
        System.out.println("the maximum is-->"+maximumOf(2,3,4));
    }
    public static <DT extends Comparable<DT>> DT maximumOf(DT a, DT b, DT c){

        DT max = a;
        if (b.compareTo(max) > 0){
            max = b;
        }
        if (c.compareTo(max)> 0){
            max = c;
        }

        return max;
    }
}
