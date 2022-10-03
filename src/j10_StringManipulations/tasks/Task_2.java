package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        //task 2 =girilen e-mail hesabı @gmail.com içermiyorsa"lütfen gmail hesabı giriniz
        //@gmail.com içeriyorsa hesabınız onaylandı aksi durumda geçerli hesap print ediniz create edin.


        Scanner scan=new Scanner(System.in);

        System.out.print("mail giriniz : ");
        String email = scan.nextLine();



        System.out.println(email.contains("@gmail.com") ? "hesabınız onaylandı" :"lütfen gmail giriniz ");


    }
}
