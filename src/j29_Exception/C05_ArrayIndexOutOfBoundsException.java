package j29_Exception;

public class C05_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] arr = {24, 27, 30, 33};

        try {
            System.out.println(arr[10]);
            System.out.println("sıkıntı yok denedik oldu");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("hovam öylr bir index yok ");
            System.out.println("catch block selamlar");
        }

        System.out.println("devam et baba");

    }
}
