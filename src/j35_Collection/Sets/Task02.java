package j35_Collection.Sets;

import java.util.*;

public class Task02 {
    public static void main(String[] args) {
        /*
       deger  ataması yapılmış array i Arrayliste çeviren method create ediniz main içerisinde metodun return ettiği erray listi
       hasset LinkedHashSet ve TreeSet e çeviriniz
         */

        String arr[] ={"e","j","c","b","a","f","g"};

        cevir(arr);

        HashSet<String>hs1= new HashSet<>(cevir(arr));
        LinkedList<String >Lhs= new LinkedList<>( cevir(arr)) ;
        TreeSet<String> Rhs= new TreeSet<>(cevir(arr)) ;

        System.out.println("hs1 hurra set= " + hs1);
        System.out.println("Lhs erken gelen set = " + Lhs);
        System.out.println("Rhs  alfabetik set= " + Rhs);


    }

    private static ArrayList<String> cevir(String[] arr) {

        ArrayList<String > List = new ArrayList<>(Arrays.asList(arr));

        return List;
    }
}
