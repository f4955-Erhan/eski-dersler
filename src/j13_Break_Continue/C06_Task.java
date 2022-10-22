package j13_Break_Continue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("bir metin giriniz içinde c harfi ola");
        String ifade = scan.nextLine();
        char aranan ='c';
        int aSay=0;
        for (int i = 0; i <ifade.length(); i++) {

            if (ifade.charAt(i)== 'a'){
                aSay++;
            } else if (ifade.charAt(i)=='c') {

                break;
            }

        }
        System.out.println("c ye kadar a sayısı = "+aSay);
    }
}
