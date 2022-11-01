package j18_Constructor.lesson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lesson {
     /*
    Task 03 ->
    Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
     */

    String LessonName;
    int credit;

    Lesson ders0= new Lesson("matematik",3);
    Lesson ders1= new Lesson("sosyoloji",5);
    Lesson ders2= new Lesson("ingilizce",2);

    public  Lesson(String LessonName, int credit) {
        this.LessonName = LessonName;
        this.credit = credit;


        List<String>dersler= new ArrayList<>();
        dersler.add(LessonName);

        List<Integer>kredi= new ArrayList<>();
        kredi.add(credit);


    }




}

