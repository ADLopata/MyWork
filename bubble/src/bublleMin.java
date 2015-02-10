import java.util.Arrays;

/**
 * Created by Персикс on 05.02.2015.
 */
public class bublleMin {
    public static void main(String[] args) {
//перестановка массива от большего к меньшему
        int data[] = {10, 20, 30, 40, 50};
        for (int index = data.length/2; index >=0; index--) {
          swep(data, index, data.length - 1 - index);
            System.out.print(index);
            System.out.println();
        }

//перестановка массива от меньшего к большему

      //  int data[] = {10, 20, 30, 40, 50,60,70,80,90,100};
        //for (int index = 0; index < data.length / 2; index++) {
          //  swep(data, index, data.length - 1 - index);
            //System.out.print(index);
             //System.out.println();
      //  }
        System.out.println(Arrays.toString(data));
    }

//сортировка массива от меньшего элемента

   /* int[]data={30,10,20,50,40};
    for (int barrier=0; barrier <data.length; barrier++) {
        for(int indeks=data.length-1; indeks>barrier;indeks--){
            if(data[indeks]<data[indeks-1]){
                swep(data,indeks,indeks-1);
            }
            System.out.print(indeks);
        }
        System.out.println();
    }
    System.out.println(Arrays.toString(data));
}*/

    private static void swep(int[] data, int indeks, int j) {
        int bufer= data[indeks];
        data[indeks]=data[j];
        data[j]=bufer;
    }

}
