package Aug.ex_11082024.reallifeex;

abstract class Bsseclass extends grandbaseclass{

    abstract String openbrowser(String browser);

    abstract String closebrowser(String browser);

    @Override
    void screenshot() {
        System.out.println("ok taking screesnhot ");
    }
}
