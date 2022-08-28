import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

         int[] keys = new int [3];
         double[] jams = {1.57, 7.654, 9.936};
         int[] apartments = new int[4];
         // Задача 2

        int key = 1;
        int twoKey = 2;
        int threeKey = 3;
        keys[0]= key;
        keys[1] = twoKey;
        keys[2] = threeKey;
        System.out.println(" ");
        double jamOne = 1.57;
        double jamTwo = 7.654;
        double jamThree =9.936;
        jams[0] = jamOne;
        jams[1] = jamTwo;
        jams[2] = jamThree;
        int apartmentOne = 1;
        int apartmentTwo = 2;
        int apartmentThree = 3;
        int apartmentFour = 4;
        apartments[0] = apartmentOne;
        apartments[1] = apartmentTwo;
        apartments[2] = apartmentThree;
        apartments[3] = apartmentFour;
        int i= 0;
        for (; i < keys.length; i++ ) {
            System.out.print(keys[i] + ", ");
        }
        System.out.print(keys[keys.length-1]);
        System.out.println(" ");

        for(int b = 0; b< jams.length; b++){
            System.out.print(jams[b] + ", ");
        }
        System.out.print(jams[jams.length-1]);
        System.out.println(" ");
        int f = 0;
        for(; f<apartments.length; f++) {
            System.out.print(apartments[f] + ", ");
        }
        System.out.print(apartments[apartments.length-1]);
        System.out.println(" ");

        //Задача 3
        int s = 1;
        for(s = keys.length-1; s>0; s--) {
            System.out.print(keys[s] + ", ");
        }
        System.out.print(keys[0]);
        System.out.println(" ");
        for (int z = jams.length-1;z > 0; z--) {
            System.out.print(jams[z] + ", ");
        }
        System.out.print(jams[0]);
        System.out.println(" ");
        for(int d = apartments.length-1; d > 0; d--){
            System.out.print(apartments[d] + ", ");
        }
        System.out.print(apartments[0]);
        System.out.println("");

           //задача 4
        for (int v = 1; v < keys.length; v++){
            if (keys[v] % 2 != 0){
                keys[v]++;
            }
            System.out.print(keys[v] + ",");
        }

          int[] weights = {90, 93, 51};




    }
}