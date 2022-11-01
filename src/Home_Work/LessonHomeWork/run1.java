package Home_Work.LessonHomeWork;

import j18_Constructor.lesson.Student;

import java.util.ArrayList;

public class run1 {

    public static void main(String[] args) {
        student1 bağla = new student1();

        lesson1 ders0 = new lesson1("matematik", 3);
        student1.dersList.add(ders0);

        lesson1 ders1 = new lesson1("sosyoloji", 4);
        student1.dersList.add(ders1);

        lesson1 ders2 = new lesson1("ingilizce", 8);
        student1.dersList.add(ders2);


        student1 öğrenci = new student1("erhan", 10);

        student1.dersler(öğrenci);


    }
}
