package j14_Scope;

public class C04_LocaleVeriable {
    public static void main(String[] args) {

        int yas =33; // main method local veriable.
        System.out.println("yas = "+yas); //33

        for (int i = 0; i < 7; i++) {
            System.out.println(yas+" :) ");

        }
        yas=35;

        // i=25; local dışı for a ait
    }
    //yas =48; lokal dışı call edilemez maine ait.
}
