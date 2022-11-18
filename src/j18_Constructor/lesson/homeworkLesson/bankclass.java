package j18_Constructor.lesson.homeworkLesson;

import java.util.ArrayList;
import java.util.Scanner;

public class bankclass {
    public  void cagırıcı(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<lesson> dersList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("ders adını giriniz: ");
            String lessonname = scanner.nextLine();
            System.out.println("dersin kredisini giriniz: ");
            int lessoncredit = scanner.nextInt();
            scanner.nextLine();
            lesson lessn = new lesson(lessonname, lessoncredit);
            dersList.add(lessn);
        }
        student studnt = new student();
        studnt.studentName = "gülsüm";
        studnt.maxCredit = 10;

        for (lesson less : dersList) {
            if (studnt.toplamkredi() + less.lessoncredit <= studnt.maxCredit) {
                studnt.derslist.add(less);
                System.out.println("Alabildiğiniz dersler : "+less.lessonname);
            } else {
                System.out.println("Alabileceğiniz max krediyi aştınız. "+ less.lessonname+" :dersini alamazsınız.");
                break;

            }
        }

    }
    }

