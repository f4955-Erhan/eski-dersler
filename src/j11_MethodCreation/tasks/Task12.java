package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

    /*    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden method create ediniz

    Şartlar:
    2* Bir mail adresinde @ karakteri olmalı
    3* Bir mail adresinde . (nokta) karakteri olmalı
    1* Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen e-mail adresinizi giriniz : ");
        String email = scan.nextLine().trim();

        kaliteKontrol(email);
        System.out.println(kaliteKontrol(email));

    }
    private static boolean kaliteKontrol(String email) {

        boolean flag = false;
        if (email.contains("@") && email.indexOf("@") == email.lastIndexOf("@")){
            if (email.contains(".") && email.indexOf(".") == email.lastIndexOf(".")){
                if (email.indexOf("@") > 0){
                    flag = true;
                }
            }
        }
        return flag;


    }


}

//(eMail.indexOf(eMail.substring(0,'@'))>=1 && eMail.contains("@") && eMail.contains("."))?
//             (eMail.lastIndexOf("@")!=eMail.indexOf("@")&&eMail.lastIndexOf(".")!=eMail.indexOf("."))?(t):(f):(f);