package j29_Exceptions;

public class C07_IllegalargumentException02 {
    public static void main(String[] args) {

        try {
            System.out.println("try block başı selamlar");
            hata();
            System.out.println("try block sonu selamlar");

        }catch (IllegalArgumentException e){
            System.out.println("catch block başı selamlar");

            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();

            System.out.println("catxh block sonu selamlar");

        }





    }

    public static void hata(){

        throw new IllegalArgumentException("agam neettin de hataya düştün"); //throw new IllegalStateException obje ürettik


    }
}
