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
        for (; i <= keys.length-1; i++ ) {
            System.out.print(keys[i] + " ");
        }
        System.out.println(" ");
        System.out.print(jams[0] + "," + jams[1] + "," + jams[2] );
        System.out.println(" ");
        System.out.print(apartments[0] + "," + apartments[1] + "," + apartments[2] + "," + apartments[3]);
        System.out.println("");
        System.out.println(" ");
        System.out.print(keys[2]+"," + keys[1] + "," + keys[0]);
        System.out.println(" ");
        System.out.print(jams[2] + "," + jams[1] + "," + jams[0] );
        System.out.println(" ");
        System.out.print(apartments[3] + "," + apartments[2] + "," + apartments[1] + "," + apartments[0]);
        System.out.println("");

           //задача 4
        for (int v = 1; v < keys.length; v++){
            if (keys[v] % 2 != 0){
                keys[v]++;
            }
            System.out.print(keys[v] + ",");
        }






    }
}