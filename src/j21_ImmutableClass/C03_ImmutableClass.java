package j21_ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class C03_ImmutableClass {
    public static void main(String[] args) {
        /*
  Boolean, Short, Integer, Long, Float, Double, Char ve String gibi tüm kapsayıcı sınıflar (Wrapper Class)
  BigDecimal, BigInteger java'da immutable sınıflara örnek olarak gösterilebilir.
        Date, StringBuilder, StringBuffer, Arrays ve ArrayList de Mutable (değişebilir) class'lardır.

        mesela String methodları sadece var olan değerle alakalı işlem yapar ımmutable. fakat değişiklik yapmaz değişiklik yapması için atama ister.

        ancak array list arrays lerde ise yapılan method aynı zamanda bir değişikliğe sebep olur mutable(değişen)
 */
        String name ="erhan";
        System.out.println(name);

        name.concat("javacan");

        System.out.println("name = " + name);//name method sonrası aynı değerde kaldı.

        List<String>isimList = new ArrayList<String>();//boş String list
        isimList.add("Fatih");
        isimList.add("Kemal");
        isimList.add("Cemal");
        isimList.remove(1);
        isimList.set(1,"javacan");

        System.out.println("isimlist son hali"+isimList);


    }
}
