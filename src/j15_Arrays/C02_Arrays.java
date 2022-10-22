package j15_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        // arry eleman varmı yok mu

        int arr[]={12,31,23,45,67,43};

        Arrays.sort(arr);

        System.out.println(Arrays.binarySearch(arr, 67));

        int sayi=23;
        boolean flag=false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]==sayi){

                flag =true;
                break;
            }

        }
        if (flag==true){
            System.out.println("aradığınız sayı arr da var");

        }else System.out.println("araddığınz sayı arr da var. ");


        int a[]={2,6,45,32,43,12,4,542,23,12};

        Arrays.sort(a);

        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.binarySearch(a, 32));


    }
}
