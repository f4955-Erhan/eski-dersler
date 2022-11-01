package j23_Varargs_StringBuilder.Varargs;

import java.util.Scanner;

public class Task02 {
    //girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarp


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen arr uzunluğu tanımlayın : ");
        int arr[]=new int[scan.nextInt()];

        for(int i=0;i<arr.length;i++){
            System.out.println(i+1+ ". sayıyı giriniz : ");
            arr[i]=scan.nextInt();
        }
        işlem(arr[0], arr);
    }
    public static void işlem(int a , int ... b){
int toplam = 0;

int çarp=a;
        for (int i = 1; i < b.length; i++) {
            toplam+=b[i];
        }
        çarp*=toplam;
        System.out.println(çarp);
    }


}
