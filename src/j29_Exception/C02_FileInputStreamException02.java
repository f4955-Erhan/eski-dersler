package j29_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException02 {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/Users/meleksahin/IdeaProjects/javaLearn/src/ebikGabık");
            int k;
            try {
                while ((k = fis.read()) != -1) {
                    System.out.println((char) k);
                }
                System.out.println("afam içteki try blocktan selamlar");
            } catch (IOException e) {
                System.out.println("agam dosya okunamiyi");
                System.out.println("agam içteki catch blocktan selamlar");
            }
            System.out.println("agam dıştaki try block");
        } catch (FileNotFoundException e) {
            System.out.println("agam dediğin dosya okunamayır");
            System.out.println("agam dıştaki catch locktna selamlar");
        }
    }
}
