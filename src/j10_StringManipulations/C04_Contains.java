package j10_StringManipulations;

public class C04_Contains {
    public static void main(String[] args) {

/*
istenen stringin varlığını kontrol eder boolean return eder.
 */

        String s1 ="Erhan Bey başarılı bir Qa tester team lead";

        System.out.println(s1.contains("bey"));//false
        System.out.println(s1.contains("E"));//true
        System.out.println(s1.contains(" "));//true

        String s2 = "Qa";

        System.out.println(s1.contains(s2));//true
        System.out.println(s2.contains(s1));//false

        //task= girilen bir cümlede aranan kelimenin varlığını kontrol eden bir code creae et.(ternary ile yap)




    }
}
