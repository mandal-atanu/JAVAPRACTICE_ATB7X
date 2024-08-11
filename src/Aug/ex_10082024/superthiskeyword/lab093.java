package Aug.ex_10082024.superthiskeyword;

public class lab093 {
    public static void main(String[] args) {
        student s1 = new student();

        s1.dispay();
    }


}

class student extends person{

    @Override
    void message(){
        System.out.println("I am studenr");
    }

    void dispay(){
        super.message();
        this.message();
    }

}

class person{
    void message(){
        System.out.println("I am person");
    }
}
