package ex_27072024;

public class Lab068_Max_Min_salary {
    public static void main(String[] args) {

        int salaries[] = {4,5,10,9,35,5,50};

        int max_sal = salaries[0];

        int min_sal = salaries[0];

        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > max_sal){
                max_sal = salaries[i];
            }

            if (salaries[i] < min_sal){
                min_sal = salaries[i];
            }


        }
        System.out.println(max_sal);
        System.out.println(min_sal);


    }
}
