package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {


/*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
   String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */
        String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


        System.out.println(" "+pickName.charAt(pickName.indexOf("E")) +
                pickName.charAt(pickName.indexOf("R")) +
                pickName.charAt(pickName.indexOf("H")) +
                pickName.charAt(pickName.indexOf("A")) +
                pickName.charAt(pickName.indexOf("N")));

    }
}
