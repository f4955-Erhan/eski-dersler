package j12_Loops.L03_DoWhileLoop;

public class C01_DoWhileLoop {
    public static void main(String[] args) {
        //While loop --> önce şart kontrol edilir true alınırsa body action çalışır.
        //do-While Loop -->  önce body çalşır sonra şart kontrol edilir şart true ise döngü devam eder, false ise döngü kırılır döngü
        //sonrası ilk satır çalışır.do While loop oyun apk larında daha çok kullanılır.
        //TRİCK --> Wile loop şart sağlanmazsa hiç çalışmaz, doWhile loop ise ne olursa olsun 1 kere çalışır.

        int yas =33;
        while (yas<33){
            System.out.println("agam yaş daha "+yas);
            System.out.println("while body action");
            yas++;

        }

        do {
            System.out.println("agam yaş 33 ");
            System.out.println("do while body action");
            yas++;
        }while (yas<33);




    }
}
