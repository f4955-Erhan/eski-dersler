package j25_Encapsulation.Task04;

public class main {
    /*
    Burada iki adet class vardır. Biri Main, diğeri ise student ,
    student classı içinde;
    String name(isim) ve int age(yaş)  variables(değişkenler) encapsulated ediniz.

    Main classın içinde;
    girilen değerleri aşagıdaki gibi print eden code create ediniz
    Örnek:
    age 12'dir.
    name Steven'dır.

    name(isim) olarak;
    "Student name is Steven"
    ve
    age(yaş) olarak da;
    "He is 12 years old"


 */
    public static void main(String[] args) {

        student oğrenci= new student("erhan",12,"4B");

        System.out.println("oğrenci = " + oğrenci);

    }
}
