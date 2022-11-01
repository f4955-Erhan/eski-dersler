package j23_Varargs_StringBuilder.Varargs;

public class Task {
    /*
  Task ->
  verilen Stringleri birlestiren concat isimli METHOD create ediniz.
  input : "e", "r", "h", "a","n";
  output : erhan
   */
    public static void main(String[] args) {
                  String arr1[] ={"e", "r", "h", "a","n"};
                  String arr2[] ={"a","l","i"};

                  strBirleş(arr1);
                  strBirleş(arr2);
    }
    public static void strBirleş(String...a){
        String birleştirme="";

        for (String b:a){

            birleştirme=birleştirme.concat(b);
        }
        System.out.println(birleştirme);
    }

}
