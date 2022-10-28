package j18_Constructor;

public class C07_Ogretmen {
    //fields
    String name;
    int tecrube;
    int kıdem=5;

    public C07_Ogretmen(String name, int tecrube) {//iki parametreli constructor
        this.name = name;
        this.tecrube = tecrube;
    }

    public void kıdemHesaplama(int kıdem) {
        System.out.println("agam kıdemin :"+(kıdem*2));
        System.out.println("agam kıdemin :"+(this.kıdem*2));

    }
}
