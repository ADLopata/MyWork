import java.util.Arrays;

/**
 * Created by Персикс on 05.02.2015.
 */
public class bublleMax {public static void main(String[] args) {
    int[] data = {40,10, 20, 50, 30};
    for (int barrier=data.length-1; barrier >=0; barrier--) {
        for(int indeks=0; indeks<barrier;indeks++){
            if(data[indeks]> data[indeks+1]){
                swep(data,indeks, indeks+1);
            }
            System.out.print(indeks);
        }
        System.out.println();
    }

    System.out.println(Arrays.toString(data));

}

    private static void swep(int[] data, int indeks, int j) {
        int temp= data[indeks];
        data[indeks]=data[j];
        data[j]= temp;
    }
}
