package j23_Varargs_StringBuilder.Varargs;

public class Task3 {
    public static void main(String[] args) {
        //girilen bir sayı ile girilen stringlerin en uzun harf sayısını  çarpıp prin eden method create ediniz
        int sayi = 4;
        String str1 = "erhan yıldız";
        String str2 = "erhan yıldız erhan";
        String str3 = "erhan yıldız erhan yıldız";

        String arr[] = new String[]{str1, str2, str3};
        işlem(sayi, arr);
    }
    public static void işlem(int a, String... arr) {
        int uzunluk = 0;
        int sonIşlem = a;
        for (String str : arr) {
            if (str.length() > uzunluk) {
                uzunluk = str.length();
            }
        }
        sonIşlem *= uzunluk;
        System.out.println(sonIşlem);
    }

}
