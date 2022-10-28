package j17_ForEachLoop;

public class Task_10 {
    public static void main(String[] args) {
        int sayi[]={-1,3,4,-5,7,-6};

        sayiTersi(sayi);

    }

    private static void sayiTersi(int[] sayi) {
        int tersArr[]=new int[sayi.length];
        for (int a:sayi) {

            a*=-1;
            System.out.println(a+" ");



        }
    }
}
