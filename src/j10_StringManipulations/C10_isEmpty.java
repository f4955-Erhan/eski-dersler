package j10_StringManipulations;

import java.util.Scanner;

public class C10_isEmpty {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);

        String name = "erhan";
        System.out.println("name boş mu"+ name.isEmpty());

        System.out.println(name.replaceAll("\\w","").isEmpty());//true






    }
}
