import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int[] keys = new int[3];
        double[] jams = {1.57, 7.654, 9.936};
        int[] apartments = new int[4];
        // Задача 2
        int keysOne = 1;
        int keysTwo = 2;
        int keysThree = 3;

        keys[0] = keysOne;
        keys[1] = keysTwo;
        keys[2] = keysThree;

        double jamsOne = 1.57;
        double jamsTwo = 7.654;
        double jamsThree = 9.936;
        jams[0] = jamsOne;
        jams[1] = jamsTwo;
        jams[2] = jamsThree;

        int apartmentOne = 1;
        int apartmentTwo = 2;
        int apartmentThree = 3;
        int apartmentFour = 4;
        apartments[0] = apartmentOne;
        apartments[1] = apartmentTwo;
        apartments[2] = apartmentThree;
        apartments[3] = apartmentFour;

        for (int i = 0; i < keys.length; i++) {
            System.out.print(keys[i]);
            if (i < keys.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        for (int b = 0; b < jams.length; b++) {
            System.out.print(jams[b]);
            if (b < jams.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        int f = 0;
        for (; f < apartments.length; f++) {
            System.out.print(apartments[f]);
            if (f < apartments.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        //Задача 3

        for (int s = keys.length - 1; s >= 0; s--) {
            System.out.print(keys[s]);
            if (s != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        {

        }

        for (int z = jams.length - 1; z >= 0; z--) {
            System.out.print(jams[z]);
            if (z != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        {

        }

        for (int d = apartments.length - 1; d >= 0; d--) {
            System.out.print(apartments[d]);
            if (d != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");


        //задача 4


        for (int v = 0; v < keys.length; v++) {
            if (keys[v] % 2 != 0) {
                keys[v]++;
            }
            System.out.print(keys[v]);
            if (v < keys.length - 1) {
                System.out.print(", ");
            }
        }
    }
}


