package j21_ImmutableClass;

public class C01_ImmutableClass {
    public static void main(String[] args) {
        String str1="hello"; //ilk değeri  murat atanan str1  veriable
        String str2="hello";// str1 ve str2 aynı ilk değere sahip olduğu için String havuzunda ortak

        String str3=new String("hello");//değerleri aynı referansları farklı obj
        String str4=new String("hello");//değerleri aynı referansları farklı obj

        String str5=str1+"";

        System.out.println( str1 == str2);//T
        System.out.println(str1 == str3);//F
        System.out.println(str1.equals(str2));//T
        System.out.println(str3 == str4);//F
        System.out.println(str1 == str5);//F
        System.out.println(str1.equals(str5));//T



    }
}
