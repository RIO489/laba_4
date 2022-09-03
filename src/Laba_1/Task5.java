package Laba_1;

public class Task5 {
    public static void main(final String[] args) {
        final int n =3;
        final int m =4;
        final  int [][] arr = new int[n][m];
        create(arr,n,m);
        System.out.println("Arr:");
        display(arr,n,m);
        final int [][] Tarr = new int[m][n];//створення нової матриця,яка буде транспоновуваною версією першої матриці
        transposition(arr,n,m,Tarr);
        System.out.println("Tarr:");
        display(Tarr,m,n);
    }
    public static void create(final int[][] arr,final int n,final int m)
    {
        for (final int[] ints : arr)
            for(int j = 0;j<m;j++)
                ints[j] = (int )(Math.random() * 10);
    }
    public static void display(final int[][] arr,final int n,final int m)
    {
        for (final int[] ints : arr) {
            for (int j = 0; j < m; j++) {
                System.out.println(ints[j]);
            }
            System.out.println(" ");
        }


    }
    public  static  void transposition(final int[][] arr,final int n,final int m,final int[][] Tarr)
    {
        for(int i =0;i < n;i++)
            for(int j = 0;j<m;j++)
                Tarr[j][i] = arr[i][j];
    }
}
