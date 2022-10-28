package j18_Constructor;

public class C03_Student {//main olmayan sadece student obje create etmek için pojo-> plan old java obhject:
    //field->

    String ad;
    String soyad;
    int sınıf;
    double ortalama;
    int okulNo;
    boolean takdir;

    public void mezuniyet(){

        if (ortalama>=50){
            System.out.println("diploman hayırlı ola");
        }else System.out.println("tekrar bekleriz.");
    }

    @Override
    public String toString() {     //obj referans değeri print etmememsi için obj datalarını stringe çevirdi.
        return "C03_Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sınıf=" + sınıf +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                ", takdir=" + takdir +
                '}';
    }


}
