package j15_Arrays.j15_Arrays;

public class Task14 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
        String str = "ade1r4d3";
        String rakam=str.replaceAll("\\D","");
        String yeniStr[] = rakam.split("");

        rakamTop(yeniStr);
    }
    private static void rakamTop(String[] yeniStr) {
        int rakamTop = 0;
        for (int i = 0; i < yeniStr.length; i++) {

            rakamTop += Integer.parseInt(yeniStr[i]);
        }
        System.out.println(rakamTop);
    }


}


