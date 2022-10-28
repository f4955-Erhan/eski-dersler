package j18_Constructor;

public class C03_StudentRunner {
    public static void main(String[] args) {
        C03_Student öğrenci1 =new C03_Student();

        öğrenci1.ad="erhan";
        öğrenci1.okulNo=746;
        öğrenci1.sınıf=11;
        öğrenci1.soyad="yıldız";
        öğrenci1.takdir=true;
        öğrenci1.ortalama=55;
        System.out.println(öğrenci1);
        öğrenci1.mezuniyet();

        C03_Student öğrenci2 =new C03_Student();

        öğrenci2.ad="erhan";
        öğrenci2.okulNo=746;
        öğrenci2.sınıf=11;
        öğrenci2.soyad="yıldız";
        öğrenci2.takdir=true;
        öğrenci2.ortalama=85;
        System.out.println(öğrenci2);
        öğrenci2.mezuniyet();
    }
}
