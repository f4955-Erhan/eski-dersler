package j12_Loops.L01_forloop.Tasks;

import java.util.Scanner;

public class Task12_Nested {
    public static void main(String[] args) {
       
        //girilen 5 sayının 10 ile 20 arası hariç diğerlerinin toplamının hesap eden


        Scanner scan =new Scanner(System.in);
        int toplam =0;

        for (int i = 1; i <6; i++) {

            System.out.print(i+"."+"sayi giriniz : ");
            int girilenSayi = scan.nextInt();

            if (girilenSayi<10||girilenSayi>20){

                toplam+=girilenSayi;
            }
        }
        System.out.println("Şartlara bağlı olarak girilen sayılar toplamı = "+toplam);

        

    }
}
