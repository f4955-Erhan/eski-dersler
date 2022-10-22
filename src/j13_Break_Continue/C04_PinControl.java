package j13_Break_Continue;

import java.util.Scanner;

public class C04_PinControl {
    public static void main(String[] args) {
        //String data type bir pin datasının 3 giriş hakkında kontrol edin.
        Scanner scan = new Scanner(System.in);

        String doğruPin = "javaCAN";



        for (int i = 1; i <= 3; i++) {

            System.out.println("pingir");
            String pin = scan.nextLine();
            if (pin.equals(doğruPin)) {
                System.out.println("doğru pin...");
                break;
            } else {
                System.out.println(i + "hakkını kullandın.");
                if (i == 3) {
                    System.out.println("hakkın bitti bloke");
                    break;
                }
            }



        }
    }
}
