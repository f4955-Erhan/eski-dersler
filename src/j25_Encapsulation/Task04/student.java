package j25_Encapsulation.Task04;

public class student {

    private String name;
    private int age;
    private String sınıf;

    public student(String name, int age, String sınıf) {
       // this.name = name;
        setName(name);
      //  this.age = age;
        setAge(age);
        this.sınıf = sınıf;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
       this.age = age;

    }



    public void setSınıf(String sınıf) {
        this.sınıf = sınıf;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSınıf() {
        return sınıf;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sınıf='" + sınıf + '\'' +
                '}';
    }
}
