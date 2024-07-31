package ex_28072024;

public class Lab074 {

    public static void main(String[] args) {


        // class - Attribute / properties - data types - primitive and Non- primitive
        // Class -- Behaviour / Methods -- Functions-

        // Object - real entity - class-
        // ClassName classref = new ClassName();
        // new ClassName(); - Object;
        // classref --- Class ref
        // ClassName --- Class Name


        BuildingBP dlf = new BuildingBP();
        dlf.name = "DLF PVT LIMITED";
        dlf.no_of_rooms = 10;


        dlf.uselift();

        BuildingBP prestige = new BuildingBP();
        prestige.name = "Prestige limited";
        prestige.no_of_rooms = 100;

        prestige.uselift();


    }
}
