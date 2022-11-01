package j24_AccessModifier.farklıPackage;

import j24_AccessModifier.C01_AccessModifier;

public class C03_AccessModifier {
    private String PrivateTimlead="Hakan Aydın";
    String defaultName="cebrail";
    protected  String  protectedName="dilek";
    public  String publicName="kemal";

    public static void main(String[] args) {
        C01_AccessModifier obj = new C01_AccessModifier(23,45);//public constructora ulaşıldı

        System.out.println("obj.publicYas = " + obj.publicYas);// public veriable ulaşıldı
        // obj02.defaultyas default veriable package dışı erişilemez
        // obj02.protectedMethod() protcted method  package dışı çalışmaz



    }
}
