package ex_28072024;

public class Animal {
    String name = "Pussy";
    String color;

    void walk(){}
    void talk(){}

    public static void main(String[] args) {
        Animal animalref = null;
        Animal animalref2 = new Animal();
        animalref2.name = "dog";
        Animal animalref3 = new Animal();
        System.out.println(animalref2.name);
        System.out.println(animalref3.name);
    }
}
