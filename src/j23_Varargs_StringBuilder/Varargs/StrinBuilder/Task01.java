package j23_Varargs_StringBuilder.Varargs.StrinBuilder;

public class Task01 {
    public static void main(String[] args) {

     /*
Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
       olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
    (without case sensitivity)
    Eg : input : I love Java
    Output: "Reversed sentence : avaJ evol I
       It is not a palindrome"

 */

        StringBuilder sb = new StringBuilder();
        sb.append("talat");

        tersString(sb.toString());
        System.out.println("tersString(sb.toString()) = " + tersString(sb.toString()));

    }


    public static boolean tersString(String s) {


        if (s == null) {
            return false;


        }
        return new StringBuilder(s).reverse().toString().equalsIgnoreCase(s);
    }


}
