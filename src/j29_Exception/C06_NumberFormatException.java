package j29_Exception;

public class C06_NumberFormatException {
    public static void main(String[] args) {

        String str ="1453";
        System.out.println("str+5 = " + str + 5);

        int sayi=Integer.parseInt(str);
        System.out.println("sayi = " + sayi);

        String id="57l622";

        try {
            int i=Integer.parseInt(id);
            System.out.println("denedik sıkıntı yok");

        }catch (NumberFormatException e){
            System.out.println("hatalı işlem");

        }

    }
}
