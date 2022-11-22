package J36_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
/*
    ismi update() olan bir method oluşturun.
    Parametreleri , Integer -String HashMap,  int ve String olmalı. (3ayrı parametre)
    return tipi  Integer - String HashMap
    Eğer HashMap, int olan parametreyi içeriyorsa,
    int değerinde var olan String'i güncelleyin.
    Örnek :
     Hash map:
    1, "New jersey"
    2, "New York"
    3, "London"
    4, "Paris"

    int = 3
    String = Miami
    cevap aşağıdaki gibi olmalı:
    1, "New jersey"
    2, "New York"
    3, "Miami"
    4, "Paris"
     */


        Scanner scanner = new Scanner(System.in);
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"New Jersey");
        map.put(2,"New York");
        map.put(3,"Lonodn");
        map.put(4,"Paris");

        System.out.println("lütfen key için sayı giriniz  :");
        int key = scanner.nextInt();

        System.out.println("lütfen value değişikliği için bir kelime giriniz :");
        String value = scanner.next();


        update(map,key,value);
    }

    private static void update(Map<Integer, String> map, int key, String value) {

        map.replace(key,value);
        System.out.println(map);

    }
}
