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


    public Lesson(String LessonName) {
        this.LessonName = LessonName;

        List<String>dersler= new ArrayList<>();

        dersler.add(LessonName);

    }




}

