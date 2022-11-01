package Home_Work.LessonHomeWork;

import java.util.ArrayList;

public class student1 {

    String studentName;
    int maxCredit;
   static ArrayList<lesson1> dersList = new ArrayList<>();

    public student1(String studentName, int maxCredit) {
        this.studentName = studentName;
        this.maxCredit = maxCredit;
    }

    public student1() {

    }

    public static void dersler(student1 öğrenci) {

        System.out.println("öğrenciimiz : "+öğrenci.studentName);
        int toplam=0;
        for (lesson1 a:dersList) {

            if (toplam+a.credit< öğrenci.maxCredit) {
                toplam+=a.credit;

                System.out.println("alınan ders : "+a.LessonName+" kredisi : "+a.credit+" kalan krediniz : "+ (öğrenci.maxCredit-toplam));

            }else System.out.println(" agam "+a.LessonName+"dersinin kredisi"+a.credit+" senin kredin : "+(öğrenci.maxCredit-toplam)+" maalesef kredin yetesiz");

        }



    }
}
