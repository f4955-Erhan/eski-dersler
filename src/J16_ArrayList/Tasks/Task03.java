package J16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Task ->  bir listte istenen sayının varlığı kontrol eden code create ediniz.

        Scanner scan=new Scanner(System.in);
        List<Integer> sayilar=new ArrayList<>(Arrays.asList(1,5,6,7,3,724,23,12,213));

        System.out.println("lütfen aradığınız sayıyı giriniz : ");
        int sayi= scan.nextInt();
        boolean flag=false;

        for (int i = 0; i < sayilar.size(); i++) {
            if (sayi==sayilar.get(i)){
                flag=true;
                System.out.println("aradığınız sayı bizde mevcuttur .");
                break;

            }
        }
        if (flag==false){
            System.out.println("aradığın sayı bizde gayr-i mevcut");
        }




    }
}
