package Apachi_POI;

public class _01_Array_2D {
    public static void main(String[] args) {
        String[][] zoo={{"a","1"},{"b","2"}};
        System.out.println(zoo[0][0]);
        System.out.println(zoo[0][1]);
        System.out.println(zoo[1][0]);
        System.out.println(zoo[1][1]);
        for (int i = 0; i <zoo.length ; i++) {
            for (int j = 0; j <zoo[i].length ; j++) {
                System.out.print( zoo[i][j]+" ");
            }
            System.out.println();
        }
    }
}
