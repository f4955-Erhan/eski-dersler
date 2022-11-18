package j18_Constructor.lesson;

public class Student {
    /*Student Class : fields : name, maxCredit, dersleri(Lesson class obj) saklayacak list
    derslerin toplam kredi miktarını return eden  toplamKredisi method*/

    String studentName;
    int maxCredit;
    String dersleri;

    Lesson öğrenci= new Lesson("erhan",10);

    public Student(String studentName, int maxCredit) {
        this.studentName = studentName;
        this.maxCredit = maxCredit;


    }



}

