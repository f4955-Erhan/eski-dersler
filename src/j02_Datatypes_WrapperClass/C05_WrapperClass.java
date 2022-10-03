package j02_Datatypes_WrapperClass;

import com.sun.jdi.ByteValue;

public class C05_WrapperClass {

    public static void main(String[] args) {

        String name ="Erhan";
        int yas = 29;

        System.out.println(name.toUpperCase());

        String tc ="737325823";
        String id = "98765";
        int yenitc = Integer.valueOf(tc);
        System.out.println("yenitc = " + yenitc);
        int yeniid = Integer.valueOf(id);
        System.out.println("yeniid = " + yeniid);

        System.out.println(yenitc+yeniid);
        
       // String okulno= "24134L";
       // int yeniokulno = Integer.valueOf(okulno);   // run time Exception-> çalışma zamanı hatası
       // System.out.println("yeniokulno = " + yeniokulno);
        // 24. satır run time hayası verirse alttaki printler çalışmaz

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        byte maxbytedeğeri = Byte.MAX_VALUE;
        System.out.println("maxbytedeğeri = " + maxbytedeğeri);
        byte minbytedeğeri = Byte.MIN_VALUE;

        int maxintdeğeri = Integer.MAX_VALUE;
        System.out.println("maxintdeğeri = " + maxintdeğeri);
        int minintdeğeri = Integer.MIN_VALUE;
        System.out.println("minintdeğeri = " + minintdeğeri);
        
        short maxishortdeğeri = Short.MAX_VALUE;
        System.out.println("maxishortdeğeri = " + maxishortdeğeri);
        short minishortdeğeri = Short.MIN_VALUE;
        System.out.println("minishortdeğeri = " + minishortdeğeri);

        long maxlongdeğeri = Long.MAX_VALUE;
        System.out.println("maxlongdeğeri = " + maxlongdeğeri);
        long mınlongdeğeri = Long.MIN_VALUE;
        System.out.println("mınlongdeğeri = " + mınlongdeğeri);




    }
}
