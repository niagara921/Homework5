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
        for (int i = 0; i < keys.length; i++ ) {
            System.out.print(keys[i]);
            if (keys[i] < keys.length) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        for(int b = 0; b< jams.length; b++){
            System.out.print(jams[b]);
                if(jams[b]< jams.length){
                    System.out.print( ", ");
                }
        }
        System.out.println(" ");
        int f = 0;
        for(; f < apartments.length; f++) {
            System.out.print(apartments[f]);
                if(apartments[f] < apartments.length){
                    System.out.print( ", ");
               }
        }
        System.out.println(" ");

        //Задача 3

        for( int s = keys.length-1; s>=0; s--) {
            System.out.print(keys[s]);
            if (keys[s] > keys[0]) {
                System.out.print( ", ");
            }
        }
        System.out.println(" ");
        for (int z = jams.length-1;z >= 0; z--) {
            System.out.print(jams[z]);
                if (jams[z] > jams[0]) {
                    System.out.print(", ");
            }
        }
        System.out.println(" ");

        for(int d = apartments.length-1; d >= 0; d--){
            System.out.print(apartments[d]);
            if (apartments[d] > apartments[0]){
                System.out.print(", ");
            }
        }
        System.out.println(" ");
           //задача 4
        for (int v = 1; v < keys.length; v++){
            if (keys[v] % 2 != 0){
                keys[v]++;
            }
            System.out.print(keys[v] + ",");
        }
         // Задача 5
          int[] weights = {90, 93, 51};
          int[] weightsCopy = {90, 93, 51};{
              if(weights == weightsCopy){
                  System.out.println("Массивы одинаковые");
              }else{
                  System.out.println("Массивы разные");
              }
            for (int y = 0; y < weightsCopy.length; y++) {
                System.out.println(weightsCopy[y]);

            }
        }






    }
}