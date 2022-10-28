package j20_PassByValue;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class homework1 {
    /*
      Task:

    Create 2D ArrayList which can store String ArrayLists
    Create 3 ArrayLists which are Employees, Employers, Companies
    Store this 3 ArrayList in 2D ArrayList
    String data type ArrayList'leri depolayabilen 2D ArrayList create ediniz
    Çalışanlar, İşverenler, Şirketler olmak üzere 3 ArrayListesi oluşturun
    Bu 3 ArrayList'i 2D ArrayList'te saklayın
     */




    public static void main(String[] args) {



            ArrayList<String> işçi = new ArrayList<>(List.of("a", "b", "c"));
            ArrayList<String> işveren = new ArrayList<>(List.of("d", "e", "f"));
            ArrayList<String> şirket= new ArrayList<>(List.of("holding1", "holding2", "holding3"));

            ArrayList<ArrayList<String>> saklamaAlan = new ArrayList<>(Arrays.asList(işçi, işveren, şirket));

            System.out.println(saklamaAlan);


    }

}
