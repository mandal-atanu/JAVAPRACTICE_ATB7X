package Aug.ex_24082024;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab139 {
    public static void main(String[] args) {

        student s1 = new student(4,"Madan");
        student s2 = new student(2,"souvik");
        student s3 = new student(1, "Gola");
        student s4 = new student(3,"mama");
        student s5 = new student(4,"Atanu");

        List arrylist = new ArrayList<>();

        arrylist.add(s1);
        arrylist.add(s2);
        arrylist.add(s3);
        arrylist.add(s4);
        arrylist.add(s5);

        System.out.println(arrylist);

        Collections.sort(arrylist,new sortbyid());

        System.out.println(arrylist);

        Collections.sort(arrylist,new sortbyname());

        System.out.println(arrylist);

        System.out.println(arrylist.indexOf(s1));



    }
}

class sortbyid implements Comparator<student>{

    @Override
    public int compare(student o1, student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}

class sortbyname implements Comparator<student>{

    @Override
    public int compare(student o1, student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class student{
     private  Integer id;
     private String name;

    public student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }



//    @Override
//    public int compareTo(student o) {
//        return Integer.compare(this.id,o.id);
//        //return CharSequence.compare(this.name,o.name);
//    }

//    @Override
//    public int compareTo(student o) {
//        return CharSequence.compare(this.name,o.name);
//    }
}
