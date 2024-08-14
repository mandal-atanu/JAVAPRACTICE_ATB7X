package Aug.ex_11082024.multipleinheritance;

public class son implements father,mother{
    @Override
    public void money() {
        System.out.println("this is the only one function");
    }

    @Override
    public void home() {

    }
}
