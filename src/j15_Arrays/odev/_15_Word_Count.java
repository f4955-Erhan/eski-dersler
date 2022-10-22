package j15_Arrays.odev;

public class _15_Word_Count {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */
        String cümle = "Removes white space from both ends of a string";
        String cümleArr[]=cümle.split(" ");
        System.out.println("kelime sayısı = "+cümleArr.length);


    }
}